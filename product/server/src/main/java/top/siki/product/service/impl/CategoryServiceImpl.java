package top.siki.product.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.siki.product.dataobject.ProductCategory;
import top.siki.product.repository.ProductCategoryRepository;
import top.siki.product.service.CategoryService;

import java.util.List;

/**
 * 2017-12-09 22:06
 * @author wiki
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private ProductCategoryRepository productCategoryRepository;

    @Override
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList) {
        return productCategoryRepository.findByCategoryTypeIn(categoryTypeList);
    }
}
