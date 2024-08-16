class P1
{
int x=10;
}
class P2
{
int y=20;
}


class Childmulti extends p1,p2
{
pubic void display()
{
System.out.println(x);
System.out.println(y);
}
public static void main(String[] args)
{
Childmulti c=new Childmulti();
c.display();

}
