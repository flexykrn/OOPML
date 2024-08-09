import java.util.*;
public class Square{
int l,peri,area;


public void accept(){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the length");
l=sc.nextInt();
peri=l*4;
area=l*l;

}

public void display(){
System.out.println("Peirmeter is :"+peri);
System.out.println("area is :"+area);
}

public static void main(String args[]){

Square s1=new Square();
s1.accept();
s1.display();
}
}