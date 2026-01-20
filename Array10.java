import java.util.*;
public class Array10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array size");
        int arrsize=sc.nextInt();

        char[] arr=new char[arrsize];

        System.out.println("enter array elements");
        for(int i=0;i<arrsize;i++){
            arr[i]=sc.next().charAt(0);
        }

        for(int i=0;i<arrsize;i++){
            if(arr[i]=='a'| arr[i]=='e' | arr[i]=='i' | arr[i]=='o'| arr[i]=='u'| arr[i]=='A' |arr[i]=='E' |arr[i]=='I' |arr[i]=='O'| arr[i]=='U'){
                System.out.println("vowel"+ " "+arr[i]+" is present at:"+i);
            }
        }
        sc.close();
    }
}
