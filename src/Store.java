public class Store {
    public static void main(String[] args) {
        // cambiar los nombres de las variables 
        int numVentas1 = 15;
        int numVentas2= 10;
        int numVentas3 = 5;
        //Quitar valores magicos
        
        int precio1 = 2;
        int precio2 = 3;
        int precio3 = 4;
 
        int totalVenta1 = numVentas1 * precio1;
        int totalventa2 = numVentas2 * precio2;
        int totalventa3 = numVentas3 * precio3;

        int totalSales = totalVenta1 + totalventa2 + totalventa3;

        if (totalSales > 50) {
            System.out.println("Good sales performance");
        } else {
            System.out.println("Low sales performance");
        }
    }
}
