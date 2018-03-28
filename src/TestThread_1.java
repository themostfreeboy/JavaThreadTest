//¼Ì³ÐThread·½Ê½
import java.lang.Thread;
public class TestThread_1
{
	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		Thread thread1=new MyThread1();
		Thread thread2=new MyThread2();
		thread1.start();
		thread1.sleep(1000);
		thread2.start();
	}
}
