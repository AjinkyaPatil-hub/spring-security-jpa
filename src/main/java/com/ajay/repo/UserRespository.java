package com.ajay.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ajay.Entity.UserEntity;

@Repository
public interface UserRespository extends JpaRepository<UserEntity,Integer> {

		Optional<UserEntity> findByUsername(String userName);
}
