package view;
/*
This is a basic Java calculator. To run: manually call one of the calculation methods, pass two integer arguments, then output with Sys.out. You can find examples under the comments: test outputting calculations
*/
// future content: import java.util.Scanner;
public class Calculator{
  public Calculator(){
  } // constructor scope
  public int add(int a, int b){
    return a + b;
  } // add method scope
  public int subtract(int a, int b){
    return a - b;
  } // subtract method scope
  public int multiply(int a, int b){
    return a * b;
  } // multiply method scope
  public int divide(int a, int b){
    return a / b;
  } // divide method scope
  public int modulo(int a, int b){
    return a % b;
  } // modulo method scope
  public static void main(String[] args){
    // instancing the calculator class
    Calculator myCalculator = new Calculator();
    // test outputting calculations
    System.out.println(myCalculator.add(5, 7));
    System.out.println(myCalculator.subtract(12, 34));
    System.out.println(myCalculator.multiply(33, 11));
    System.out.println(myCalculator.divide(10, 5));
    System.out.println(myCalculator.modulo(9000, 9001));
    /* creating user input: future content:
    Scanner input = new Scanner(System.in);
    System.out.println("Basic Java Calculator");
    System.out.println("Please type the number of the operation you wish to perform: ");
    System.out.println("1. Add");
    System.out.println("2. Subtract");
    System.out.println("3. Muliply");
    System.out.println("4. Divide");
    System.out.println("5. Find division remainder");
    int selection = input.nextInt();
    */
  } // main method scope
} // class scope