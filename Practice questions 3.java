Program1(2-D array)
  import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
    //  int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};//compile Runtime
    int rsize = sc.nextInt();
    int csize = sc.nextInt();
    int arr[][] = new int[rsize][csize];
    for(int i=0;i<rsize;i++){
      for(int j=0;j<csize;j++){
        arr[i][j]=sc.nextInt();
      }
    }
    for(int i=0;i<rsize;i++){
      for(int j=0;j<csize;j++){
        System.out.print(arr[i][j]+" ");
        
    }
         System.out.println();
    }
}
}
o/p:
1 2 
3 4 
5 6 

Program2(border adding):
  import java.util.*;
public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int rsize = sc.nextInt();
    int csize = sc.nextInt();
    int arr[][] = new int[rsize][csize];
    for(int i=0; i < rsize; i++){
      for(int j=0; j < csize ;j++){
        arr[i][j]=sc.nextInt();
      }
    }
    int sum = 0;
    for(int i=0;i < rsize;i++){
      for(int j=0;j < csize;j++){
        if(i==0 || j==0 || i==rsize-1 || j==csize-1) {
          sum = sum + arr[i][j];
        }
      }
    }
    System.out.println(sum);
  }
}
i/p:
3
3
123
345
789
456
09945
7865
5432
10008
8765
  o/p:
 33783
  program3(left diagonal)
  import java.util.*;
public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int rsize = sc.nextInt();
    int csize = sc.nextInt();
    int arr[][] = new int[rsize][csize];
    for(int i=0; i < rsize; i++){
      for(int j=0; j < csize ;j++){
        arr[i][j]=sc.nextInt();
      }
    }
    int sum = 0;
    for(int i=0;i < rsize;i++){
      for(int j=0;j < csize;j++){
        if(i==j) {
          sum = sum + arr[i][j];
        }
      }
    }
    System.out.println(sum);
  }
}
Output:
18833

program4(right diagonal)
  import java.util.*;
public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int arr[][] = new int[size][size];
    for(int i=0; i < size; i++){
      for(int j=0; j < size ;j++){
        arr[i][j]=sc.nextInt();
      }
    }
    int sum = 0;
    for(int i=0;i < size;i++){
      for(int j=0;j < size;j++){
        if(i==j|| i+j==size-1) {
          sum = sum + arr[i][j];
        }
      }
    }
    System.out.println(sum);
  }
}
o/p:
  18677
