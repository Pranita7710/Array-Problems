import java.util.*;
public class Array13 {
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
            if(arr[i]>5 && arr[i]<9){
                System.out.println("elements greater then 5 and less than 9 is  "+arr[i]);
            }
        }
        sc.close();

    }
}
