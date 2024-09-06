import java.util.java.*;

class AgeException()
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
it age;
System.out.println("enter age:");
age=sc.nextInt();
try{
if(age<18)
{
throw new AgeExcetpion();
}
else
{
System.out.println("eligible to vote");
}
}
catch()
{
System.out.println(e);
}
}
}