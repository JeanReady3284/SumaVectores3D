
import java.util.Scanner;


public class sumavectores {

    
    public static void main(String[] args) {
        
       int vuno[]=new int[3];
       int vdos[]=new int[3];
       int resultante[]=new int[3];
       
       Scanner entrada = new Scanner(System.in);
        System.out.println("Programa para sumar dos vectores de 3 dimensiones");
        System.out.print("Ingrese los valores el vector 1: ");
        for(int i=0; i<vuno.length; i++){
            vuno[i]=entrada.nextInt();
        }
        
        System.out.println("Ingrese los valores el vector 2: ");
        for(int i=0; i<vuno.length; i++){
            vdos[i]=entrada.nextInt();
        }
        
        
        for(int i=0; i<resultante.length; i++){
            resultante[i]=vuno[i]+vdos[i];
        }
        
        System.out.println("Al sumar los dos vectores resulta: ");
        System.out.println("("+resultante[0]+","+resultante[1]+","+resultante[2]+")");
    }
    
}
