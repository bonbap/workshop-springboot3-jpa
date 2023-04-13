package com.bon.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bon.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
