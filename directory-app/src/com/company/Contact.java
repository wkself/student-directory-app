package com.company;

public class Contact {

    private String streetAddress;
    private String streetAddress2;
    private String city;
    private String state;
    private String zipcode;


    public void setContact(String a, String b, String c, String d, String e){
        setStreetAddress(a);
        setStreetAddress2(b);
        setCity(c);
        setState(d);
        setZipcode(e);
    }


    public void setStreetAddress(String sA){
        streetAddress = sA;
    }

    public void setStreetAddress2(String sAA){
        streetAddress2 = sAA;
    }

    public void setCity(String c){
        city = c;
    }

    public void setState(String s){
        state = s;
    }

     public void setZipcode(String z){
        zipcode = z;
     }



     public String getStreetAddress(){
        return streetAddress;
     }

     public String getStreetAddress2(){
        return streetAddress2;
     }

     public String getCity(){
        return city;
     }

     public String getState(){
        return state;
     }

     public String getZipcode(){
        return zipcode;
     }

    public Contact(String sA, String sAA, String c, String s, String z, String co){
        setStreetAddress(sA);
        setStreetAddress2(sAA);
        setCity(c);
        setState(s);
        setZipcode(z);
    }

     public Contact(){

     }
}
