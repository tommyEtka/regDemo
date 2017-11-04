package com.reg.confirm.regDemo.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.reg.confirm.regDemo.springboot.data.User;

public interface UserRepository extends PagingAndSortingRepository<User, Integer>{

}
