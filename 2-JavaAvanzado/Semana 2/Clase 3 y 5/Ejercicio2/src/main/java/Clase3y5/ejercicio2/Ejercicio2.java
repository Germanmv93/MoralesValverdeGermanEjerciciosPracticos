package Clase3y5.ejercicio2;

import Clase3y5.ejercicio2.modelos.Agenda;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 *
 * @author germa
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        List<Agenda> eventos = Arrays.asList(
                new Agenda("Reunion 1", LocalDate.of(2023, 1, 21), "Reunion"),
                new Agenda("Reunion 3", LocalDate.of(2023, 2, 18), "Reunion"),
                new Agenda("Reunion 2", LocalDate.of(2023, 3, 17), "Reunion"),
                new Agenda("Taller 1", LocalDate.of(2023, 4, 5), "Taller"),
                new Agenda("Taller 2", LocalDate.of(2024, 5, 6), "Taller"),
                new Agenda("Taller 3", LocalDate.of(2024, 6, 16), "Taller"),
                new Agenda("Taller 4", LocalDate.of(2024, 7, 26), "Taller"),
                new Agenda("Conferencia 1", LocalDate.of(2024, 8, 30), "Conferencia"),
                new Agenda("Conferencia 2", LocalDate.of(2024, 9, 19), "Conferencia"),
                new Agenda("Publicacion 1", LocalDate.of(2024, 05, 6), "Publicacion"),
                new Agenda("Publicacion 2", LocalDate.of(2024, 11, 7), "Publicacion")
        );

        LocalDate fechaEspecificaDelEvento = LocalDate.of(2024, 05, 6);
        //Filtra los eventos que están programados para una fecha específica.
        List<Agenda> fechaEspecifica = eventos.stream()
                .filter(Agenda -> Agenda.getFecha().equals(fechaEspecificaDelEvento))
                .collect(Collectors.toList());
        System.out.println("Los eventos para la fecha especifica 06/05/2024 son :");
        fechaEspecifica.forEach(Agenda -> System.out.println(Agenda.getNombre()));

        //Agrupa los eventos por categoría y cuenta cuántos eventos hay en cada categoría.
        Map<String, Long> eventosPorCategoria = eventos.stream()
                .collect(Collectors.groupingBy(Agenda::getCategoria, Collectors.counting()));
        System.out.println("\nLos enventos para cada tipo de categoria son los siguientes:");
        eventosPorCategoria.forEach((categoria, cantidad) -> System.out.println("De " + categoria + " tenemos " + cantidad));

        //Encuentra el evento más próximo en el tiempo utilizando Optionals.
        Optional<Agenda> masProximo = eventos.stream()
                .min(Comparator.comparing(Agenda -> Math.abs(ChronoUnit.DAYS.between(LocalDate.now(), Agenda.getFecha()))));

        masProximo.ifPresent(Agenda -> System.out.println("\nEl evento mas proximo es " + Agenda.getNombre()));

    }
}
