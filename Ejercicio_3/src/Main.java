/**
 * author Juan Esteban Patiño
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
