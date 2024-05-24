package com.jdbc.service.serviceimpl;

import com.jdbc.dao.daoimpl.AddressDaoimpl;
import com.jdbc.model.Address;
import com.jdbc.service.AddressService;

public class AddressServiceimpl implements AddressService {
    AddressDaoimpl addressDaoimpl;

    public AddressDaoimpl getAddressDaoimpl() {
        return addressDaoimpl;
    }

    public void setAddressDaoimpl(AddressDaoimpl addressDaoimpl) {
        this.addressDaoimpl = addressDaoimpl;
    }

    @Override
    public String addAddress(Address address) {
       try {
           addressDaoimpl.addAddress(address);
           System.out.println("address inserted");
           return  "sucessful";
       }
       catch (Exception e){
           return "something went wrong";
       }
    }
}
