package top.siki.order.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import top.siki.order.dataobject.OrderDetail;

import java.util.List;

/**
 * 2017-12-10 16:12
 * @author wiki
 */
public interface OrderDetailRepository extends JpaRepository<OrderDetail, String> {

    List<OrderDetail> findByOrderId(String orderId);
}
