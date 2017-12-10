
public class ArraySeries {

	public static void main(String[] args) {
		// Array Series and repeated times
		
		/*int arr[]= new int[]{1,3,4,5,6,3,2,4,6,7,9,4,12,3,4,6,8,9,7,6,43,2,4,7,7,5,2,1,3,4,6,311,1};
		
		for(int i=0; i<=32; i++)
		{
			System.out.println(arr[i]);
		}
		*/
		//repeated time is remaining
		
		/*int a[][] = new int[10][5];
		for(int i=0;i<10;i++){

		for(int j=0; j<5; j++){
		a[i][j]=i*j;
		}
		}

		System.out.println(a[0][0]);
		System.out.println(a[1][3]);
		System.out.println(a[3][4]);
		}
	*/
		
		
	
int[] elements = {1, 7, 0, 2, 10, 3, -3};
int smallest = 0;
int secondSmallest = 0;
//System.out.println(smallest);
for (int i = 0; i < elements.length; i++) {
    if(elements[i]==smallest){
      secondSmallest=smallest;
    } else if (elements[i] < smallest) {
        secondSmallest = smallest;
        smallest = elements[i];
    } else if (elements[i] < secondSmallest) {
        secondSmallest = elements[i];
    }
    
}
System.out.println("The smallest element is: " + smallest + "\n"+  "The second smallest element is: " + secondSmallest );
}
	}



