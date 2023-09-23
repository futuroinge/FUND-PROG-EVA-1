import java.util.Scanner;
public class EVA1_5_ENTRADA_SALIDA{
    /**
     * @param args
     */
    public static void main(String[] args){
        //todo code application logic here 
        //declaracion de variables 
        //mostrar datos caputrados
        
        String nombre;
        String apellido;
        int semestre;
        
        Scanner capturota = new Scanner(System.in);
        //Toda linea debe de llevar ";" para indicar fin de la instruccion//
        System.out.println("Captura tus datos");
        System.out.print("Ingresa tu nombre");
        nombre = capturota.nextLine();
        System.out.print("Ingresa tu apellido");
        apellido = capturota.nextLine();
        System.out.println("Ingresa tu semestre");
        semestre = capturota.nextInt();
        
        System.out.println(nombre + apellido);
        System.out.print( "Semestre" +" "+ semestre );
        
    }
}