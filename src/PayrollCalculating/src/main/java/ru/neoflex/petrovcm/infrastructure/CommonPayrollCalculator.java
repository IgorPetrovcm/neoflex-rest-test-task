package ru.neoflex.petrovcm.infrastructure;

import ru.neoflex.petrovcm.core.usecases.PayrollCalculator;;;

public class CommonPayrollCalculator implements PayrollCalculator {
    @Override
    public double vacationSalary(double averageSalary, int days){
        return (averageSalary / 29.3) * days;
    }
}
