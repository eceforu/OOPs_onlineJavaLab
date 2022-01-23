//Java Program to find MAtrix Multiplication
import java.util.Scanner;
class MatrixMul
{
  public static void main(String args[])
  {
    int m1,n1,m2,n2;  
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Size of the matrix1:");
    m1=sc.nextInt();
    n1=sc.nextInt();
    System.out.println("Enter the Size of the matrix2:");
    m2=sc.nextInt();
    n2=sc.nextInt();
    int A[][]=new int[m1][n1];
    int B[][]=new int[m2][n2];
    int C[][]=new int[m1][n2];
    if(n1!=m2)
    System.out.println("Matrix multiplication not possible");
    else
    {
        System.out.println("Enter the value of Matrix1");
        for(int i=0;i<m1;i++)
        {
            for(int j=0;j<n1;j++)
            {
                A[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the value of Matrix2");
        for(int i=0;i<m2;i++)
        {
            for(int j=0;j<n2;j++)
            {
                B[i][j]=sc.nextInt();
             }
        }
        System.out.println("Enter the value of Resultant Matrix");
        for(int i=0;i<m1;i++)
        {
            for(int j=0;j<n2;j++)
            {
                C[i][j]=0;
                for(int k=0;k<n1;k++)   
                {
                    C[i][j]=C[i][j]+A[i][k]*B[k][j];
                }        
            }
        }
        System.out.println("MATRIX A");
        for(int i=0;i<m1;i++)
        {
            for(int j=0;j<n1;j++)
            {
                System.out.print(A[i][j]+"\t");
            }
            System.out.println();
        }    
        System.out.println("MATRIX B");
        for(int i=0;i<m2;i++)
        {
            for(int j=0;j<n2;j++)
            {
                System.out.print(B[i][j]+"\t");
            }
            System.out.println();
        }  
        System.out.println("MATRIX C");
        for(int i=0;i<m1;i++)
        {
            for(int j=0;j<n2;j++)
            {
                System.out.print(C[i][j]+"\t");
            }
            System.out.println();
        }      
    }
    
  }
}
