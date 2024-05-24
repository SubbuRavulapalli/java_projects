package com.jdbc.service.serviceimpl;

import com.jdbc.dao.daoimpl.PaymentDaoimpl;
import com.jdbc.model.Payment;
import com.jdbc.service.PaymentService;

public class PaymentServiceimpl implements PaymentService {
    PaymentDaoimpl paymentDaoimpl;

    public PaymentDaoimpl getPaymentDaoimpl() {
        return paymentDaoimpl;
    }

    public void setPaymentDaoimpl(PaymentDaoimpl paymentDaoimpl) {
        this.paymentDaoimpl = paymentDaoimpl;
    }

    @Override
    public String addPayment(Payment payment) {
        try{
            paymentDaoimpl.addPayment(payment);
            System.out.println("payment inserted");
            return "sucessfull";
        }catch (Exception e){
            return "something wrong";
        }
    }
}
