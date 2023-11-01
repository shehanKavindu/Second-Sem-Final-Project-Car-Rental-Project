package lk.ijse.car.service;


import lk.ijse.car.dto.AdminDTO;

import java.util.ArrayList;

public interface AdminService {
    void saveAdmin(AdminDTO dto);
    void updateAdmin(AdminDTO dto);
    void deleteAdmin(String reg_ID);
    ArrayList<AdminDTO> getAllAdmin();
}
