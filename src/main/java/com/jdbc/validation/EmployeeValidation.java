//package com.jdbc.validation;
//
//import org.springframework.validation.Errors;
//import org.springframework.validation.Validator;
//
//public class EmployeeValidation implements Validator {
//    @Override
//    public boolean supports(Class<?> clazz) {
//        return Employee.class.isAssignableFrom(clazz);
//    }
//
//    @Override
//    public void validate(Object target, Errors errors) {
//        Employee employee  = (Employee) target;
//        if(checkId(employee.getId())){
//            errors.rejectValue("id","id.error","Please Enter Proper id :");
//        }
//        if(checkName(employee.getName())){
//            errors.rejectValue("name","name.error","Name does not allow Splecial Charecters");
//        }
//        if(checkEmail(employee.getEmail())){
//            errors.rejectValue("email","email.error","email must contains @skytechcommerce.com");
//        }
//        if(checkPassword(employee.getPassword())){
//            errors.rejectValue("password","email.error","please enter proper password");
//        }
//        if(checkAge(employee.getAge())){
//            errors.rejectValue("age","age.error","Age must greater than 16 years..");
//        }
//        if(checkAdhar(employee.getAdhar())){
//            errors.rejectValue("adhar","adhar.error","Adhar Contains 12 Digitss");
//        }
//        if(checkPan(employee.getPan())){
//            errors.rejectValue("pan","pan.error","please provide valid PAN ...");
//        }
//        if (checkPhone(employee.getPhone())){
//            errors.rejectValue("phone","phone.error","Please Enter Valid Phone Number");
//        }
//        if(checkPincode(employee.getPincode())){
//            errors.rejectValue("pincode","pincode.error","PINCODE contins 6 digit...");
//        }
//
//
//
//    }
//    public static boolean checkId(int id){
//
//        if(id  <= 0 || id>1000)
//            return true;
//        else
//            return false;
//    }
//    public static boolean checkName(String name){
//        if(!name.matches("[A-Za-z]+$") || name.equals(null)){
//            return true;
//        }else
//            return false;
//    }
//    public static boolean checkAge(int age){
//        if(age <=16)
//            return true;
//        else
//            return false;
//    }
//    public static boolean checkEmail(String mail){
//        if(!mail.matches("[a-z.0-9]{3,}@skytechcommerce.com"))
//            return true;
//        else
//            return false;
//    }
//    public static boolean checkPassword(String password){
//        if(!password.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$"))
//            return true;
//        else
//            return false;
//    }
//    public static boolean checkPincode(long pincode){;
//        if(String.valueOf(pincode).length() != 6)
//            return true;
//        else
//            return false;
//    }
//    public static boolean checkAdhar(long adhar){
//        if(!String.valueOf(adhar).matches("[2-9][0-9]{11}$"))
//            return true;
//        else
//            return false;
//    }
//    public static boolean checkPan(String pan){
//        if(!pan.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}$"))
//            return true;
//        else
//            return false;
//    }
//    public static boolean checkPhone(long phone){
//        if(!String.valueOf(phone).matches("[6-9]{1}[0-9]{9}$"))
//            return true;
//        else
//            return false;
//    }
//
//}
