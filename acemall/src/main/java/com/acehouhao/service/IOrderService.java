package com.acehouhao.service;

import com.acehouhao.common.ServerResponse;

import java.util.Map;

/**
 * Created by Hao HOU on 2017/8/9.
 */
public interface IOrderService {
    ServerResponse pay(Long orderNo, Integer userId, String path);

    ServerResponse aliCallback(Map<String, String> params);

    ServerResponse queryOrderPayStstus(Integer userId, Long orderNo);
}
