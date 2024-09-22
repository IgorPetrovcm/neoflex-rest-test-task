package ru.neoflex.petrovcm;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.neoflex.petrovcm.core.usecases.PayrollCalculator;

@RestController
public class PayrollVacationDaysController {
    private final PayrollCalculator calculator;

    public PayrollVacationDaysController(PayrollCalculator payrollCalculator){
        calculator = payrollCalculator;
    }
    
    @RequestMapping("/calculate")
    public double getVacationSalaries(
        @RequestParam(required=true) double averageSalary,
        @RequestParam(required=true) int vacationDays
    )
    {
        return calculator.vacationSalary(averageSalary, vacationDays);
    }
}