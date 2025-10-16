package gimnasio;

import java.time.LocalDate;
import java.time.Month;


public class GimnasioApp {

    public static void main(String[] args) {
        
        Gimnasio gym = new Gimnasio("GYM", "Calle Trucha 123");
        
        gym.agregarEntrenador(new PersonalTrainer("112233", "Alberto", "Martinez", LocalDate.of(2018, 3, 9), 1000000, 25));
        gym.agregarEntrenador(new PersonalTrainer("112235", "Julieta", "Ruiz", LocalDate.of(2020, 3, 11), 1000000, 35));
        gym.agregarEntrenador(new PersonalTrainer("112237", "Tatiana", "Perez", LocalDate.of(2022, 3, 12), 1000000, 45));
        gym.agregarEntrenador( new EntrenadorEquipo("112234", "Gonzalo", "Diaz", LocalDate.of(2019, 3, 10), 1000000));
        gym.agregarEntrenador(new EntrenadorEquipo("112236", "Raul", "Villalba", LocalDate.of(2021, 3, 10), 1000000));
        gym.agregarEntrenador(new EntrenadorEquipo("112239", "Julio", "Benitez", LocalDate.of(2023, 3, 10), 1000000));
        
        gym.mostrarSueldos();
        PersonalTrainer p = gym.entrenadorConMasClientes();
        // salvar en caso de que no existan Personal trainers
        System.out.println("Personal trainer con mas clientes: " + p.nombreCompleto() + " | Total: " + p.getCantClientes() + " clientes");
    }
    
}
