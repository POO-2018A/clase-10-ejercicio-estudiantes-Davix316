/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudiantes;

import java.util.*;
/**
 *
 * @author toshiba
 */
public class Estudiantes {

    private String nombre;
    private String apellido;
    private String cedula;
    private Date fechaNacimiento;
    private String[] materias;
    
    //public Estudiantes (){};
    
    public Estudiantes(String nombre, String apellido, String cedula){
        this.nombre=nombre;
        this.apellido=apellido;
        this.cedula=cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String[] getMaterias() {
        return materias;
    }

    public void setMaterias(String[] materias) {
        this.materias = materias;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
