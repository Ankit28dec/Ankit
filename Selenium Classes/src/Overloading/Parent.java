package Overloading;



public class Parent {
	
	static int i;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//Child.multipication(5, 4);
			
			Parent p = new Parent();
			p.sum(5, 4);
			p.sum(10, 20, 30);
			System.out.println(i);
			Child1 ch1 = new Child1();
			ch1.sum(15.5, 15.5);
			multipication(5,6);
			
		}
		
		public void sum(int a, int b)
		{
			i = a+b;
		System.out.println(i);
		}
		
		public void sum(int a, int b, int c)
		{
			i= a+b+c;
			System.out.println(i);
		}
		public static int multipication(int a, int b)
		{
			i = a*b;
			System.out.println(i);
			return i;
		}
		

	}


