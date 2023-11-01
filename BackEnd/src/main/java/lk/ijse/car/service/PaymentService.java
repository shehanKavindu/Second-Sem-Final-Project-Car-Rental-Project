package lk.ijse.car.service;


import lk.ijse.car.dto.CustomDTO;
import lk.ijse.car.dto.PaymentDTO;

import java.util.ArrayList;

public interface PaymentService {
    CustomDTO paymentIdGenerate();
    void savePayment(PaymentDTO dto, String rentID);
    ArrayList<PaymentDTO> getAllPayment();
}
