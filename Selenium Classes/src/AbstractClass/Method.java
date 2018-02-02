package AbstractClass;

public class Method extends Abstract1 {
	
	int i;
	public static void main(String[] args) {
	divide(5,4);
	Method obj1 = new Method();
	obj1.m1(5,4);
	
	}
	public void m1(int a, int b)
	{
		i = a*b;
		System.out.println(i);
	}
	

}
