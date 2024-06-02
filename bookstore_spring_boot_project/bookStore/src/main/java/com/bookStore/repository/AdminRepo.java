package com.bookStore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookStore.entity.Admin;

@Repository
public interface AdminRepo extends JpaRepository<Admin, Integer>{

}
