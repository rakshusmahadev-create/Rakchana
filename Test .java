import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int size = sc.nextInt();
      int arr[] = new int[size];
      for(int i=0; i<size;i++){
         arr[i] = sc.nextInt();
      }
      int evenmax = Integer.MIN_VALUE;
      int oddmax = Integer.MIN_VALUE;
      for(int i =0;i<size;i++){
      if(arr[i]%2==0){
        if(arr[i]>evenmax){
          evenmax = arr[i];
        }
      }

      else{
        if(arr[i]>oddmax){
          oddmax = arr[i];
        }
      }
      }
      System.out.println("Maximum Even:"+ evenmax);
      System.out.println("Maximum Odd:"+ oddmax);
    }
}
