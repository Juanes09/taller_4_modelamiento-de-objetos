import java.util.InputMismatchException;
import java.text.DecimalFormat;
import java.util.Scanner;


public class Ordering_Methods extends Menu {
    Scanner input = new Scanner( System.in);
    static DecimalFormat nFormat = new DecimalFormat("#.00");
    Double [] bubbleArray = new Double[size];


    public void orderingOptions(){
        try {
            int option;
            System.out.println("Seleccione un metodo de ordenamiento \n" +
                    "1 Metodo Bubble Sort \n" +
                    "2 Metodo QuickSort \n" +
                    "3 Salir");
            option = input.nextInt();

            switch (option){
                case 1:
                    bubbleOrdering();
                    orderingOptions();
                    break;
                case 2:
                    quickSortOrdering(bubbleArray, 0,bubbleArray.length);
                    orderingOptions();
                    break;
                case 3:

                    break;
            }
        }catch (InputMismatchException exception){
            System.out.println("Invalid option, you must enter a whole number, try again.");
            input.nextInt();
        }
    }


    public static void bubbleOrdering(){

        Double aux;
        for (int i = 1; i < size; i++) {
            for (int j = 0; j < number.length - 1; j++) {
                if (number[j] > number[j + 1]) {
                    aux = number[j];
                    number[j] = number[j + 1];
                    number[j + 1] = aux;
                }
            }
        }
        Double bubbleArray[] = number;
        System.out.println("Arreglo ordenado con el metodo bubble sort");
        for (int k = 0 ; k < number.length; k ++){
            System.out.println(nFormat.format(bubbleArray[k]));
        }
    }

    public static void quickSortOrdering(Double[] array, int  firstNum , int lastNum) {
        array = number;
        double pivot = array[firstNum];
        int x = firstNum;
        int y = lastNum;
        double aux;

        while (x < y) {
            while (array[x] <= pivot && x < y) x++;
            while (array[y] > pivot) y--;

            if (x < y) {
                aux = array[x];
                array[x] = array[y];
                array[y] = aux;
                x++;
                y--;
            }
        }
        array[x] = array[y];
        array[y] = pivot;

        if (firstNum < y -1) quickSortOrdering(array,firstNum,y - 1);
        if (firstNum < lastNum) quickSortOrdering(array,y -1, lastNum);

        for (int i = 0; i < array.length ; i++) {
            System.out.println(numFormat.format(array[i]));
        }
    }

}
