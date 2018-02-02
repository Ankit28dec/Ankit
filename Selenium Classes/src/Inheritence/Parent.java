package Inheritence;

public class Parent {
	
	static int i;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Child.multipication(5, 4);
		
		Parent p = new Parent();
		p.sum(5, 4);
		
	}
	
	public void sum(int a, int b)
	{
		i = a+b;
	System.out.println(i);
	}

}
