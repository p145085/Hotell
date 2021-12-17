package se.Lexicon;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        User user1 = new User(
                1,
                "foo@foo.com",
                "Bengt Sturesson",
                "0733333333",
                "Kalmar");
        boolean quitMenu = true;
        while (quitMenu){
            Scanner scanner = new Scanner(System.in);

            Menu.print_Get_Menu();

            String userInput = scanner.nextLine();

            switch(userInput){
                case "q":
                    System.out.println("Quitting.");
                    break;
                case "1":
                    System.out.println(user1.getID());
                    break;
                case "2":
                    System.out.println(user1.getCity());
                    break;
                case "3":
                    System.out.println(user1.getEmail());
                    break;
                case "4":
                    System.out.println(user1.getName());
                    break;
                case "5":
                    System.out.println(user1.getPhone());
                    break;
                case "6":
                    System.out.println("Make your selection: ");
                    System.out.println("1. SetID();");
                    System.out.println("2. SetEmail();");
                    System.out.println("3. SetName();");
                    System.out.println("4. SetPhone();");
                    System.out.println("5. SetCity();");

                    String userInput2 = scanner.nextLine();
                    switch(userInput2){
                        case "1":
                            System.out.println("Set ID to: ");
                            user1.setID(scanner.nextInt());
                            System.out.println("ID set to: " + user1.getID());
                            break;
                        case "2":
                            System.out.println("Set Email to: ");
                            user1.setEmail(scanner.nextLine());
                            System.out.println("Email set to " + user1.getEmail());
                            break;
                        case "3":
                            System.out.println("Set Name to: ");
                            user1.setName(scanner.nextLine());
                            System.out.println("Name set to: " + user1.getName());
                            break;
                        case "4":
                            System.out.println("Set phone to: ");
                            user1.setPhone(scanner.nextLine());
                            System.out.println("Phone set to: " + user1.getPhone());
                            break;
                        case "5":
                            System.out.println("Set City to: ");
                            user1.setCity(scanner.nextLine());
                            System.out.println("City set to: " + user1.getCity());
                            break;
                    }
            }
        }
    }
}
