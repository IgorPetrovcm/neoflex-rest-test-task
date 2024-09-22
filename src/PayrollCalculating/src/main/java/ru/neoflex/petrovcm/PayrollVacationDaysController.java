package ru.neoflex.petrovcm;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class PayrollVacationDaysController {
    @RequestMapping("/vacation_salaries")
    public double getVacationSalaries(
        @RequestParam(required=false) double averageSalary,
        @RequestParam(required=false) int vacationDays
    )
    {
        return (averageSalary / 29.3) * vacationDays;
    }
}
