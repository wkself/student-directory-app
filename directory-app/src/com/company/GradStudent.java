package com.company;

public class GradStudent extends Student {

   Name advisorName = new Name();
   private String thesisTitle;
   public void setThesisTitle(String a) {thesisTitle = a;}
   public String getThesisTitle() {return thesisTitle;}



   public GradStudent(String a, String b, String c, String d, String e, String f, String g, String h,
                      String k, String l, String o, String m, String p, String q, String r,
                      String s, String t, String u, String v)
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
       advisorName.setName(s, t, u);
       setThesisTitle(v);

   }


}
