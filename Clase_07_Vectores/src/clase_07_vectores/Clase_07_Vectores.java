package clase_07_vectores;

import java.util.Scanner;

public class Clase_07_Vectores {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int numero;
        int TAM = 5;
        
        int[] numeros = new int[TAM];
        int dim = 0;
        
        System.out.println("Ingrese un numero positivo o -1 para terminar: ");
        numero = input.nextInt();
        
        while(dim < TAM && numero != -1) {
            numeros[dim++] = numero;
            System.out.println("Ingrese un numero positivo o -1 para terminar: ");
            numero = input.nextInt();
        }
        
        for(int i = 0; i < dim; i++) {
            System.out.println(numeros[i]);
        }
        
        int[] otrosNumeros = {3,4,5,6,7};
        
        for(int valor : otrosNumeros) {
            System.out.println(valor);
            
        }
        
        /*
        numeros[0] = 12;
        numeros[1] = 23;
        numeros[2] = 44;
        numeros[3] = 78;
        numeros[4] = 87;
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
        
        System.out.println(numeros[4]);
        
        System.out.println(numeros);
        */
    }
    
}
