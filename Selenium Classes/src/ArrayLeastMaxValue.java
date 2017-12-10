
public class ArrayLeastMaxValue {

	public static void main(String[] args) {
		// Max and Min Value
		int arr[] = new int[5];
		arr[0]= 15;
		arr[1]= 10;
		arr[2]= 5;
		arr[3]= 25;
		arr[4]= 20;
		
		int min= arr[2];
		int max = arr[3];
		
		for(int i=0;i<=4;i++)
		{
			if(arr[i]==min)
			{
				System.out.println(arr[i] + " Minimum Value ");
			}
			else if(arr[i]==max)
			{
				System.out.println(arr[i] + " Maxmium Value ");
			}
			else
			{
				System.out.println(arr[i] + " Niether Minimum nor Maximum");
			}
				
		}
		
		

	}

}
