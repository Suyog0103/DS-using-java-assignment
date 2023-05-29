package sort;

public class insertionSort {
    public static void main(String s [])
    {
        int data[]={14,78,99,65,23,10};
        System.out.print("before sorting\n");
        PrintArray(data);
        insertionSort(data);
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

    public static void insertionSort(int data [])
    {
        int j;
        for(int i =1; i<data.length; i++)
        {
            int v=data[i];
            for(j=i-1; j>=0 && v<data[j]; j--)
            {
                    data[j+1]=data[j];  //    data[j]=data[j+1];
                
            }
            data[j+1]=v;

        }
    }

}
