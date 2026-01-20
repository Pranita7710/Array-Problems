import java.util.*;
public class Array17 {
    public static void main(String[] Args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the arraysize");
        int n=sc.nextInt();

        int arr[]=new int[n];

        System.out.println("enter array element");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int maxnum=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>maxnum){
                maxnum=arr[i];
            }
        }
        System.out.println(maxnum + "is the maximum element of array" );
        sc.close();
    }
    
}

