package array;

public class hw3 {
	
	public static void subArray(int arr[])
	{
		int index =0;
		int counter=0;
		
		for(int i=0; i<arr.length-1;i++)
		{	
			int j=arr.length;
			for(;arr[i]>j;j--)
		{
			if(arr[i]<arr[i+1])
			{
				++counter;	
			}
			else {
				
			}
			++index;
		}
		System.out.println("no of subarray is "+counter);
	}
	}

	public static void main(String[] args) {
		int arr[] = {2,3,8,5,6,7};
		subArray(arr);
		
	}

}
