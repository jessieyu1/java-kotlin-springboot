package com.jessie.learning.jpa.japin10steps.service;

import com.jessie.learning.jpa.japin10steps.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<User, Long> {
}
