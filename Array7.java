
import java.util.*;
public class Array7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array size");
        int count=sc.nextInt();

        int[] arr=new int[count];

        System.out.println("enter the array element");
        for(int i=0;i<count;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("odd indexed elements are");
        for(int i=0;i<count;i++){
            if(i%2!=0){
                System.out.println(arr[i]);
            }
        }
    }
}