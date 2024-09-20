import java.util.Scanner;

public class Store {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedimos el número de productos
        System.out.print("Ingrese el número de productos: ");
        int numProductos = scanner.nextInt();
        

        // Arrays para almacenar los precios y las cantidades de los productos
        int precios = {15,10,3}
        int[] precios = new int[numProductos];
        int[] cantidades = new int[numProductos];

        // Se llenan los arrays con los datos introducidos por el usuario
        for (int i = 0; i < numProductos; i++) {
            System.out.print("Ingrese el precio del producto " + (i + 1) + ": ");
            precios[i] = scanner.nextInt();

            System.out.print("Ingrese la cantidad del producto " + (i + 1) + ": ");
            cantidades[i] = scanner.nextInt();
        }

        // Calculamos el total de ventas
        int totalVentas = calcularTotalVentas(precios, cantidades);

        // rendimiento de las ventas 
        if (totalVentas > 50) {
            System.out.println("Buen rendimiento de ventas");
        } else {
            System.out.println("Rendimiento de ventas bajo");
        }

        
    }
 }

