package clases3y5.ejercicio1;

import clases3y5.ejercicio1.modelos.Empleado;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 *
 * @author germa
 */
public class Ejercicio1 {

    public static void main(String[] args) {

        List<Empleado> empleados = Arrays.asList(
                new Empleado("German", 1657.50, "Programador"),
                new Empleado("Jose David", 3215.56, "Gerente"),
                new Empleado("David", 1263.50, "Programador"),
                new Empleado("Miguel", 1723.50, "Programador"),
                new Empleado("Nicolas", 1254.60, "Administrativo"),
                new Empleado("Luisina", 1657.50, "Programador"),
                new Empleado("Sandra", 1654.60, "Administrativo"),
                new Empleado("Ariadna", 1800.89, "Analista"),
                new Empleado("Jose Daniel", 2500.60, "QA")
        );

        //Filtra los empleados cuyo salario sea mayor a cierto valor específico. Por ejemplo 1700€.
        List<String> empleadosPorSalario = empleados.stream()
                .filter(e -> e.getSalario() > 1700.0)
                .map(Empleado::getNombre)
                .collect(Collectors.toList());
        System.out.println("Los empleados con salario mayor a 1700 son: \n");
        empleadosPorSalario.forEach(System.out::println);
        
        //Encuentra al empleado con el salario más alto utilizando Optionals.
        Optional<Empleado> empleadoMaxSalario = empleados.stream()
                .max((e1,e2) -> Double.compare(e1.getSalario(), e2.getSalario()));
        empleadoMaxSalario.ifPresent(empleado -> System.out.println("\nEl empleado con el sueldo mas alto es " + empleado.getNombre().toUpperCase() + " con un salario de " + empleado.getSalario() + "€\n"));
        
        
        //Solo se notaran cambios en las categoria Programador, Administrativo.
        //Agrupa los empleados por categoría y calcula el salario promedio para cada categoría.
        Map<String,Double> salarioPromedio = empleados.stream()
                .collect(Collectors.groupingBy(Empleado::getCategoria,Collectors.averagingDouble(Empleado:: getSalario)));
        
        System.out.println("El salario promedio por categoria es ");
        salarioPromedio.forEach((categoria,promedio) -> System.out.println(categoria + ": " + promedio));
    }
}
