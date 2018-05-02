package top.siki.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import top.siki.product.dataobject.ProductCategory;

import java.util.List;

/**
 * 2017-12-09 21:41
 * @author wiki
 */
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Integer> {

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}
