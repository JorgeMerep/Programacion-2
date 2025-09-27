package clase_11_integrador_listas;

public class Utils {
    
    public static String sepHorizontal(int length, char caracter){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++){
            sb.append(caracter);
        }
        sb.append('\n');
        return sb.toString();
    }
    
    public static String sepHorizontal(int length){
      return sepHorizontal(length, '-');
    }
}
