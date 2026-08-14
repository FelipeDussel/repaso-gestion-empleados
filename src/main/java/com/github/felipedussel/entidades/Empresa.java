package com.github.felipedussel.entidades;

import java.util.ArrayList;
import java.util.List;

public class Empresa {

    private List<Empleado> empleados = new ArrayList<>();

    public void agregarEmpleado(Empleado e) {
        empleados.add(e);
    }

    public double calcularMasaSalarial() {
        double masaSalarial = 0;
        for (Empleado e : empleados) {
            masaSalarial += e.getSueldo();
        }
        return masaSalarial;
    }

    public List<Empleado> obtenerEmpleadosMasDe(double sueldo) {
        List<Empleado> empleadosMasDe = new ArrayList<>();
        for (Empleado e : empleados) {
            if (e.getSueldo() > sueldo) {
                empleadosMasDe.add(e);
            }
        }
        return empleadosMasDe;
    }

    public void mostrarEmpleadosPorDepartamento(String departamento) {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("DEPARTAMENTO: " + departamento + "\n");
        for (Empleado e : empleados) {
            if (e.getDepartamento().equalsIgnoreCase(departamento)) {
                System.out.println(e);
            }
        }
        System.out.println("----------------------------------------------------------------------------\n");
    }
}
