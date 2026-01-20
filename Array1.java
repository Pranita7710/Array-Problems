import java.util.*;
public class Array1{
    public static void main(String[] args) {
       System.out.println("enter the array size:"); 
       Scanner sc=new Scanner(System.in);
       int arrsize=sc.nextInt();

       char []arr=new char[arrsize];

       System.out.println("enter array data:");
       for(int i=0;i<arrsize;i++){
          arr[i]=sc.next().charAt(0);
       }
       
       System.out.println("Array is:");
       for(int i=0;i<arrsize;i++){
         System.out.println(arr[i]);
       }
       System.out.println("enter element to be search");
       char ch=sc.next().charAt(0);
       
       for(int i=0;i<arrsize;i++){
         if(arr[i]==ch){
            System.out.println(ch+ "present at"+i);
         }   
    }
    sc.close();
  }
}

/*for(int i=0;i<arrsize;i++){
         if(arr[i]==ch){
            found=true;
            break;
         }
         
       }
       if(found){
         System.out.println(ch+"is present in array and its index is:");
        }
        else{
         System.out.println(ch +"is not present in array");
        } */