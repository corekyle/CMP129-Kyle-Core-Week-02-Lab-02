import java.util.Scanner;

public class PersonTest 
{   // START OF PersonTest class
    
    public static void main(String[] args)
    {   // START OF main method

        // Create Scanner object
        Scanner keyboard = new Scanner(System.in);


        // Create Person objects
        Person person1 = new Person();
        Person person2 = new Person();


        // Declare variables
        String name;
        int age;
        String email;


        // Get user input for person 1 info
        System.out.print("Enter the name of person 1: ");
        name = keyboard.nextLine();
        person1.setName(name);

        System.out.print("Enter the age of person 1: ");
        age = keyboard.nextInt();
        person1.setAge(age);

        keyboard.nextLine();

        System.out.print("Enter the email address for person 1: ");
        email = keyboard.nextLine();
        person1.setEmail(email);


        // Get user input for person 2 info
        System.out.print("Enter the name of person 2: ");
        name = keyboard.nextLine();
        person2.setName(name);

        System.out.print("Enter the age of person 2: ");
        age = keyboard.nextInt();
        person2.setAge(age);

        keyboard.nextLine();

        System.out.print("Enter the email address for person 2: ");
        email = keyboard.nextLine();
        person2.setEmail(email);

        // Display the info about the Person objects


    }   // START OF main method

}   // END OF Person Test class
