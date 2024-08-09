import java.util.*;
public class Student{
int marks ,rollno;
String name;

public void accept(){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the rollno");
rollno=sc.nextInt();

System.out.println("Enter the name of student :");
name=sc.next();

System.out.println("Enter the marks ");
marks=sc.nextInt();
}

public void display(){
System.out.println("Rollno : "+rollno);
System.out.println("Name : "+name);
System.out.println("Marks : "+marks);
}

public static void main(String args[]){

Student s1=new Student();
s1.accept();
s1.display();
}
}