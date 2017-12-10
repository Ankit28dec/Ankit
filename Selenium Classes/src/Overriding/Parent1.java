package Overriding;

public class Parent1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child2 obj1 = new Child2();
		obj1.start();
		obj1.stop();
		obj1.wash();
		
		Child3 obj2 = new Child2();
		obj2.start();
		obj2.stop();
		//obj2.wash(); ---- wont be able to call own method as refrence is of child3 class
			

	}

}
