package com.bon.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bon.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
