import java.util.Scanner;

public class FriendsAndFamily {
    public static void main(String[]arg){

        Scanner input = new Scanner(System.in);
        do {
            System.out.println("\n Entre list price:");
            double ListPrice = input.nextDouble();
            System.out.println("Enter discount%");
            int dicount = input.nextInt();
            System.out.println("Youll pay " + ListPrice/dicount);

        } while (true);


    }
}
