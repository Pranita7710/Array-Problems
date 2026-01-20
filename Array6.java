import java.util.*;
public class Array6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the count of employee");
        int count=sc.nextInt();

        int[] agearr=new int[count];

        System.out.println("enter age of employee");
        for(int i=0;i<count;i++){
            agearr[i]=sc.nextInt();
        }

        System.out.println(" age of company employee:");
        for(int i=0;i<count;i++){
            System.out.println(agearr[i]);
        }


    }
}
