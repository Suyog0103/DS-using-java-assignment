package sort;
public class Selection {
    public static void main(String args[]){
        int data[]={14,78,99,65,23,10};
        System.out.print("before sorting\n");
        PrintArray(data);
        Selection(data);
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
    public static void Selection(int data[])
    {
        for(int i=0;i<data.length-1;i++)
        {
            for(int j=i+1;j<data.length;j++)
            {
                if(data[i]>data[j])
                {
                    data[i]=data[i]+data[j];
                    data[j]=data[i]-data[j];
                    data[i]=data[i]-data[j];
                }

            }
        }
        

    }
    
}
