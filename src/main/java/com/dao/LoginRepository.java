package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.Login;

public interface LoginRepository extends JpaRepository<Login,Integer> {

	Login findByEmail(Login login);

}
