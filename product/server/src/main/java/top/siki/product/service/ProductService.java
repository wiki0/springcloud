package top.siki.product.service;


import top.siki.product.common.DecreaseStockInput;
import top.siki.product.dataobject.ProductInfo;

import java.util.List;

/**
 * 2017-12-09 21:57
 * @author wiki
 */
public interface ProductService {

    /**
     * 查询所有在架商品列表
     */
    List<ProductInfo> findUpAll();

    List<ProductInfo> findList(List<String> productIdList);

    /**
     * 扣库存
     */
    void decreaseStock(List<DecreaseStockInput> decreaseStockInputList);

}
