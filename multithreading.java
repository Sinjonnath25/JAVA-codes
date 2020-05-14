class Test1 extends Thread{
	public void run(){
		for(int i=1;i<=10;i++){
			System.out.println("Hello Friend!");
			try{
				Thread.sleep(1000);
			}catch(Exception e){}
		}
	}
}
class Test2 extends Thread{
	public void run(){
		for(int i=1;i<=10;i++){
			System.out.println("This is Sinjon!");
			try{
				Thread.sleep(500);
			}catch(Exception e){}
		}
	}
}

class Multithreading{
	public static void main(String[] args) {
		Test1 obj1=new Test1();
		Test2 obj2=new Test2();
		obj1.start();
		obj2.start();
	}
}