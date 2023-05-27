import java.util.ArrayList;

public class LinearMultipleSearch {
    public static void main(String[] s)
    {
        int arr[]={4,8,2,2,9,10,2,45,8 ,69};
      //  int arr1[]=new int[5];
        ArrayList <Integer> arr2 = new ArrayList<Integer>(0);
        int search = 8;
        int counter=0;
        for(int i=0; i<arr.length; i++)
        {   
            if(search==arr[i])
            {
     //          arr1[counter]=i;
        //       System.out.println(arr1[counter]);
                 arr2.add(i);
                 //System.out.println(arr2.get(counter));
                 counter++;
            }
            
        }
            if(counter==0)
            {
                System.out.println("value not found");
                return;
            }
            if(counter!=0)
            {   
                System.out.println("Dulicate till "+arr2.size()+" times");
                for(int j=0; j<arr2.size(); j++)                                  //use counter instead of arr2.size()
                {
                    System.out.println("Dulicate at position "+(arr2.get(j)));

                }
            }
            
    }
   

}
