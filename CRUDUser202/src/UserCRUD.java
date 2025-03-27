/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
public class UserCRUD {
    
    private Connection conexion;
    
    public UserCRUD(){
        conexion= ConexionMySQL.conectar();
    }
    
    public boolean crearUsuario(String nom,String cor,String contra){
        
        String sqlInsert= "INSERT INTO usuarios(nombre,correo,contrasena)VALUE (?,?,?)";
        
        try{
            PreparedStatement ps = conexion.prepareStatement(sqlInsert);
            ps.setString(1,nom);
            ps.setString(2,cor);
             ps.setString(3,contra);
             return ps.executeUpdate()> 0;
        }
        catch(SQLException e){
            System.out.println ("Error al intentar Insertar:"+ e.getMessage());
            return false;
            
        }
    }//fin del insert
    public ResultSet obtenerUsuarioPorId(int id){
        String selectSql= "SELECT  * FROM  Usuarios WHERE id= ?";
        
        try{
           PreparedStatement ps= conexion.prepareStatement(selectSql);
           ps.setInt(1, id);
           return ps.executeQuery();
        }
        catch(SQLException e){
            System.out.println ("Error al intentar Consultar:"+ e.getMessage());
            return null;
        }
    }//fin obtener usurios por id
    
    public ResultSet obtenerTodos(){
        String sqlTodos="SELECT * FROM Usuarios";
       
        try{
           PreparedStatement ps= conexion.prepareStatement(sqlTodos); 
           return ps.executeQuery();
        }
        catch(SQLException w){
           System.out.println ("Error al intentar Consultar:"+ w.getMessage());
            return null;
        }
    }
    
}
