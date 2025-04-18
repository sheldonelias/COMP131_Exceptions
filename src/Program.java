import java.util.Scanner;

public class Program
{

    static Scanner scnr = new Scanner(System.in);

    public static void main(String[] args) {

        String userInput= scnr.nextLine();

        System.out.println(userInput);

        try
        {
            if(userInput.equals("open sesame"))
            {
                System.out.println("Open the door.");
            } else
                throw new Exception(" Bad choice!");


        }catch(Exception exc)
        {
            System.out.println("Get lost." + exc.getMessage());
        }

    }

}
