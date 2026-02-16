//Linear search
import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int size = sc.nextInt();
      int arr[] = new int[size];
      for(int i=0; i<size; i++){
        arr[i]=sc.nextInt();
      }
      int search = sc.nextInt();
      int f =0;
      for(int i=0;i<size;i++){
        if(arr[i]==search){
          f=1;
          System.out.println(i+1 +"position");
          break;
        }
      }
      if(f==0){
      
      System.out.println("no data present");
    }
}
  
}

//Binary search
import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int size = sc.nextInt();
      int arr[] = new int[size];
      for(int i = 0; i<size;i++){
        arr[i] = sc.nextInt();
      }
      Arrays.sort(arr);
      int search = sc.nextInt();
      int start=0,end=size-1;
      boolean f = false;
      while(start<=end){
        int mid = (start+end)/2;
        if(arr[mid]==search){
          System.out.println(mid + "present");
          f=true;
          break;
        }
        else if(search>arr[mid]){
          start = mid +1;
        }
        else{
          end = mid -1;
        }
      }
      if(f==false){
        System.out.println("no data");
      }
      
    }
}

//Bubble sorting
import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int arr[] = new int[n];
      for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
      }
      for(int i=0;i<n;i++){
        for(int j=0; j<n-i-1;j++){
          if(arr[j]>arr[j+1]){
            int a = arr[j];
            arr[j]=arr[j+1];
            arr[j+1]=a;
          }
          
        }
        
      }
      
      System.out.println(Arrays.toString(arr));
    }
}
