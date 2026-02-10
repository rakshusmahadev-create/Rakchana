1.Get the input for all data types and print the values
(byte,short,int,float,long,double,char,string)
program:
import java.util.*;
public class Main
{
     public static void main (String[] args) {
    
        Scanner scan = new Scanner(System.in);
        byte a = scan.nextByte();
        short b = scan.nextByte();
        int c = scan.nextInt();
        float d = scan.nextFloat();
        long e = scan.nextLong();
        double f = scan.nextDouble();
        String str1 = scan.next();
        scan.nextLine();//getting string input between some values
        String str2 = scan.nextLine();
        char ch = scan.next().charAt(0);
        System.out.println(a+" "+b);
        System.out.println(c+" "+d);
        System.out.println(e+" "+f);
        System.out.println(str1+" "+str2);
        System.out.println(ch);
    }
}
o/p:
3 12
56 9.6
678 89.565
hello hello hi
h
  
Program 2:(sum of the digits)
import java.util.*;
public class Main
{
     public static void main (String[] args) {
    
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int sum = 0;
        while(a>0) {
          int r = a%10;
          sum = sum+r;
          a=a/10;
        }
        System.out.println(sum);
    }
}
input:456
o/p:15
  
Program 3(Reverse the digit):
import java.util.*;
public class Main
{
     public static void main (String[] args) {
    
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int rev = 0;
        while(a>0) {
          int r = a%10;
          rev=rev*10+r;
          a=a/10;
        }
        System.out.println(rev);
    }
}
Input: 456
o/p:
654
program 4(palindrome)
     import java.util.*;
public class Main
{
     public static void main (String[] args) {
    
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int rev = 0;
        int temp=a;
        while(a>0) {
          int r = a%10;
          rev=rev*10+r;
          a=a/10;
        }
        if(rev==temp){
          System.out.println("Palindrome");
        }
        else{
          System.out.println("Not Palindrome");
        }
        System.out.println(rev);
    }
}
input:677
output:
Not Palindrome
776

program 5:
import java.util.*;
public class Main
{
     public static void main (String[] args) {
    
        Scanner scan = new Scanner(System.in);
        char ch = scan.next().charAt(0);
        if(ch>= 'A' && ch<='Z'){
          System.out.println((char)(ch+32));
        }
        else if(ch>= 'a' && ch<='z'){
          System.out.println((char)(ch-32));
        }
        else{
          System.out.println(ch);
        }
    }
}
input:A
o/p:
a

program 6:
import java.util.*;
public class Main
{
     public static void main (String[] args) {
    
        Scanner scan = new Scanner(System.in);
        int year = scan.nextInt();
        if(year%4==0 && year%100!=0||year%400==0){
          System.out.println("Leap Year");
        }
        else{
          System.out.println("not a leap year");
        }
    }
}
i/p:2032
o/p:Leap Year

program7:(Print the factors of a number):
     import java.util.*;
public class Main
{
     public static void main (String[] args) {
    
        Scanner scan = new Scanner(System.in);
        int factor = scan.nextInt();
        for(int i=1;i<=factor;i++){
        if(factor % i == 0){
          System.out.println(i);
        }
      
       }
        
    }
}
input:500
o/p:
     1
2
4
5
10
20
25
50
100
125
250
500
Program8:(Factors count)
import java.util.*;
public class Main
{
     public static void main (String[] args) {
    
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int count=0;
        for(int i=2; i<=num/2;i++){
          if(num%i==0){
            count++;
          }
        }
        System.out.println(count+2);
    }
}
input:500
o/p:
12
program9(prime or not prime)
     import java.util.*;
public class Main
{
     public static void main (String[] args) {
    
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int count=0;
        for(int i=2; i<=num;i++){
          if(num%i==0){
            count++;
          }
        }
        if(count==2){
          System.out.println("prime");
        }
        else{
          System.out.println("not prime");
        }
    }
}
i/p:21
o/p:not prime

Program10:(factorial)
     import java.util.*;
public class Main
{
     public static void main (String[] args) {
    
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int mul=1;
        for(int i=1; i <=num; i++){
          mul = mul*i;
        }
        System.out.println(mul);
        
    }
}
input:8
output:40320

Program11:(fibonacci)
     import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(); 
        int s = 0, b = 1;

        System.out.println("Fibonacci sequence:");

        for (int i = 1; i <= a; i++) {
            System.out.print(s + " ");
            int next = s + b;
            s = b;
            b = next;
        }
    }
}
input:8
output: 0 1 1 2 3 5 8 13

Program12(without power):
     import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int power = sc.nextInt();
        int m = 1;

        for(int i = 1; i <= power; i++) {
            m = m*base;
        }

        System.out.println(m);
    }
}
Inuput:
2
5
o/p:
32
