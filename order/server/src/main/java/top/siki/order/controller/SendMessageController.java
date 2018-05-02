package top.siki.order.controller;//package top.siki.order.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.messaging.support.MessageBuilder;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//import top.siki.order.message.StreamClient;
//
//import java.util.Date;
//
///**
// * @author: wiki
// * @date: 2018/4/20
// * @description:
// */
//@RestController
//public class SendMessageController {
//
//    @Autowired
//    private StreamClient streamClient;
//
//    @GetMapping("/sendMessage")
//    public void process() {
//        streamClient.output().send(MessageBuilder.withPayload(new Date()).build());
//    }
//
//}
