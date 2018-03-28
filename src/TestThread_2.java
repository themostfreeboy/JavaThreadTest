//Runnable接口方式
public class TestThread_2 
{
	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		new Thread(new MyThread3(),"thread3").start();
		new Thread(new MyThread4(),"thread4").start();
	}
}
