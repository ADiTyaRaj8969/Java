public class fibo {

    public static void printTable(int num, int range) {
      System.out.println("Multiplication Table of " + num + ":");
      for (int i = 1; i <= range; i++) {
        System.out.println(num + " * " + i + " = " + (num * i));
      }
    }
  
    public static void main(String[] args) {
      int number = 7; // Change this value to print the table for any number
      int limit = 10;  // Change this value to set the range of the table (up to which number to multiply)
      printTable(number, limit);
    }
  }
  