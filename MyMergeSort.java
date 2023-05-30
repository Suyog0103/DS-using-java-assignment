

public class MyMergeSort {

    public static void main(String [] s)
    {
        int data [] = {9, 8, 5, 4, 1, 7};
        System.out.println("Before sort: ");
        printArray(data);
        myMergeSort(data, 0, data.length-1);
        System.out.println("\nAfter sort: ");
        printArray(data);
    }

    public static void printArray(int [] data)
    {
        for(int i=0; i<data.length; i++)
        {
            System.out.print("\t" +data[i]);
        }
    }

    public static void myMergeSort(int [] data, int low, int high)
    {
        if(low<high)
        {
            int mid=(low + high)/2;
            myMergeSort(data, low, mid);
            myMergeSort(data, mid+1, high);
            mergingElement(data, low, high, mid);
        }
    }

    public static void mergingElement(int [] data, int low, int high, int mid)
    {
        int n1= mid - low + 1;
        int n2= high - mid;

        int [] a1 = new int[n1];
        int [] a2 = new int[n2];

        for(int i=0; i<a1.length; i++)
        {
            a1[i] = data[low + i];
        }

        for(int j= 0; j<a2.length;j++)
        {
            a2[j] = data[mid+j+1];
        }

        int i=0, j=0, k=low;
        while(i<n1 && j<n2)
        {
            if(a1[i]<a2[j])
            {
                data[k++]=a1[i++];
            }
            else
            {
                data[k++]=a2[j++];
            }
        }

        while(i<n1)
        {
            data[k++]=a1[i++];
        }

        while(j<n2)
        {
            data[k++]=a2[j++];
        }
    }  
}
