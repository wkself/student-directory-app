package com.company;

public class Person{

    Name myName = new Name();
    Contact myContact = new Contact();
    Address myAddress = new Address();
    private String purdueID;
    private int age;
    private String birthday;






    //MARK: Set methods


    public void setPurdueID(String pid){
        purdueID = pid;
    }
    public void setAge(int a)
    {
        age = a;
    }
    public void setBirthday(String b) {birthday = b;}



    //MARK: Get methods

    public String getPurdueID(){
        return purdueID;
    }
    public int getAge() {return age;}
    public String getBirthday() {return birthday;}

    //MARK: Required methods



    //MARK: Constructors


    public Person(String fn, String mn, String ln, String pid, String a, String b, String c, String d, String e, String f, String p, String em, int pp, String dd)
    {
        setPurdueID(pid);
        setAge(pp);
        setBirthday(dd);
        myName.setName(fn, mn, ln);
        myContact.setContact(a, b, c, d, e);
        myAddress.setAddress(p, em);
    }

    public Person(){

    }




}
