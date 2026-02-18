//Program 1:

class Node{
  int data;
  Node next;
}

public class Main {
    public static void main(String[] args) {
      Node n1 = new Node();
      n1.data=10;
      Node n2 = new Node();
      n2.data=20;
      n1.next=n2;
      Node n3 = new Node();
      n3.data = 30;
      n2.next=n3;
      System.out.println(n1.data+" "+n2.data+" "+n3.data);
      System.out.println(n1.data+" "+n1.next.data+" "+n1.next.next.data);
    }
}

//Program 2:
Singly linked list
  class Node{
  int data;
  Node next;
  Node(int d){
    data=d;
    next=null;
  }
}
class singlylinkedlist{
  Node head = null;
  Node tail= null;
  void add(int data){
    Node newnode = new Node(data);
    if(head==null){
      head=tail=newnode;
    }
    else{
      tail.next=newnode;
      tail=newnode;
    }
  }
  void display(){
    Node temp = head;
    while(temp!=null){
      System.out.print(temp.data+" ");
      temp = temp.next;
    }
  }
}

public class Main {
    public static void main(String[] args) {
     singlylinkedlist s = new singlylinkedlist();
     s.add(100);
     s.display();
     s.add(200);
     s.display();
     s.add(300);
     s.display();
    }
}
