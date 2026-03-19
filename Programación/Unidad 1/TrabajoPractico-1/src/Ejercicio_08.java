public class Ejercicio_08 {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        int resultado = a / b;
        System.out.println("Resultado: " + resultado);
    }
}

/* El valor de resultado es 2, a pesar de que 5/2 = 2.5
   Esto sucede porque Java divide enteros sin problema y, si el resultado es decimal, simplemente los trunca.
 */