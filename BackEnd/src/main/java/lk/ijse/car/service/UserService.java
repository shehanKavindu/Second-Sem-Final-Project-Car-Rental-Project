package lk.ijse.car.service;


import lk.ijse.car.dto.UserDTO;

public interface UserService {
    ArrayList<UserDTO> getAllRegUsers();

    UserDTO getRegUsers(String username, String password);

}
