package top.siki.order.message;//package top.siki.order.message;
//
//import org.springframework.cloud.stream.annotation.Input;
//import org.springframework.cloud.stream.annotation.Output;
//import org.springframework.messaging.MessageChannel;
//import org.springframework.messaging.SubscribableChannel;
//
///**
// * @author: wiki
// * @date: 2018/4/20
// * @description:
// */
//public interface StreamClient {
//
//    String INPUT = "myMessage";
//
//    @Input(StreamClient.INPUT)
//    SubscribableChannel input();
//
//    @Output(StreamClient.INPUT)
//    MessageChannel output();
//}
