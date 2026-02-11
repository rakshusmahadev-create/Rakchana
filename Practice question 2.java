Program(1)(array):
import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int size = sc.nextInt();
      int arr[] = new int[size];
      for(int i=0;i<size;i++){
        arr[i]=sc.nextInt();
      }
      for(int i=0;i<size;i++){
        System.out.print(arr[i]+" ");
      }
     
    }
}
i/p:6
10 20 30 40 50 60
o/p:
10 20 30 40 50 60

  Progran(2)(sum and product of elements in an array)
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int arr[] = new int[size];

        int sum = 0;
        int product = 1;

        for(int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
            product = product * arr[i];
        }

        System.out.println("Array elements:");
        for(int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nSum = " + sum);
        System.out.println("Product = " + product);
    }
}
i/p:4
2 3 4 5
  o/p:
Array elements:
2 3 4 5 
Sum = 14
Product = 120

Program(3)(sum and even separately)
  import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int arr[] = new int[size];

        int evenSum = 0;
        int oddSum = 0;

        for(int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();

            if(arr[i] % 2 == 0) {
                evenSum = evenSum + arr[i];
            } else {
                oddSum = oddSum + arr[i];
            }
        }

        System.out.println("Even Sum = " + evenSum);
        System.out.println("Odd Sum = " + oddSum);
    }
}
i/p:
4
2 3 4 5
  o/p:
Even Sum = 6
Odd Sum = 8

program(4)(find the max number in the array)
  import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int arr[] = new int[size];

        for(int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];   // assume first element is maximum

        for(int i = 1; i < size; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Maximum number = " + max);
    }
  i/p:4
2 3 4 5
  o/p:
Maximum number = 5

program(5)(Max number finding)
    import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int size = sc.nextInt();
      int arr[] = new int[size];
      for(int i=0;i<size;i++){
        arr[i]=sc.nextInt();
      }
      int max = arr[0];
      for(int i=1;i<size;i++){
        if(arr[i]>max){
          max=arr[i];
        }
      }
      System.out.println(max);
    }
}
i/p:4
45 67 23 12
o/p:
67
program(6)(min number finding)
    import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int arr[] = new int[size];

        for(int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int min = arr[0];   

        for(int i = 1; i < size; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println(min);
    }
}
i/p:
4
45 67 23 12
o/p:
12

Program(7)(second max finding)
    import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int arr[] = new int[size];

        for(int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for(int i = 0; i < size; i++) {

            if(arr[i] > max) {
                secondMax = max;
                max = arr[i];
            }
            else if(arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }

        System.out.println("Second Maximum = " + secondMax);
    }
}
i/p:4
45 67 23 12
o/p:
Second Maximum = 45
