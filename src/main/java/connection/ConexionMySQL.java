
package connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConexionMySQL {
    // Declaramos la conexion a mysql
    private static Connection con;
    // Declaramos los datos de conexion a la bd
    private static final String driver="com.mysql.cj.jdbc.Driver";
    private static final String user="root";
    private static final String pass="";
    private static final String url="jdbc:mysql://localhost:3306/bd_gestion_personas?zeroDateTimeBehavior=CONVERT_TO_NULL";
    
    public Connection conector() throws ClassNotFoundException {
        // Reseteamos a null la conexion a la bd
        con=null;
        try{
            Class.forName(driver); 
            // Nos conectamos a la bd
            con= (Connection) DriverManager.getConnection(url, user, pass);
            // Si la conexion fue exitosa mostramos un mensaje de conexion exitosa
            if (con!=null){
                System.out.println("Conexion establecida");
            }
        }
        // Si la conexion NO fue exitosa mostramos un mensaje de error
        catch (SQLException e){
            System.out.println("Error de conexion" + e);
            return con;
        }
        return con;
    }

}
