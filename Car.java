import java.util.*;
class Cmodel
{
int modelno;
}
class Cprice extends Cmodel
{
int price;
}


class Car extends Cprice
{
String color;
public void getdata()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the car modelno");
modelno=sc.nextInt();
System.out.println("Enter the price of the car");
price=sc.nextInt();
System.out.println("Enter the color of the car");
color=sc.next();

}
public void print()
{
System.out.println(modelno);
System.out.println(price);
System.out.println(color);
}

public static void main(String[] args)
{
Car c=new Car();
c.getdata();
c.print();
}
}
