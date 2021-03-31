package com.company;

public class Name {

    private String firstName;
    private String middleInitial;
    private String lastName;

    public Name(String fn, String mn, String ln){

        setFirstName(fn);
        setLastName(ln);
        setMiddleInitial(mn);
    }

    public void setFirstName(String fn){
        firstName = fn;
    }

    public void setMiddleInitial(String mn){
        middleInitial = mn;
    }

    public void setLastName(String ln){
        lastName = ln;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getMiddleInitial(){
        return middleInitial;
    }

    public void setName(String fn, String mn, String ln){
        setFirstName(fn);
        setMiddleInitial(mn);
        setLastName(ln);
    }

    public Name(){

    }
}
