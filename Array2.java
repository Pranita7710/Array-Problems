import java.util.*;
public class Array2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the array size:");
        int arrsize=sc.nextInt();

        int arr[]= new int[arrsize];
        System.out.println("enter the array element");
        for(int i=0; i<arrsize;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("even elements are:");
        boolean flag=false;
        for(int i=0;i<arrsize;i++){
        if(arr[i]%2==0){
            System.out.println(arr[i]);
            flag=true;
        }
        if(flag==false){
            System.out.println("none");
        }
        
    }
    
    }
    
}
