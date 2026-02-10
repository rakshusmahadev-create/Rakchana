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

