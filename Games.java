import java.util.*;

class GreatNoException extends Exception{
public GreatNoException()
{
System.out.println("No is greater ");
}
}
class SmallNoException extends Exception
{
public SmallNoException()
{
System.out.println("No is smaller than correct No. ");
}
}

class Games 
{
public static void main(String args[])
{
int gn,cn;
Scanner sc=new Scanner(System.in);

while(true)
{
System.out.println("Enter between 1-100");
gn=sc.nextInt();
cn=67;
try{
if(gn>cn)
{
throw new GreatNoException();
}
else if (gn<cn)
{
throw new SmallNoException();
}
else{
System.out.println("YOu win");
break;
}
}
catch(GreatNoException e1)
{
}

catch(SmallNoException e2)
{
}
}
}
}