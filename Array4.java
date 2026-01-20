import java.util.*;

public class Array4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter array size:");
        int arrsize=sc.nextInt();

        int arr[]=new int[arrsize];
        System.out.println("enter array element");
        for(int i=0;i<arrsize;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<arrsize;i++){
            if(arr[i]==10){
                System.out.println(arr[i]+" is equal to 10");
            }

            if(arr[i]<10){
                System.out.println(arr[i]+" is less than 10");
            }
        }
        sc.close();
    }
}
