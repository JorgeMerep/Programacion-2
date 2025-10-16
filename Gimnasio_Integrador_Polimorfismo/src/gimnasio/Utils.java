package gimnasio;


public class Utils {
    
    public static String getHeaderTable() {
        return "|%-20s|%15s|\n".formatted("ENTRENADOR", "SUELDO");
    }
    
    public static String obtenerSepHorizontal(int length, String sep) {
        StringBuilder sepHorizontal = new StringBuilder();
        
        for(int i=1; i < length; i++) {
            sepHorizontal.append(sep);
        }
        return sepHorizontal.toString() + "\n";
    }
    
    public static String obtenerSepHorizontal(int length) {
        return Utils.obtenerSepHorizontal(length, "-");
    }
}
