import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
       /* Scanner scanner = new Scanner(System.in);
        // Escribe tu solucion aqui
        String nombre = scanner.nextLine();
        int id = Integer.parseInt(scanner.nextLine());
        double precio = Double.parseDouble(scanner.nextLine());
        char simbolo = scanner.nextLine().charAt(0);
        boolean envioGratuito = Boolean.parseBoolean(scanner.nextLine());

        System.out.println(nombre + " #" + id);
        System.out.println("Precio: " + simbolo + precio);
        System.out.println("Envio Gratuito: " + envioGratuito);*/

       /*GenericArray <Integer> myArray = new GenericArray<>();
       myArray.add(1);
       myArray.add(2);
       myArray.add(3);
       myArray.add(4);

       System.out.println(myArray);
       myArray.removeLastOne();
       System.out.println(myArray);*/


       Pila <Integer> myPila = new Pila<>();
       myPila.push(1);
       myPila.push(2);
       myPila.push(3);
       myPila.push(4);

        System.out.println(myPila);

        System.out.println(myPila.pop());

        System.out.println(myPila);

    }
}
