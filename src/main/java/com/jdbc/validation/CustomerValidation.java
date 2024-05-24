package com.jdbc.validation;

import com.jdbc.model.Customer;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class CustomerValidation implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return Customer.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Customer customer = (Customer) target;
        if (customer.getId() == 0||customer.getId() <10){
            errors.rejectValue("id","id.error","please check ,ID should not be 0 and lessthen 10");
        }

    }
}
