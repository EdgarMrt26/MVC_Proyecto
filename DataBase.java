/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import java.sql.*;
import java.util.*;
/**
 *
 * @author PC
 */
public class DataBase {
    
    private final String URL="jdbc:mysql://localhost:3306/publicacion";
    private final String user="Sai";
    private final String password="M2023";
    
    private Connection conexion;//Para conexión con la BD
    
    public DataBase(){//Constructor de la clave
        try{
            //Usando Driver conector y cadena de conexión para conectar BD
            conexion=DriverManager.getConnection(URL, user, password);
            System.out.println("Conexión Establecida");
            
        }catch(SQLException e){
            System.out.println("Error de conexión");
            e.printStackTrace();
        }
        
    }
    
    public int Actualizar(String consulta){
        
        try{ //Para manejar errores al realizar la conexión y transacción
            Statement st=conexion.createStatement();
            return st.executeUpdate(consulta);
        }catch (SQLException e){
            
;            
        }
        return 0;
    }
    
    private List OrganizarDatos(ResultSet rs){
        List filas= new ArrayList();
        try{
            
            int numColumnas=rs.getMetaData().getColumnCount();
            while(rs.next()){
                Map<String, Object> renglon=new HashMap();
                for(int i=1; i<=numColumnas; i++){
                    //Se obtiene nombre de campo en la BD
                    String nombreCampo=rs.getMetaData().getColumnName(i);
                    Object valor=rs.getObject(nombreCampo);
                    //Por cada campo se obtiene el nombre y el valor del mismo
                    renglon.put(nombreCampo, valor);
                }
                filas.add(renglon);//Se agrega al arreglo cada registro
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return filas;
    }
    
    public List Listar(String consulta){
        ResultSet rs=null;
        List resultado=new ArrayList();
        try{
            Statement st=conexion.createStatement();
            rs=st.executeQuery(consulta);
            resultado=OrganizarDatos(rs); 
            
        }catch(SQLException e){
            System.err.println("No se realizó la consulta");
            e.printStackTrace();
        }
        return resultado;
    }
    
    
    
    public void cerrarConexion(){
        try{
            conexion.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    
    
    
}
