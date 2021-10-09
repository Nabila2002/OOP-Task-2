package nabila;

public class Student {
    String  name;
    int id;
    static String universityName;
    Student()
    {
        System.out.println("The information of student given below");
        universityName = "Leading University";
    }
    Student(String name)
    {
        this.name = name;
    }
    Student(String name,int id)
    {
        this.name=name;
        this.id=id;
        System.out.println("Student name :"+this.name);
        System.out.println("Student id no : "+this.id);
    }
    void display()
    {
        System.out.println("University name :"+universityName);
    }
}
/*Name : Nabila Zannat
Id no: 2012020098
sec:5(B)
Email: cse_2012020098@lus.ac.bd
Date : 9/8/2021
 */