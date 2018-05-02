package top.siki.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import top.siki.product.dataobject.ProductInfo;

import java.util.List;

/**
 * 2017-12-09 21:29
 * @author wiki
 */
public interface ProductInfoRepository extends JpaRepository<ProductInfo, String> {

    List<ProductInfo> findByProductStatus(Integer productStatus);

    List<ProductInfo> findByProductIdIn(List<String> productIdList);
}
