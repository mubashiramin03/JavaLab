
//Determinant
import java.util.Scanner;
class Determinant{
    public static void main(String[] args) {
        int a[][]=new int[3][3], i, j;
        int determinant;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements of matrix: ");
        for(i = 0 ;i < 3;i++)
        {
           for(j = 0;j < 3;j++)
           {
               a[i][j]=  sc.nextInt();
           }
        }
          
     
        System.out.println("Your matrix is: ");
        for(i=0;i < 3;i++)
        {
           for(j=0;j< 3;j++)
           {
               System.out.print(a[i][j]+"  ");
           }
            System.out.println();
        }
     
      determinant = a[0][0] * ((a[1][1]*a[2][2]) - (a[2][1]*a[1][2])) -a[0][1] * (a[1][0]
       * a[2][2] - a[2][0] * a[1][2]) + a[0][2] * (a[1][0] * a[2][1] - a[2][0] * a[1][1]);
     
      System.out.println("Value of determinant is: "+determinant);
    }
}
