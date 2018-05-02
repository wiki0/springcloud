package top.siki.order.message;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;
import top.siki.order.utils.JsonUtil;
import top.siki.product.common.ProductInfoOutput;

import java.util.List;

/**
 * @author: wiki
 * @date: 2018/4/20
 * @description:
 */
@Component
@Slf4j
public class ProductInfoReceiver {

    private static final String PRODUCT_STOCK_TEMPLATE = "product_stock_%s";
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @RabbitListener(queuesToDeclare = @Queue("productInfo"))
    public void computer(String message) {
        List<ProductInfoOutput> productInfoOutputList = JsonUtil.toArrayList(message, ProductInfoOutput.class);
        log.info("productInfoOutput: {}", productInfoOutputList);

        for (ProductInfoOutput productInfoOutput : productInfoOutputList){
            stringRedisTemplate.opsForValue().set(String.format(PRODUCT_STOCK_TEMPLATE, productInfoOutput.getProductId()), String.valueOf(productInfoOutput.getProductStock()));
        }
    }

}
