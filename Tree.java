//program 1:(Node Creation)
class Node{
  int data;
  Node left;
  Node right;
  Node(int d){
    data = d;
    left = null;
    right = null;
  }
}
public class Main{
  public static void main(String[]args){
    Node root = new Node(10);
    Node n1 = new Node(20);
    root.left=n1;
    Node n2 = new Node(30);
    root.right=n2;
    Node n3 = new Node(40);
    root.left.right = n3;
    System.out.println(root.data+" "+root.left.data+" "+root.right.data);
  }
}

Program 2:
https://www.onlinegdb.com/fork/paQ_CvyD1
