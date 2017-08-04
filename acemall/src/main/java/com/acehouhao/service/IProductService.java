package com.acehouhao.service;

import com.acehouhao.common.ServerResponse;
import com.acehouhao.pojo.Product;
import com.acehouhao.vo.ProductDetailVo;
import com.github.pagehelper.PageInfo;

/**
 * Created by Hao HOU on 2017/8/3.
 */
public interface IProductService {
    ServerResponse saveOrUpdateProduct(Product product);
    ServerResponse<String> setSaleStatus(Integer productId, Integer status);
    ServerResponse<ProductDetailVo> manageProductDetail(Integer productId);
    ServerResponse<PageInfo> getProductList(int pageNum, int pageSize);
    ServerResponse<PageInfo> searchProduct(String productName, Integer productId, int pageNum, int pageSize);
}
