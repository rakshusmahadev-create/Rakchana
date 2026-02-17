//Intialization through methods
class Student{
  int reg;
  String name;
  void assign(int r,String n) {
    reg = r;
    name = n;
  }
  void print(){
    System.out.println(reg + " "+name);
  }
}
public class Main{
  public static void main(String[] args){
    Student m1 = new Student();
    m1.assign(101,"arun");
    Student m2 = new Student();
    m2.assign(102,"karthick");
    m1.print();
    m2.print();
  }
}
// parameterised constructor
class Student{
  int reg;
  String name;
  void assign(int r,String n) {
    reg = r;
    name = n;
  }
  void print(){
    System.out.println(reg + " "+name);
  }
}
public class Main{
  public static void main(String[] args){
    Student m1 = new Student(101,"arun");
    Student m2 = new Student(102,"mythili");
   
    m1.print();
    m2.print();
  }
}
//initialization through reference
class Student{
    int reg;
    String name;
    }

public class Main
{
	public static void main(String[] args) {
		Student m1= new Student();
		m1.reg=101;
		m1.name="ashwin";

		Student m2=new Student();
		m2.reg=102;
		m2.name="baskaran";
		System.out.println(m1.reg);
		System.out.println(m1.name);
		System.out.println(m2.reg);
		System.out.println(m2.name);

	}
}
