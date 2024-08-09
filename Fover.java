public class Fover
{
double r;
int l,b;

public void area(double r)
{
System.out.println("Area of circle"+3.14*r*r);
}
public void area(int l)
{
System.out.println("Area of square"+l*l);
}
public void area(int l,int b)
{
System.out.println("Area of rect"+l*b);
}

public static void main(String args[])
{
Fover f=new Fover();
f.area(5.4);
f.area(5);
f.area(5,4);
}

}