package array;

public class hw1 {
	
	public static void searchArray(int arr[], int value )
	{
		int index =0;
		
		while(index<arr.length)
		{
			if(value==arr[index])
			{
				System.out.println(value+" is at index "+index);
			}
			++index;
		}
	}

	public static void main(String[] args) {
		int arr[] = {2,3,4,5,6,7};
		searchArray(arr, 5);
		
	}

}
