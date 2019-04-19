package com.yaosiyuan.fegin;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;

import com.yaosiyuan.api.order.OrderService;

@Component
@FeignClient("order")
public interface OrderServiceFegin extends OrderService {

}
