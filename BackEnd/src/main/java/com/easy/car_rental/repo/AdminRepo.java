package com.easy.car_rental.repo;

import com.easy.car_rental.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepo extends JpaRepository<Admin, String> {
}
