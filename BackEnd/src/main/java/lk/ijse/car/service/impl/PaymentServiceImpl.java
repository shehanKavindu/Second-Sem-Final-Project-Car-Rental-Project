package lk.ijse.car.service.impl;

import lk.ijse.car.dto.CustomDTO;
import lk.ijse.car.dto.PaymentDTO;
import lk.ijse.car.entity.Payment;
import lk.ijse.car.entity.Rent;
import lk.ijse.car.repo.CarRepo;
import lk.ijse.car.repo.DriverRepo;
import lk.ijse.car.repo.PaymentRepo;
import lk.ijse.car.repo.RentRepo;
import lk.ijse.car.service.PaymentService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



@Service
@Transactional
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    private PaymentRepo paymentRepo;

    @Autowired
    private RentRepo rentRepo;
    @Autowired
    private CarRepo carRepo;
    @Autowired
    private DriverRepo driverRepo;

    @Autowired
    private ModelMapper mapper;
    @Override
    public CustomDTO paymentIdGenerate() {
        return new CustomDTO(paymentRepo.getLastIndex());
    }

    @Override
    public void savePayment(PaymentDTO dto, String rentID) {
        Payment payment = mapper.map(dto, Payment.class);
        Rent rent = rentRepo.findById(rentID).get();
        if (rent.getRentDetails().get(0).getDriverID() != null) {

            Driver drivers = driverRepo.findById(rent.getRentDetails().get(0).getDriverID()).get();
            drivers.setDriverAvailability(AVAILABLE);
            driverRepo.save(drivers);

            Car car = carRepo.findById(rent.getRentDetails().get(0).getCarID()).get();
            car.setVehicleAvailabilityType(UNDER_MAINTAIN);
            carRepo.save(car);

            rent.setRentType(PAY);
            rentRepo.save(rent);
        }
        if (rent.getRentDetails().get(0).getDriverID() == null) {
            Car car = carRepo.findById(rent.getRentDetails().get(0).getCarID()).get();
            car.setVehicleAvailabilityType(UNDER_MAINTAIN);
            carRepo.save(car);

            rent.setRentType(PAY);
            rentRepo.save(rent);
        }
        paymentRepo.save(payment);
    }

    @Override
    public ArrayList<PaymentDTO> getAllPayment() {
        return mapper.map(paymentRepo.findAll(), new TypeToken<ArrayList<PaymentDTO>>() {
        }.getType());
    }
}
