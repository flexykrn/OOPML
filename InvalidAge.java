import java.util.*;

class AgeException extends Exception
{
	public AgeException()
	{
		System.out.println("not eligible to vote");
	}
}

class InvalidAge{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int age;
System.out.println("enter age:");
age=sc.nextInt();
try{
if(age<18)
{
throw new AgeException();
}
else
{
System.out.println("eligible to vote");
}
}
catch(AgeException e)
{
System.out.println(e);
}
}
}