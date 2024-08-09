
//Transpose
import java.util.Scanner;
class transpose{
    public static void main(String[] args) {
        int a[][]=new int[3][3], i, j;
        int t[][]=new int[3][3];
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
     
        for(i = 0 ;i < 3;i++)
        {
           for(j = 0;j < 3;j++)
           {
               t[i][j]=  a[j][i];
           }
        }
      
        System.out.println("Transpose of matrix is: ");
        for(i=0;i < 3;i++)
        {
           for(j=0;j< 3;j++)
           {
               System.out.print(t[i][j]+"  ");
           }
            System.out.println();
        }
     
    }
}
