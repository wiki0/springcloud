package top.siki.product.service;


import top.siki.product.dataobject.ProductCategory;

import java.util.List;

/**
 * 类目
 * 2017-12-09 22:06
 * @author wiki
 */
public interface CategoryService {

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}
