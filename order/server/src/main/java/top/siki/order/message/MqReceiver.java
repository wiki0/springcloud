package top.siki.order.message;//package top.siki.order.message;
//
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.amqp.rabbit.annotation.Exchange;
//import org.springframework.amqp.rabbit.annotation.Queue;
//import org.springframework.amqp.rabbit.annotation.QueueBinding;
//import org.springframework.amqp.rabbit.annotation.RabbitListener;
//import org.springframework.stereotype.Component;
//
///**
// * @author: wiki
// * @date: 2018/4/20
// * @description: 接受mq消息
// */
//@Slf4j
//@Component
//public class MqReceiver {
//
//    @RabbitListener(bindings = @QueueBinding(
//            value = @Queue("myOrder"),
//            key = "computer",
//            exchange = @Exchange("computerOrder")
//    ))
//    public void computer(String message) {
//        log.info("computerOrder: {}", message);
//    }
//
//    @RabbitListener(bindings = @QueueBinding(
//            value = @Queue("myOrder"),
//            key = "fruit",
//            exchange = @Exchange("fruitOrder")
//    ))
//    public void fruit(String message) {
//        log.info("fruit: {}", message);
//    }
//}
