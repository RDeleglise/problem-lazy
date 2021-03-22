package bd.com.penguin.lzyrest.controller;

import bd.com.penguin.lzyrest.domain.Order;
import bd.com.penguin.lzyrest.domain.OrderItem;
import bd.com.penguin.lzyrest.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author bashir
 * @since 7/17/19
 */

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/orders")
public class OrderController {
    @Autowired
    OrderRepository orderRepository;

    @GetMapping(value = "/list")
    public List<Order> getOrders() {
        List<Order> orders = orderRepository.findAll();
        return orders;
    }
}