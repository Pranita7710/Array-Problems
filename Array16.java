import java.util.*;
public class Array16 {
    public static void main(String[] Args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the arraysize");
        int n=sc.nextInt();

        int arr[]=new int[n];

        System.out.println("enter array element");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int minnum=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]<minnum){
                minnum=arr[i];
            }
        }
        System.out.println(minnum + "is the minumum element" );
        sc.close();
    }
    
}
