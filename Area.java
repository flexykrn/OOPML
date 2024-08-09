import java.util.*;
class Area{
	int a,b,area;
	
	public void operation()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter length");
		a=sc.nextInt();
		System.out.println("enter breadth");
		b=sc.nextInt();
	area=a*b;
	System.out.println("area is :"+area);
	}
	public static void main(String args[])
	{
		Area r=new Area();
		r.operation();
	}
}