package com.acehouhao.service;

import com.acehouhao.common.ServerResponse;
import com.acehouhao.pojo.Shipping;
import com.github.pagehelper.PageInfo;

/**
 * Created by Hao HOU on 2017/8/8.
 */
public interface IShippingService {
    ServerResponse add(Integer userId, Shipping shipping);

    ServerResponse<String> del(Integer userId, Integer shippingId);

    ServerResponse update(Integer userId, Shipping shipping);

    ServerResponse<Shipping> select(Integer userId, Integer shippingId);

    ServerResponse<PageInfo> list(Integer userId, int pageNum, int pageSize);
}
