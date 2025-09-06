//TO SUM UP 3*3 MATRICES...
import java.util.Scanner;

public class SumOfMatrices {
    public static void main(String[] args) {
        int i,j;
        int a[][]=new int[3][3];
        int b[][]=new int[3][3];
        int sum[][]=new int[3][3];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 9 values in array a[]:");
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
              a[i][j]=sc.nextInt();  
            }
        }
        System.out.println("Enter 9 values in array b[]:");
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
              b[i][j]=sc.nextInt();  
            }
        }
        System.out.println("Sum of array a[] and b[]:");
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
              sum[i][j]=a[i][j]+b[i][j];
              System.out.println("a["+i+"]["+j+"]: "+sum[i][j]);
            }
        }
        
    }
}