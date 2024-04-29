package com.spring.data.jpa.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.data.jpa.demo.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	public List<User> findUsersByLastName(String lastName);
}
