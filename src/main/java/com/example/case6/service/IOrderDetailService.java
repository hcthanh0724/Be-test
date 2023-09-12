package com.example.case6.service;

import com.example.case6.model.Order;
import com.example.case6.model.OrderDetail;

import java.util.List;

public interface IOrderDetailService {
    OrderDetail save(OrderDetail orderDetail);
    List<OrderDetail> getAllOrdersDetailByOrderId(long idOrder);
    void deleteByOrderId(long idOrder);
}
