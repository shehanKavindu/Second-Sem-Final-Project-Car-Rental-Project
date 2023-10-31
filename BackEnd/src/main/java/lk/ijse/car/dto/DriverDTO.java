package lk.ijse.car.dto;

import com.easy.car_rental.embeded.Name;
import com.easy.car_rental.enums.AvailabilityType;
import lk.ijse.car.embeded.Name;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.web.multipart.MultipartFile;


@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class DriverDTO {

    private UserDTO user;

}
