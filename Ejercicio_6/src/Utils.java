import java.util.Scanner;
import java.util.Vector;

/**
 * The type Utils.
 */
public  class Utils {
    /**
     * The Input.
     */
    Scanner input = new Scanner(System.in);
    /**
     * The Vector.
     */
    Vector<Integer> vector = new Vector<>();
    /**
     * The Num.
     */
    int num;
    /**
     * The Previous.
     */
    int previous;

    /**
     * Method involving the program solution logic
     * Enter data.
     */
    public void enterData() {
        for (int i = 0; i <= vector.size(); i++) {
            System.out.println("Enter vector elements :");
            num = input.nextInt();
            try {
                if (num == 0 ) {
                    throw new ExceptionsData("Invalid data, must be positive values");
                } else {
                    if ((previous != num)) {
                        vector.add(num);
                        previous = num;
                    } else {
                        break;
                    }
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                continueProgram();
            }
        }
        System.out.println(vector);
    }

    /**
     * Method for the user to select whether to continue or close
     * Continue program.
     */
    public void continueProgram() {
        System.out.println("You wish to continue? (y/n)");
        char follow = input.next().charAt(0);
        if (String.valueOf(follow).equalsIgnoreCase("Y")) {
            enterData();
        } else {
            System.out.println("Program terminated.");
            System.exit(0);
        }
    }
}
