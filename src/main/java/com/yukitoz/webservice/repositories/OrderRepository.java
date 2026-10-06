package com.yukitoz.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yukitoz.webservice.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

    

}
