
package model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;


public class Catalogo<T extends CSVSerializable>{
    
    List<T> lista = new ArrayList<>();
    
    
     public void agregar(T elemento) {

        Objects.requireNonNull(elemento, "Elemento invalido");
        lista.add(elemento);
    }

    private void validarIndiceElemento(int indiceElemento) {

        if (indiceElemento < 0 || indiceElemento >= lista.size()) {
            throw new IndexOutOfBoundsException("Indice fuera de rango");
        }
    }

    public void eliminar(int indiceElemento) {

        validarIndiceElemento(indiceElemento);
        lista.remove(indiceElemento);
    }

    public T obtener(int indiceElemento) {

        validarIndiceElemento(indiceElemento);
        return lista.get(indiceElemento);
    }

    public List<T> filtrar(Predicate<T> filtro) {

        List<T> toReturn = new ArrayList<T>();

        for (T elemento : lista) {
            if (filtro.test(elemento)) {
                toReturn.add(elemento);
            }
        }

        return toReturn;

    }

    // Metodo ordenar con sobrecarga. Recibe un Comparator
    public void ordenar(Comparator<T> comparator) {

        lista.sort(comparator);
    }

    public void ordenar() {

        ordenar((Comparator<T>) Comparator.naturalOrder());
    }

    // Metodo que sirve para mostrar mediante lambda
    public void paraCadaElemento(Consumer<T> accion) {

        for (T elemento : lista) {
            accion.accept(elemento);
        }
    }

    // SERIALIZAR BINARIO
    public void guardarEnArchivo(String path) {

        try (ObjectOutputStream serializador = new ObjectOutputStream(new FileOutputStream(path))) {
            serializador.writeObject(lista);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    // DESERIALIZAR BINARIO
    public void cargarDesdeArchivo(String path) {

        List<T> toReturn = new ArrayList<>();
        try (ObjectInputStream deser = new ObjectInputStream(new FileInputStream(path))) {
            toReturn = (List<T>) deser.readObject();
            this.lista = toReturn;
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }
    

    // GUARDAR EN CSV
    public void guardarEnCSV(String path) {

        try (BufferedWriter escritor = new BufferedWriter(new FileWriter(path))) {
            for (T elemento : lista) {
                escritor.write(elemento.toCSV());
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }

    // CARGAR CSV
    public void cargarDesdeCSV(String path, Function<String, T> transf) {

        List<T> toReturn = new ArrayList<>();
        try (BufferedReader lector = new BufferedReader(new FileReader(path))) {
            String linea;
            while ((linea = lector.readLine()) != null) {
                toReturn.add(transf.apply(linea));
            }

            this.lista = toReturn;

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}


