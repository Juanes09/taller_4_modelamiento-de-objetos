/**
 * author Juan Esteban Patiño
 * @author  Juan Esteban Patiño
 * @version 1.0
 */
public class Main {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {

        Menu order = new Menu();
        Ordering_Methods ordering= new Ordering_Methods();


        order.dataArray();
        ordering.orderingOptions();

    }
}
