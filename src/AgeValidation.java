import java.util.Scanner;
public class AgeValidation {
    public static void main(String[] args) {
        //Ingresar datos por teclado 
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        // Agregar un else para las personas que son menores de edad 
        if (age >= 18) {
            System.out.println("Access granted");
        }else{
            if (age<18){
                System.out.println("Access denied");
            }
        }
        
        
    }
}
