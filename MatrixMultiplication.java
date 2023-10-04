import java.io.*;
import java.util.*;
public class MatrixMultiplication
{
    public static void main(String args[])
    {
        int arr[][];
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter no .of rows");
        int r = sc.nextInt();
        System.out.println("Enter no .of columns");
        int p= sc.nextInt();
        int b[][]  = new int [r][p];
        int a[][] = new int [r][p];
        int c[][] = new int [r][p];
          System.out.println("total no.of elements in the matrix");
          System.out.println("enter"+(r*p)+"element into matrixA:");
           for(int i=0;i<r;i++)
           {
                  for(int j=0;j<p;j++)
                  {
                      a[i][j] = sc.nextInt();
                  }
           }
            System.out.println("enter"+(r*p)+"element into matrixB:");
              for(int i=0;i<r;i++)
              {
                    for(int j=0;j<p;j++)
                      {
                          b[i][j] = sc.nextInt();
                      }
              }
             for(int i=0;i<r;i++)
              {
                    for(int j=0;j<p;j++)
                      {
                          c[i][j] = a[i][j]*b[i][j];
                      }
              }
              System.out.println("the matrix is");
              for(int i=0;i<r;i++)
              {
                    for(int j=0;j<p;j++)
                      {
                          System.out.println(" "+c[i][j]);
                           System.out.println();
                      }
              }
    }
}
