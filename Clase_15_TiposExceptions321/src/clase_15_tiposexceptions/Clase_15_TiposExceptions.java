package clase_15_tiposexceptions;

public class Clase_15_TiposExceptions {

    public static void main(String[] args) {
        
        try{
            int f = factorial(17);
        
        System.out.println("Factorial: " + f);
        } catch(IntegerOverflowException ex){
            ex.printStackTrace();
            System.out.println(ex.getMessage());
        }
        
        
        
        /*
        try{
            int f = factorial(3);
            System.out.println("Factorial: " + f);
        }
        }catch(IntegerOverflowException | ArithmeticException ex){
            System.out.println(ex.getMessage());
        }
        */

    }
    

    public static int factorial(int n) throws IntegerOverflowException{
        if (n < 0){
            throw new ArithmeticException("No esta definido el factorial de un numero negativo");
        }
        if (n > 16){
            throw new IntegerOverflowException();
        }
        int fact = 1;
        for (int i = 2; i <= n; i++){
            fact *= i;
        }
        return fact;
    }
    
}
