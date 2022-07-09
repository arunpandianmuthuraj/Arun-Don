package arun;



class Aravind extends Thread
{
	public void r() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Arun Rockzz");
		}
	}
}
class Kumar extends Aravind implements Runnable
{
	public void run() {
		for (int i = 0; i < 4; i++) {
			System.out.println("pandian rockzzz");
			
		}
	}
}




public class MultipleThreadsUsingRunnable {
	public static void main(String[] args) {
		
  Kumar a=new Kumar();
  a.r();
  Thread a1=new Thread(a);
  a1.start();

}
}























//
//
//class Arun extends Thread
//{
//
//	public void run(){
//		for (int i = 0; i < 4; i++) {
//			
//		
//		
//			System.out.println("Arun Born To Rule the World");
//		}
//	}
//}
//class Arun1 implements Runnable
//{
//	public void run() {
//	for (int i = 0; i < 6; i++) {
//		
//			System.out.println("pandin Born To Rule the World");
//		}
//	}
//}
//public class MultipleThreadsUsingRunnable extends Arun1
//{
//	public static void main(String[] args) {
//	
//		
//		Runnable a2=new Arun1();
//		
//		Thread   t2  =new Thread(a2);
//
//		t2.start();
//		
//		
//		
//	}
//} 
