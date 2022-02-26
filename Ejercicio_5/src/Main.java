import java.util.Scanner;

/**
 * The type Main.
 */
public class Main {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {

        Transport transport = new Transport("","","",2021,5,5,"");
        Scanner input= new Scanner(System.in);
        transport.menu();

    }
}
