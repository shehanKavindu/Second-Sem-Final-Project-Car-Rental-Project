package lk.ijse.car.service;

import lk.ijse.car.dto.IncomeDTO;

import java.util.ArrayList;

public interface IncomeService {
    ArrayList<IncomeDTO> dailyIncome();
    ArrayList<IncomeDTO> monthlyIncome();
    ArrayList<IncomeDTO> AnnuallyIncome();
}
