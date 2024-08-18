class Student{
    String name;
    int age;
    public Student(String name, int age) {
      this.name = name;
      this.age = age;
    }
  }
  class Node {
    Student data;
    Node next;
    public Node(Student data) {
      this.data = data;
      this.next = null;
    }
  }
  class LinkedList {
    Node head;
    public LinkedList() {
      this.head = null;
    }
    public void insert(Student data) {
      Node newNode = new Node(data);
      if (head == null) {
        head = newNode;
      } else {
        Node temp = head;
        while (temp.next != null) {
          temp = temp.next;
        }
        temp.next = newNode;
      }
    }
    public void display() {
      Node temp = head;
      while (temp != null) {
        System.out.println("Name: " + temp.data.name + ", Age: " + temp.data.age);
        temp = temp.next;
      }
    }
  }
  public class L1{ 
    public static void main(String[] args) {
      LinkedList studentList = new LinkedList(); 
      studentList.insert(new Student("Aditya", 20));
      studentList.insert(new Student("Ram", 21));
      studentList.insert(new Student("Shyam", 19));
      studentList.insert(new Student("Manoj", 22));
      studentList.insert(new Student("Virat", 20));
      studentList.insert(new Student("Rohit", 21));
      studentList.insert(new Student("Rajat", 19));
      studentList.insert(new Student("Rishabh", 22));
      studentList.insert(new Student("Lalan", 20));
      studentList.insert(new Student("Mohan", 21));   
      studentList.display();
    }
  }
