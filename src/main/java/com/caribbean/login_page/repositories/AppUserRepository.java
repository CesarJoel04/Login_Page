package com.caribbean.login_page.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.caribbean.login_page.models.AppUser;

public interface AppUserRepository extends JpaRepository<AppUser, Integer>{

	public AppUser findByEmail(String email);
}
