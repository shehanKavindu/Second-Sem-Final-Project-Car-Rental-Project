package lk.ijse.car.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;



@RestController
@CrossOrigin
@RequestMapping("/income")
public class IncomeController {
    @Autowired
    private IncomeService service;

    @ResponseStatus(HttpStatus.CREATED)
    @GetMapping(path = "/dailyIncome")
    public @ResponseBody ArrayList<IncomeDTO> dailyIncome() {
        return service.dailyIncome();
    }

    @ResponseStatus(HttpStatus.CREATED)
    @GetMapping(path = "/monthlyIncome")
    public @ResponseBody ArrayList<IncomeDTO> monthlyIncome() {
        return service.monthlyIncome();
    }

    @ResponseStatus(HttpStatus.CREATED)
    @GetMapping(path = "/AnnuallyIncome")
    public @ResponseBody ArrayList<IncomeDTO> AnnuallyIncome() {
        return service.AnnuallyIncome();
    }
}
