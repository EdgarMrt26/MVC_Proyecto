/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import java.sql.Date;
/**
 *
 * @author PC
 */
public class Autor {
    
    private int id_autor;
    private String cedula;        
    private String nombres;
    private String Apellidos;
    private String email;
    private String fecha_nac;
    
    public Autor(int id_autor, String cedula, String nombres, String apellidos,
            String email, Date fechaNac){
        this.id_autor= id_autor;
        this.cedula= cedula;
        this.nombres= nombres;
        this.Apellidos= Apellidos;
        this.email= email;
        this.fecha_nac= fecha_nac;
    }

    public int getId_autor() {
        return id_autor;
    }

    public void setId_autor(int id_autor) {
        this.id_autor = id_autor;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFechaNac() {
        return fecha_nac;
    }

    public void setFechaNac(String fechaNac) {
        this.fecha_nac = fechaNac;
    }
    
    
    
}
