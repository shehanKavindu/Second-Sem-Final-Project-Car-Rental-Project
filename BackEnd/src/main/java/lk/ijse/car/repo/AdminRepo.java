package lk.ijse.car.repo;


import lk.ijse.car.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepo extends JpaRepository<Admin, String> {
}
