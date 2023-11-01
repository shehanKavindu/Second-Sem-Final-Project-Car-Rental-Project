package lk.ijse.car.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
@Entity
public class Rent {
    @Id
    private String rentID;
    private LocalDate pickUpDate;
    private LocalTime pickUpTime;
    private LocalDate returnDate;
    private LocalTime returnTime;
    @Enumerated(EnumType.STRING)
    g
    @Enumerated(EnumType.STRING)
    private RentRequest rentType;
    private String location;

    @ManyToOne(cascade = {CascadeType.REFRESH, CascadeType.DETACH})
    @JoinColumn(name = "userID", referencedColumnName = "user_Id", nullable = false)
    private com.easy.car_rental.entity.Reg_User regUser;

    @OneToMany(mappedBy = "rent", cascade = CascadeType.ALL)
    private List<com.easy.car_rental.entity.RentDetails> rentDetails;

}