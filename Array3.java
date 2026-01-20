import java.util.*;

public class Array3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter array size:");
        int arrsize=sc.nextInt();

        int arr[]=new int[arrsize];
        System.out.println("enter array element");
        for(int i=0;i<arrsize;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("sum is");
        int sum=0;
        for(int i=0;i<arrsize;i++){
            if(arr[i]%2!=0){
                sum+=arr[i];
            }
        }
        System.out.println(sum);
        
    }
    
}
