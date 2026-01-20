import java.util.*;
public class Array5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size");
        int arrsize=sc.nextInt();

        int[] arr=new int[arrsize];

        System.out.println("enter array elements");
        for(int i=0;i<arrsize;i++){
            arr[i]=sc.nextInt();
        }
        
        boolean flag=true;
        for(int i=0;i<arrsize;i++){
            if(arr[i]%4==0){
                System.out.println(arr[i]+ "is divisible by 4 and its index is"+i);
                flag=true;
                
            }
            
        if(flag==false){
            System.out.println("none");
        }
    }
    
}
}
