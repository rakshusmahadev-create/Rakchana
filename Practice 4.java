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
