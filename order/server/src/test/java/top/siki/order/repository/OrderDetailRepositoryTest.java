package top.siki.order.repository;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;
import top.siki.order.dataobject.OrderDetail;

import java.math.BigDecimal;
import java.util.Date;

@Component
public class OrderDetailRepositoryTest extends OrderMasterRepositoryTest{
    @Autowired
    private OrderDetailRepository orderDetailRepository;

    @Autowired
    private AmqpTemplate amqpTemplate;
    @Test
    public void testSave() {
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setDetailId("12367");
        orderDetail.setOrderId("123456");
        orderDetail.setProductIcon("http://xxx.com");
        orderDetail.setProductId("157875196366160022");
        orderDetail.setProductName("皮蛋粥");
        orderDetail.setProductPrice(new BigDecimal(0.01));
        orderDetail.setProductQuantity(2);

        OrderDetail result = orderDetailRepository.save(orderDetail);
        Assert.assertTrue(result != null);
    }

    @Test
    public void send() {
        amqpTemplate.convertAndSend("myQueue",new Date());
    }

}