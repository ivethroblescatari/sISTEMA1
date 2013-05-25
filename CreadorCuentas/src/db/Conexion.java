package db;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class Conexion {
    
private String user;
private String password;
private String db;
private String host;
private String url;
private Connection conn = null;
private Statement stm;

public Conexion(String usuario, String contraseña, String bd, String servidor){
    this.user = usuario;
    this.password = contraseña;
    this.db = bd;
    this.host = servidor;
    this.url = "jdbc:mysql://" + this.host + "/" + this.db;
    conectar();
}

private void conectar(){
    try {
        Class.forName("org.gjt.mm.mysql.Driver");
        conn = DriverManager.getConnection(url, user, password);
        if (conn != null){
            stm = conn.createStatement();
            stm.addBatch("use "+db+";");
        }
    }
    catch(SQLException ex) {
        System.out.println("Error al conectarse \n");
        Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);        
    }
    catch(ClassNotFoundException ex) {
        System.out.println("Error al conectarse \n");
        Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);        
    }
}

public boolean isConectado(){
    if(conn != null)
        return true;
    else
        return false;
}

public void query(String sqlInsert){
    try {
        stm.executeUpdate(sqlInsert);
    } catch (SQLException ex) {
        System.out.println("Error al ejecutar query: "+sqlInsert+"\n");
        Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
    }
}

public ResultSet listaResultados(String consulta){
    ResultSet rs = null;
        try {
            rs = stm.executeQuery(consulta);
        } catch (SQLException ex) {
            System.out.println("Error al buscar: "+consulta+"\n");
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    return rs;
}

public int ultimo(String tabla,String columna){
    int n = 0;
    try {
        ResultSet rs = stm.executeQuery("select * from `"+tabla+"`;");
        while(rs.next()){
            rs.last();
            n = rs.getInt(columna);
        }
    } catch (SQLException ex) {
        System.out.println("Error al buscar el ultimo elemento: \n");
        Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
    }
    return n;
}

public int nSeleccionados(String consulta){
    int n = 0;
    try {
        ResultSet rs = stm.executeQuery(consulta);
        while(rs.next())
            n++;
    } catch (SQLException ex) {
        System.out.println("Error al seleccionar elementos: \n");
        Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
    }
    return n;
}

public String ver(String consulta, String columna){
    String s = "";
    try {
        ResultSet rs = stm.executeQuery(consulta);
        while(rs.next())
           s=rs.getString(columna);
    } catch (SQLException ex) {
        System.out.println("Error al ver datos: \n");
        Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);        
    }    
    return s;
}
public void cambiarDB(String db){
        try {
            stm.addBatch("use "+db+";");
        } catch (SQLException ex) {
            System.out.println("Error al cambiar de db"+ex);
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
}

}