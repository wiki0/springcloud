package top.siki.order.service;


import top.siki.order.dto.OrderDTO;

/**
 * 2017-12-10 16:39
 * @author wiki
 */
public interface OrderService {

    /**
     * 创建订单
     * @param orderDTO
     * @return
     */
    OrderDTO create(OrderDTO orderDTO);

    /**
     * 完结订单（只能卖家操作）
     * @param orderId
     * @return
     */
    OrderDTO finish(String orderId);
}
