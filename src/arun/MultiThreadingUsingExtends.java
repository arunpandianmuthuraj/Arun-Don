package arun;


class Pandian extends Thread
{
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Arun Rockzz");
		}
	}
}
class Ram extends Thread
{
	public void run() {
		for (int i = 0; i < 4; i++) {
			System.out.println("pandian rockzzz");
			
		}
	}
}

class Demo extends Thread{
	public void run() {
		System.out.println("arunn ");
	}
}


public class MultiThreadingUsingExtends {
	public static void main(String[] args) {
		

	Pandian p = new Pandian();
	Ram a=new Ram();
    Demo b = new Demo();
	p.start();
    a.start();
    b.start();
	
	

}
}