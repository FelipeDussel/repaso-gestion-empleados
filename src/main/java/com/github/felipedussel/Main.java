package com.github.felipedussel;

import com.github.felipedussel.entidades.Empleado;
import com.github.felipedussel.entidades.Empresa;

import java.util.List;

public class Main {
    static void main() {
        Empresa cima = new Empresa();
        cima.agregarEmpleado(new Empleado("Santiago", 2000000, "Marketing"));
        cima.agregarEmpleado(new Empleado("Lucia", 1500000, "Marketing"));
        cima.agregarEmpleado(new Empleado("Valentina", 1000000, "Ventas"));
        cima.agregarEmpleado(new Empleado("Joaquin", 1000000, "Ventas"));
        cima.agregarEmpleado(new Empleado("Bruno", 2200000, "IT"));
        cima.agregarEmpleado(new Empleado("Diego", 1200000, "IT"));

        cima.mostrarEmpleadosPorDepartamento("ventas");
        List<Empleado> empleadosMasDe = cima.obtenerEmpleadosMasDe(1500000);
        for (Empleado e : empleadosMasDe) {
            System.out.println(e);
        }
        System.out.println("La masa salarial del total de empleados es de: " + cima.calcularMasaSalarial());
    }
}
