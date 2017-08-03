package com.acehouhao.service;

import com.acehouhao.common.ServerResponse;
import com.acehouhao.pojo.Product;

/**
 * Created by Hao HOU on 2017/8/3.
 */
public interface IProductService {
    ServerResponse saveOrUpdateProduct(Product product);
    ServerResponse<String> setSaleStatus(Integer productId, Integer status);
}
