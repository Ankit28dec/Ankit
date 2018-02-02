
public class Assignment {
	int i;
	static int j;
	
	public static void main(String[] args) {
		
		
		/*int i=2;
		f1(1);

		}

		public static void f1(int i)
		{
		f2(i+1);
		}

		public static void f2(int i)
		{
		f3(i+2);
		}

		public static void f3(int i)
		{
		System.out.println(i+3);
		}*/

		/*int x=0;
		while(true){
		x = increment(x);

		System.out.println("Value of x is --"+x);

		if(x>10)
		break;

		}
		}

		public static int increment(int i){
		return i+1;
		}
		*/

		/*int i=2;
		while(makeDecision(i)){

		i=i*i;
		System.out.println(i);
		}

		}

		public static boolean makeDecision(int i)
		{
		if(i%3 != 0){
		return true;
		}else{
		return false;
		}
		}*/

	/*	String arr1[] = new String [3];
		String arr2[] = new String [3];

		arr1[0]="A";
		arr1[1]="B";
		arr1[2]="C";

		arr2[0]="1";
		arr2[1]="2";
		arr2[2]="3";
		printAll(arr2);
		printAll(arr1);

		}

		public static void printAll(String str[]){
		for(int i=0; i < str.length ; i++){
		System.out.println(str[i]);
		}
		}*/
		Assignment t = new Assignment();
		t.non_static();
		t.meth_static2();
		meth_static2();
		t.i=100;
		j=200;
		t.j=400;
		}


		public void non_static(){
		System.out.println("pass1");
		}

		public static void meth_static2(){
		System.out.println("pass1");
		}


}

	




