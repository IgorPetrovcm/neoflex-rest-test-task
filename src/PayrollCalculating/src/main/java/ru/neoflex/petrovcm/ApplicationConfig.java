package ru.neoflex.petrovcm;

import ru.neoflex.petrovcm.core.usecases.PayrollCalculator;
import ru.neoflex.petrovcm.infrastructure.CommonPayrollCalculator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {
    @Bean
    public PayrollCalculator payrollCalculator(){
        return new CommonPayrollCalculator();
    }
}
