package com.acehouhao.service;

import com.acehouhao.common.ServerResponse;
import com.acehouhao.vo.OrderVo;
import com.github.pagehelper.PageInfo;

import java.util.Map;

/**
 * Created by Hao HOU on 2017/8/9.
 */
public interface IOrderService {
    ServerResponse pay(Long orderNo, Integer userId, String path);

    ServerResponse aliCallback(Map<String, String> params);

    ServerResponse queryOrderPayStstus(Integer userId, Long orderNo);

    ServerResponse createOrder(Integer userId, Integer shippingId);

    ServerResponse<String> cancel(Integer userId, Long orderNo);

    ServerResponse getOrderCartProduct(Integer userId);

    ServerResponse<OrderVo> getOrderDetail(Integer userId, Long orderNo);

    ServerResponse<PageInfo> getOrderList(Integer userId, int pageNum, int pageSize);

    //backend

    ServerResponse<PageInfo> manageList(int pageNum, int pageSize);

    ServerResponse<OrderVo> manageDetail(Long orderNo);

    ServerResponse<PageInfo> manageSearch(Long orderNo, int pageNum, int pageSize);

    ServerResponse<String> manageSendGoods(Long orderNo);
}
