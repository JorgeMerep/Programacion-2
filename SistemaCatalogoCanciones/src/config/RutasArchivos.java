package config;

import java.nio.file.Path;
import java.nio.file.Paths;

public interface RutasArchivos {

    static final String BASE = "src/recursos";
    static final String FILE_CSV = "canciones.csv";
    static final String FILE_BIN = "canciones.dat";

    static Path getRutaCSV() {
        return Paths.get(BASE, FILE_CSV);
    }

    static Path getRutaBIN() {
        return Paths.get(BASE, FILE_BIN);
    }

    static String getRutaCSVString() {
        return getRutaCSV().toString();
    }

    static String getRutaBINString() {
        return getRutaBIN().toString();
    }

}
