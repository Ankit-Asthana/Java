import java.util.function.*;
import java.util.*;
class Student{
    String name;
    int marks;
    Student(String s,int i){
        this.name=s;
        this.marks=i;
    }
}
public class FuncStudentGrade {
    public static void main(String[] sohdf){
    Function<Student,String> f= s->{
        int marks=s.marks;
        String grade="";
        if(marks>=80) grade="A[Distinction]";
        else if(marks>=60) grade="B";
        else if(marks>=50) grade="C";
        else if(marks>=35) grade="D";
        else grade="E[Fail]";
        return grade;
    };
    Predicate<Student> p = s->s.marks>60;
    Consumer<Student> c= co->{
        System.out.println("Student Name= "+co.name);
        System.out.println("Student Marks= "+co.marks);
        System.out.println("Student Grade= "+f.apply(co));
    };
    Student[] sss={new Student("Ankit",74),new Student("Aryan",80),new Student("Aditya",31),new Student("PP",55)};
    /* for(Student x:s){
        if(p.test(x))
        {
            System.out.print(x.name+" ");
            System.out.print(x.marks+" ");
            System.out.println(f.apply(x)+" ");
        }
    } */
    for(Student stud :sss){
        //if(p.test(stud))
            c.accept(stud);
    }
}
}
