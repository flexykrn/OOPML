class Thread1 extends Thread
{
	public void run()
	{
		for(int i=1;i<11;i++)
		System.out.println("3*"+i+"="+(3*i));
	}
}
class Thread2 extends Thread
{
	public void run()
	{
		for(int i=1;i<11;i++)
		System.out.println("6*"+i+"="+(6*i));
	}
}
class Thread3 extends Thread
{
	public void run()
	{
		for(int i=1;i<11;i++)
		System.out.println("9*"+i+"="+(9*i));
	}
}
class DemoThread
{
	public static void main(String args[])
	{
	Thread1 t1=new Thread1();
	t1.start();
	Thread2 t2=new Thread2();
	try{
		Thread.sleep(400);
		t2.start();
	}
    catch(Exception e){}
	Thread3 t3=new Thread3();
try{
		Thread.sleep(1000);
		t3.start();
	}
	catch(Exception e){}
	}
}
