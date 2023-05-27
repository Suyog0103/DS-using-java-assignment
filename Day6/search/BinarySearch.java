public class BinarySearch {
        public static void main(String[] args) {
        int data[]={1,2,3,4,5,6,7};
           int value=5;
           binarySearch(data,0,data.length-1,value);
           
        }
        public static void binarySearch(int data[],int low, int high,int search)
        {
         if(low<=high)
         {
            int mid=(low+high)/2;

            if(data[mid]==search)
            {
                System.out.println("Value found at "+(mid+1));
                return;
            }
            if(data[mid]>search)
            {
                binarySearch(data,0,mid-1,search);

            }
            else
            {
                binarySearch(data,mid+1,high,search);
            }
         }
         else
         {
            System.out.print("Value not found");
         }
        }   
}
