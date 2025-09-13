package practica1;

public class Televisor {

    //Atributos de la clase    
    private final String marca;
    private final double tamanio;
    private int canal = INIT_CANAL;
    private int volumen;
    private boolean encendido;
    private boolean mute;
    //Constantes
    private final int nroSerie;
    private final static int MAX_CANAL = 100; //La palabra reservada static
    private final static int MIN_CANAL = 1;  //hace que la variable se inicie 
    private final static int INIT_CANAL = 1; //una sola vez para todas las instancias
    private final static int MAX_VOL = 5;
    private final static int MIN_VOL = 1;
    private final static int INIT_NRO_SERIE = 100_000; // El "_" permite leer numeros de manera mas agil
    private static int nextNroSerie = INIT_NRO_SERIE;

    //Constructor especifico con parametros de la clase
    public Televisor(String marca, double tamanio) {
        validarTamanio(tamanio);
        validarMarca(marca);
        this.marca = marca;     //this soluciona el conflicto entre nombre de 
        this.tamanio = tamanio;//variable y nombre de atributo
        this.nroSerie = getSerieAndIncrement();
    }

    //VALIDACIONES
    private void validarTamanio(double tamanio) {
        if (tamanio <= 0) {
            throw new IllegalArgumentException("Tamaño invalido");
        }
    }

    private void validarMarca(String marca) {
        if (marca == null || marca.isBlank() || marca.isEmpty() || marca.length() < 2) {
            throw new IllegalArgumentException("Marca invalida");
        }
    }

    private void validarEncendido() {
        if (!encendido) {
            throw new IllegalStateException("Apagado");
        }
    }
    
    private void validarCanal(int canalSeleccionado){
        if (canalSeleccionado < MIN_CANAL || canalSeleccionado > MAX_CANAL) {
            throw new IllegalArgumentException("Canal fuera de rango. Canales posibles entre " + MIN_CANAL + " y " + MAX_CANAL);}
    }

    private static int getSerieAndIncrement() {
        return nextNroSerie++;
    }

    //ENCENDIDO  
    public void power() {
        encendido = !encendido;
        System.out.println((encendido) ? "Power On" : "Power Off");
    }

    //MUTE
    public void mute() {
        validarEncendido();
        mute = !mute;
        mostrarVolumen();
    }

    //MOSTRAR INFO 
    public void mostrarInfo() {
        System.out.println("Marca: " + this.marca);
        System.out.println("Tamaño: " + this.tamanio);
        System.out.println("Canal: " + this.canal);
        System.out.println("Volumen: " + this.volumen);
        System.out.println("Encendido: " + this.encendido);
        System.out.println("Mute: " + this.encendido);
    }

    private void mostrarCanal() {
        System.out.println("Canal: " + canal);
    }

    private void mostrarVolumen() {
        System.out.println(mute ? "Mute:ON" : "Volumen" + volumen);
    }

    //CANALES
    public void subirCanal() {
        validarEncendido();
        if (canal < MAX_CANAL) {
            canal++;
        } else {
            canal = MIN_CANAL;
        }
        mostrarCanal();
    }

    public void bajarCanal() {
        validarEncendido();
        if (canal > MIN_CANAL) {
            canal--;
        } else {
            canal = MAX_CANAL;
        }
        mostrarCanal();
    }

    public void irCanalEspecifico(int canalSeleccionado) {
        validarEncendido();
        validarCanal(canalSeleccionado);
        this.canal = canalSeleccionado;
        mostrarCanal();
    }

    //VOLUMEN
    public void subirVolumen() {
        validarEncendido();
        if (volumen < MAX_VOL) {
            volumen++;
            mute = false;
        }
        mostrarVolumen();
    }

    public void bajarVolumen() {
        validarEncendido();
        if (volumen > MIN_VOL) {
            volumen--;
            mute = false;
        } else {
            mute = true;
        }
        mostrarVolumen();
    }

}
