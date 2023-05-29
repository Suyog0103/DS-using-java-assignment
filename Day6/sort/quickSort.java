package sort;

public class quickSort {
    public static void main(String s [])
    {
        int data[]={14,78,99,65,23,10};
        System.out.print("before sorting\n");
        PrintArray(data);
        quickSort(data, 0, data.length-1);
        System.out.print("\n after sorting\n");
        PrintArray(data);
    }
    public  static void PrintArray(int data[])
    {
        int counter=0;
        for(int i=0;i<data.length;i++)
        {
            counter++;
            System.out.print("\t"+data[i]);
        }
        System.out.print("\tArray count is "+counter);
    }
    
    public static void quickSort(int [] arr,int low, int high)
    {
        if(low<high)
        {
            int pivot=partition(arr, low, high);

            if(pivot!=-1)
            {
            quickSort(arr, low, pivot-1);

            quickSort(arr, pivot+1, high);
            }
        }
    }

    public static int partition(int [] data,int low, int high)
    {
        int pivot = data[high];
        int j= high-1;
        int i=low;

        while(i<=j)
        {
            if(data[i]>pivot)
            {
                // data[i]=data[i]+data[j];
                // data[j]=data[i]-data[j];
                // data[i]=data[i]-data[j];
                int temp=data[i];
                data[i]=data[j];
                data[j]=temp;
                --j;
            }
            else
            {
                ++i;
            }
        }
        j++;
        data[high]=data[j];
        data[j]=pivot;
        return j;
    }
}
