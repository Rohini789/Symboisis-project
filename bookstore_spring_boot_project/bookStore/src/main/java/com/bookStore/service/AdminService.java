package com.bookStore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookStore.entity.Admin;
import com.bookStore.entity.Book;
import com.bookStore.repository.AdminRepo;

@Service
public class AdminService {
	@Autowired
	private AdminRepo ar;
	
	public void save(Admin ad) {
		ar.save(ad);
	}
	
	public List<Admin> getAll(){
		return ar.findAll();
	}
	
	public Admin getById(int id) {
		return ar.findById(id).get();
	}
	public void deleteById(int id) {
		ar.deleteById(id);
	}
}

