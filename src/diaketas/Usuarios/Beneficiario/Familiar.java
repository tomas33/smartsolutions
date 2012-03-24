/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package diaketas.Usuarios.Beneficiario;

import com.mysql.jdbc.Statement;
import diaketas.ConexionBD;
import diaketas.Usuarios.ONG;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kesada
 */
public class Familiar {
    public String Nombre_Apellidos;
    public Date Fecha_Nacimiento;
    public String Ocupacion;
    public int Cod_Familiar;
    

    public Familiar(String Nombre_Apellidos, Date Fecha_Nacimiento, String Ocupacion) {
        this.Nombre_Apellidos = Nombre_Apellidos;
        this.Fecha_Nacimiento = Fecha_Nacimiento;
        this.Ocupacion = Ocupacion;
        this.Cod_Familiar = 0;
    }
    
    void cambiarDatosFamiliar(String Nombre_Apellidos, Date Fecha_Nacimiento, String Ocupacion, String Parentesco){
        this.Nombre_Apellidos = Nombre_Apellidos;
        this.Fecha_Nacimiento = Fecha_Nacimiento;
        this.Ocupacion = Ocupacion;
        java.sql.Timestamp fecha_Nacimiento = new java.sql.Timestamp(Fecha_Nacimiento.getTime());

        ConexionBD con = new ConexionBD();
        con.conectarBD();

        //REVISAR
         try {
            Statement instruccion = (Statement) con.conexion().createStatement();
            /*Actualizamos Familiar*/
            instruccion.executeUpdate("UPDATE  Familiar SET Nombre_Apellidos = \""
                    + Nombre_Apellidos + "\", Fecha_Nacimiento = \""+fecha_Nacimiento+"\", Ocupacion = \""
                    + Ocupacion + "\" WHERE Cod_Familiar = " + Cod_Familiar);
            
            /*Actualizamos Parentesco*/
            instruccion.executeUpdate("UPDATE  Parentesco SET Parentesco = \""
                    + Parentesco + "\" WHERE Cod_Familiar = " + Cod_Familiar + " and "
                    + "DNI_CIF = \""+Gestor_de_beneficiarios.datosBeneficiario.NIF_CIF+"\"");
         }
         /*Captura de errores*/
         catch(SQLException e){ System.out.println(e); }
         catch(Exception e){ System.out.println(e);}
         /*Desconexión de la BD*/
         finally {
            if (con.hayConexionBD()) {
                try {
                    con.desconectarBD();
                } catch (SQLException ex) {
                    Logger.getLogger(ONG.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    
    public Parentesco obtenerDatosFamiliar(){
        ConexionBD con = new ConexionBD();
        con.conectarBD();
        Parentesco parentesco = null;

        //REVISAR
         try {
            Statement instruccion = (Statement) con.conexion().createStatement();
            ResultSet rs = instruccion.executeQuery("Select p.Parentesco from Parentesco p WHERE "
                    + "DNI_CIF = \""+Gestor_de_beneficiarios.datosBeneficiario.NIF_CIF+"\" and "
                    + " Cod_Familiar="+this.Cod_Familiar);
         
            if (rs.next()){
                parentesco = new Parentesco(Cod_Familiar, Gestor_de_beneficiarios.datosBeneficiario.NIF_CIF,rs.getString(1));
            }
         }
         /*Captura de errores*/
         catch(SQLException e){ System.out.println(e); }
         catch(Exception e){ System.out.println(e);}
         /*Desconexión de la BD*/
         finally {
            if (con.hayConexionBD()) {
                try {
                    con.desconectarBD();
                } catch (SQLException ex) {
                    Logger.getLogger(ONG.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return parentesco;
    }
    
    public void eliminarFamiliar (){
        ConexionBD con = new ConexionBD();
        con.conectarBD();
        Familiar familiar = null;
        //RETOCAR DNI_CIF
        
        try {
            Statement instruccion = (Statement) con.conexion().createStatement();
            //REVISAR DNI_CIF
            System.out.println("DELETE FROM Parentesco p WHERE"
                    + " p.Cod_Familiar = " + Cod_Familiar + " and p.DNI_CIF= \""
                    +Gestor_de_beneficiarios.datosBeneficiario.NIF_CIF+"\"");
            /*Eliminamos el parentesco que guarda con el familiar*/
            instruccion.executeUpdate("DELETE FROM Parentesco WHERE"
                    + " Cod_Familiar = " + Cod_Familiar + " and DNI_CIF= \""
                    +Gestor_de_beneficiarios.datosBeneficiario.NIF_CIF+"\"");
            /*Comprobamos si guarda más parentescos con el resto*/
            ResultSet rs = instruccion.executeQuery("SELECT COUNT(*) FROM Parentesco WHERE"
                    + " Cod_Familiar = " + Cod_Familiar);
            if (rs.next()){
                int HayRelacionesParentesco = rs.getInt(1);
                
                if (HayRelacionesParentesco == 0)
                {
                    /*Ese familiar no es pariente de ningun otro beneficiario y se borra*/
                        instruccion.executeUpdate("DELETE FROM Familiar WHERE"
                            + " Cod_Familiar = "+Cod_Familiar);                   
                }
            }
         }
         /*Captura de errores*/
         catch(SQLException e){ System.out.println(e); }
         catch(Exception e){ System.out.println(e);}
         /*Desconexión de la BD*/
         finally {
            if (con.hayConexionBD()) {
                try {
                    con.desconectarBD();
                } catch (SQLException ex) {
                    Logger.getLogger(ONG.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }         
    }
}