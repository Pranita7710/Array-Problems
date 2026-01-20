import java.util.*;
public class Array11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array size");
        int arrsize=sc.nextInt();

        int[] arr=new int[arrsize];

        System.out.println("enter array elements");
        for(int i=0;i<arrsize;i++){
            arr[i]=sc.nextInt();
        }
         int oddsum=1; int evensum=1;
        for(int i=0;i<arrsize;i++){
            if(i%2!=0){
                oddsum*=arr[i];
            }
            else{
                evensum*=arr[i];
            }
        }
        System.out.println("sum of product of odd indexed elements & even indexed elements is:"+(oddsum+evensum));
        sc.close();
    }
}