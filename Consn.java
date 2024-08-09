public class Consn
{
int b,h;

Consn(int x,int y)
{
this.b=x;
this.h=y;
System.out.println("Area of Triange "+(0.5*b*h));
}

Consn()
{
b=2;
h=5;
System.out.println("Area of Triange "+(0.5*b*h));
}

public static void main(String args[])
{
Consn c=new Consn(7,8);
Consn c1=new Consn();

}
}
