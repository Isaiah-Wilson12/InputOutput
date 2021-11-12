import java.util.Scanner;

public class Main {
  public static void main(String[] args) { // method
    System.out.println("What is your name");

    // type identifier = new type();
    Scanner scanner = new Scanner(System.in);
    String name = scanner.nextLine();

    System.out.println("hello " + name);

  }
}

// comment
// class - Contains everything- has members
// methods - do something
// arguments - What you pass to a method (part of the calling)
// parameter - Variables to store arguments (Part of the definition)
// statements - Telling the computer soemthing
// properties - Store something

// access modifier (public) - Who can use?
// static - No instance of class is needed
// object - instance of a class