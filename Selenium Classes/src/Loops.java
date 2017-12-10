
public class Loops {

	public static void main(String[] args) {
		// For Loops
		
		/*for(int i=1; i<=50; i++)// even numbers
		{
			initialization would be happen once.
			then condition check
			then it will print
			then increment
			then condition check then increment so on
				System.out.println(i*2);
				
		}*/
		/*for(int i=0; i<100; i++)//odd numbers
		{
			System.out.println(i=i+1);
		}
		*/
		/*for(int i=1; i<=100; i++)// divisible by 5 program
		{
			if(i%5==0){
				System.out.println("divisible by 5" + " followed by " + i);
			}
			else
			{
				System.out.println(i);
			}
		}*/
		/*int sum =0;//sumation of first 100 numbers
		for(int i=1; i<=100 ; i++)
		{
			sum =sum + i;
			System.out.println(sum);
		}*/
		
		//to print series
		for(int i=1; i<=7; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(j);
			}
			System.out.println(" ");
		}

	}

}
