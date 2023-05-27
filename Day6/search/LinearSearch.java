
public class LinearSearch{

    public static void main(String[] s)
    {
        int arr[]={4,8,2,2,9,10,2,45,69};
        int search = 2;
        int counter=0;
        for(int i=0; i<arr.length; i++)
        {   counter++;
            if(search==arr[i])
            {
                System.out.println("Value is found at " +counter+ "th position");
                return;
            }
        }
        System.out.println("value not found");
    }

}
