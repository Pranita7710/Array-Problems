import java.util.*;
public class Array9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array size");
        int arrsize=sc.nextInt();

        int[] arr=new int[arrsize];

        System.out.println("enter array elements");
        for(int i=0;i<arrsize;i++){
            arr[i]=sc.nextInt();
        }

        
        int sum=0;
        for(int i=0;i<arrsize;i++){
            if(arr[i]%3==0){
                sum+=arr[i];
            }
        }
        System.out.println("sum of elements divisible by 3 is:"+ sum);
    }
}