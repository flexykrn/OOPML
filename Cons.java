public class Cons
{
int b,h;

Cons(int x,int y)
{
this.b=x;
this.h=y;
System.out.println("Area of Triange "+(0.5*b*h));
}

public static void main(String args[])
{
Cons c=new Cons(7,8);
}
}
