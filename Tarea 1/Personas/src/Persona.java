
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pamela Gonzalez
 */
public class Persona {
    
        private String nombre;
        private Date edad;
        private String Apellido;
        public Persona(String nombre, Date edad, String Apellido) {
        this.nombre = nombre;
        this.edad = edad;
        this.Apellido = Apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(Date edad) {
        this.edad = edad;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public Date getEdad() {
        return edad;
    }

    public String getApellido() {
        return Apellido;
    }

    
    
}
