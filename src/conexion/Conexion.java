/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author leoxi
 */
public class Conexion {
    Connection Conect = null;
    public Connection conectar(){
        try{
//            Class.forName("org.gjt.mm.mysql.Driver");
            
            Class.forName("com.mysql.jdbc.Driver");
            Conect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mvc","MORJAN","Moreno.880501");
            JOptionPane.showMessageDialog(null, "conectado a la Base de Datos !!!");
            System.out.println("conectado a la Base de Datos !!!");
        }catch(Exception e){
            System.err.println("=> "+e.getMessage());
            JOptionPane.showMessageDialog(null,e,"ERROR EN CONEXIÓN A DB",JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        return Conect;
    }
}
