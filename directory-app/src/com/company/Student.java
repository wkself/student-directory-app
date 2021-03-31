package com.company;

public class Student extends Person implements BirthDateCalculate{

    Contact studentAddress = new Contact();
    Name studentName = new Name();
    private String major;
    private String favClass;
    private String gradDate;
    private String hogWarts;
    private String isGradStudent;

    public void setMajor(String a) {major = a;}
    public void setFavClass(String a) {favClass = a;}
    public void setGradDate(String a) {gradDate = a;}
    public void setHogWarts(String a) {hogWarts = a;}
    public void setIsGradStudent(String a) {isGradStudent = a;}

    public String getMajor() {return major;}
    public String getGradDate() {return gradDate;}
    public String getHogWarts() {return hogWarts; }
    public String getIsGradStudent() {return isGradStudent;}





    public Student(String a, String b, String c, String d, String e, String f, String g, String h,
                    String k, String l, String m, String o, String p, String q, String r)
    {
        studentName.setName(a, b, c);
        studentAddress.setContact(d, e, f, g, h);
        setAge(calculateAge(k));
        setBirthday(k);
        setPurdueID(l);
        setMajor(m);
        setFavClass(o);
        setGradDate(p);
        setHogWarts(q);
        setIsGradStudent(r);


    }

    public Student()
    {

    }
    @Override
    public int calculateAge(String b){
        int bday = Integer.parseInt(b.substring(6));
        return (2018 - bday);
    }

}
