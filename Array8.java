import java.util.*;
public class Array8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array size");
        int arrsize=sc.nextInt();

        int[] arr=new int[arrsize];

        System.out.println("enter array elements");
        for(int i=0;i<arrsize;i++){
            arr[i]=sc.nextInt();
        }

        int count=0;
        for(int i=0;i<arrsize;i++){
            if(arr[i]%2==0){
                count++;
            }
            
        }
        System.out.println("count of even number is"+count);
    }
}