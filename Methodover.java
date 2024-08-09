import java.util.*;
class Methodover
{
int a,b;
double c,d;

public void sum(int x,int y)
{
a=x;
b=y;
System.out.println(a+b);
}

public void sum(double x,double y)
{
c=x;
d=y;
System.out.println(b+c);
}

public static void main(String args[])
{

Methodover m=new Methodover();
m.sum(20,30);
m.sum(20.1,30.1);
}
}
