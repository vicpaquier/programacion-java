public class Varargs {
    public static void main(String[] args) {

        sumar(2,2);

        varios("Victor", 22,33,11,32,442,123,33);
    }

    public static void sumar(int... numero){
        int aux = 0;
        for (int i = 0; i < numero.length; i++) {
            System.out.println("numero = "+numero[i]);
            aux += numero[i];
        }
        System.out.println("aux = " + aux);
    }

    public static void varios(String nombre, int... numero){
        System.out.println("nombre = " + nombre);
        for (int i = 0; i < numero.length; i++) {
            System.out.println("numero = "+numero[i]);
        }
    }
}
