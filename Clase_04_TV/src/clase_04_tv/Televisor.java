package clase_04_tv;

public class Televisor {
    
    // atributos de instancia (de cada objeto que se cree a partir de la clase)
    private String marca;
    private final double tamanio;
    private final int nroSerie;
    
    private int canal;
    private int volumen;
    private boolean mute;
    private boolean estaEncendido;
    // atributos de clase: static
    private static final int MAX_CANAL = 99;
    private static final int MIN_CANAL = 1;
    private static final int MAX_VOL = 10;
    private static final int MIN_VOL = 0;
    private static final int INITIAL_SERIE = 100000;
    private static int nextSerie = INITIAL_SERIE;
    
    // Método constructor, con parámetros: constructor parametrizado.
    public Televisor(String marca, double tamanio){
        validarTamanio(tamanio);
        this.tamanio = tamanio;
        this.marca = marca;
        this.nroSerie = getAndIncrementSerie();
        /* Post incremento: 1°) se usa el valor actual de nextSerie, y 2°) se incrementa el valor en 1.
        this.nroSerie = nextSerie++;*/
    }
    
    public static int getAndIncrementSerie() {
        return nextSerie ++;
    }
    
    public void power() {
        estaEncendido = !estaEncendido;
        System.out.println((estaEncendido) ? "Power on" : "Power off");
    }
    
    private void validarMarca(String marca){
        final int MIN_LENGTH = 2;
        if (marca == null || marca.isBlank() || marca.isEmpty() || marca.length() < MIN_LENGTH) {
            throw new IllegalArgumentException("Marca invalida");
        }
    }
    
    private void validarTamanio(double tamanio) {
        if (tamanio <= 0) {
            // Lanzar una excepción de tipo runtime.
            throw new IllegalArgumentException("Tamaño invalido");
        }
    }
    
    private void validarEncendido() {
        if (!estaEncendido) {
            throw new IllegalArgumentException("Televisor apagado");
        }
    }
     
    public void mostrarInfo() {
        validarEncendido();
        System.out.println(marca);
        System.out.println(canal);
        System.out.println(estaEncendido);
        System.out.println(volumen);
        System.out.println(tamanio);
        System.out.println(nroSerie);
    }
    
    public String getMarca() {
        return marca;
    }
    
    void mostrarCanal(){
      System.out.println("Canal: " + canal);  
    }
    
    void mostrarVolumen() {
        //operador ternario: funciona como un if/else, donde en ambos se retorna algo.
        System.out.println((mute) ? "Mute" : "Volumen: " + volumen);  
    }
    
    public void subirCanal() {
        validarEncendido();
        if (canal < MAX_CANAL) {
            canal ++;
        } else {
            canal = MIN_CANAL;
        }
        mostrarCanal();
    }
    
    public void bajarCanal() {
        validarEncendido();
        if (canal > MIN_CANAL) {
            canal --;
        } else {
            canal = MAX_CANAL;
        }
        mostrarCanal();
    }

    public void desmutear() {
        if (mute){
            mute = !mute;
        }
    }
    
    public void subirVolumen() {
        validarEncendido();
        if (volumen < MAX_VOL) {
            volumen ++;
            desmutear();
        }
        mostrarVolumen();
    }
    
    public void bajarVolumen() {
        validarEncendido();
        if (volumen > MIN_VOL) {
            volumen --;
        } else mute = true;
        mostrarVolumen();
    }
    
    void validarCanal(int canal){
        if (canal < MIN_CANAL || canal > MAX_CANAL) {
            throw new IllegalArgumentException("Canal inválido");
        }
        // otra opcion: if (!(canal >= MIN_CANAL && canal <= MAX_CANAL))
    }
        
    public void setearCanal(int canal) {
        validarEncendido();
        validarCanal(canal);
        if (this.canal != canal){
            this.canal = canal;
        }
        mostrarCanal();
    }
    
}