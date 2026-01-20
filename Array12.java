import java.util.*;
public class Array12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array size");
        int arrsize=sc.nextInt();

        int[] arr=new int[arrsize];

        System.out.println("enter array elements");
        for(int i=0;i<arrsize;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<arrsize;i++){
            if(arrsize%2==0){
                System.out.println(arr[i++]);
            }
            else{
                System.out.println(arr[i]);
            }
        }
        sc.close();
    }
}