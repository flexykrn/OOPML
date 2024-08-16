class Parent{
int x;
}
class Child extends Parent{
int y;

public void accept()
{
x=10;
y=20;
}
public void display()
{
System.out.println(x);
System.out.println(y);
}

public static void main(String[] args)
{
Child c=new Child();
c.accept();
c.display();
}

}
