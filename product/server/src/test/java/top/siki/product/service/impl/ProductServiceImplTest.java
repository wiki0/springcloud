package top.siki.product.service.impl;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import top.siki.product.common.DecreaseStockInput;
import top.siki.product.service.ProductService;
import top.siki.product.service.ProductServiceTest;

import java.util.Arrays;


public class ProductServiceImplTest extends ProductServiceTest {

    @Autowired
    private ProductService productService;

    @Test
    public void findUpAll() {
    }

    @Test
    public void findList() {
    }

    @Test
    public void decreaseStock() throws Exception{
        DecreaseStockInput decreaseStockInput = new DecreaseStockInput("157875196366160022",2);
        productService.decreaseStock(Arrays.asList(decreaseStockInput));
    }
}