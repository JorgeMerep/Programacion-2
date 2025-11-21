package config;

import java.nio.file.Path;
import java.nio.file.Paths;

public interface RutaArchivos {

    static final String BASE = "src/recursos";
    static final String FILE_CSV = "peliculas.csv";
    static final String FILE_BIN = "peliculas.dat";

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
