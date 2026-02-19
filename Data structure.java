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
//program 3:
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
  void addatbeg(int data){
    Node newnode = new Node(data);
    if(head==null){
      head = tail = newnode;
    }
    else{
      newnode.next=head;
      head=newnode;
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
     s.addatbeg(400);
     s.display();
    }
}
//Program 4:
https://www.onlinegdb.com/9gnIMNA0I
//Program 5:
https://www.onlinegdb.com/vZGIerlOL
//Program 6:
delete
  void deleteatleast(){
  if(head==null){
  System.out.println("No element to delete");
  return;
}
Node temp=head;
while(temp.next !=tail){
  temp=temp.next;
}
tail-temp;
tail.next=null;
}
https://www.onlinegdb.com/kASk-Htlm
https://www.onlinegdb.com/Ntju9Nt5p
https://www.onlinegdb.com/2B1ajjxjtQ
https://www.onlinegdb.com/oh2hFDTjH
https://www.onlinegdb.com/GvZOLio3f
https://www.onlinegdb.com/s21s_-wL3
https://onecompiler.com/java/44e2wfkn8
https://www.onlinegdb.com/QGD9FqeOP-doubly linked list(insertion)
//Program:
class Node {
	int data;
	Node prev;
	Node next;
	Node(int data) {
		this.data = data;
		prev=null;
		next=null;
	}
}
class Circularsinglylinkedlist{
    Node head=null;
    Node tail=null;
    int size=0;
    
    void addatlast(int data){
        Node newnode=new Node(data);
        size++;
        if(head==null){
            head=tail=newnode;
            tail.next=head;
        }
        else{
            tail.next=newnode;
            tail=newnode;
            tail.next=head;
        }
    }
    
    void addatbeg(int data){
        Node newnode=new Node(data);
        size++;
        if(head==null){
            head=tail=newnode;
            tail.next=head;
        }
        newnode.next=head;
        head=newnode;
        tail.next=head;
        
    }
    
    void display(){
        if(head==null){
            System.out.println("There is no element to print");
            return;
        }
        Node temp=head;
        do{
            System.out.print(temp.data+" ");
            temp=temp.next;
            }while(temp!=head);
            System.out.println();
    }
}
public class Main
{
	public static void main(String[] args) {
	Circularsinglylinkedlist c=new Circularsinglylinkedlist();
	c.addatlast(10);
	c.addatlast(20);
	c.addatlast(30);
	c.addatbeg(40);
	c.display();
	}
}

//delete at last
void deleteatlas(){
  if(head==null){
    System.out.println("no element to delete");
    return;
  }
  if(head==tail){
    head=tail=null;
    System.out.println("All elements are deleted");
    return;
  }
  Node temp = head;
  while(temp.next!=tail){
    temp=temp.next;
  }
  tail=temp;
  tail.next=head;
  size--;
}
  void deleteatBeg(){
	  if(head==null){
		  System.out.println("no element to delete");
		  return;
		  )
		  if(head==tail){
			  head=tail=null;
			  
