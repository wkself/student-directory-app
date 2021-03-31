package com.company;

public class Address {

    private String email;
    private String phoneNumber;

    public Address(String e, String p){
        setEmail(e);
        setPhoneNumber(p);
    }

    public void setAddress(String p, String em){
        setPhoneNumber(p);
        setEmail(em);
    }

    public void setEmail(String e){
        email = e;
    }

    public void setPhoneNumber(String p){
        phoneNumber = p;
    }

    public String getPhoneNumbber(){
        return phoneNumber;
    }

    public String getEmail(){
        return email;
    }

    public Address(){

    }

}
