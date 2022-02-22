public class Ejemplo extends Ejemplo1 {

    public static void main(String[] args) {
        multiplicar(5 , 5);
        suma(100, 20);
    }

    public static int multiplicar (int x , int y){
        int  resultado = x * y;
        System.out.println(resultado);


        return resultado;
    }
}
