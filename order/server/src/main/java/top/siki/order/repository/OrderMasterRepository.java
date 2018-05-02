package top.siki.order.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import top.siki.order.dataobject.OrderMaster;

/**
 * 2017-12-10 16:11
 * @author wiki
 */
public interface OrderMasterRepository extends JpaRepository<OrderMaster, String> {

}
