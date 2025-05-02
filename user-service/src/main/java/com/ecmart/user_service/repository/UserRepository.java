package com.ecmart.user_service.repository;

import com.ecmart.user_service.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>{
    User findByEmail(String email);
}