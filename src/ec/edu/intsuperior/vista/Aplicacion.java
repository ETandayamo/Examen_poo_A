
package ec.edu.intsuperior.vista;

import ec.edu.intsuperior.modelo.Cliente;
import ec.edu.intsuperior.modelo.Directivo;
import ec.edu.intsuperior.modelo.Empleado;
import ec.edu.intsuperior.modelo.Empresa;
import ec.edu.intsuperior.modelo.Persona;


public class Aplicacion {
    public static void main(String[] args) {
            Persona persona = new  Persona();
        persona.getEdad();
        persona.getNombre();        
        persona.setEdad(19);
        persona.setNombre("Evelin");        
        persona.mostrar("Evelin", 20);
        
        
        Cliente clien = new Cliente();        
        clien.getTelefono_contacto();
        clien.setTelefono_contacto("0985430590);
        clien.mostrar("Luis", 19, "0985430590);
        
        
        Empleado emple = new Empleado();
        emple.getSueldo_bruto();
        emple.setSueldo_bruto(Double.MIN_NORMAL);
        emple.mostrar("Jhon", 20, 400);
        
        
        
        Directivo direc = new Directivo();        
        direc.getCategoria();
        direc.setCategoria("administrador");
        direc.mostrar("Juan", 19, 800, "administrador");
        
        
        
        Empresa empre = new Empresa();
        empre.getNombre();
        empre.setNombre("motoservi");
        empre.setNombre("motoservi");
        
        
        
    }

    }
    
