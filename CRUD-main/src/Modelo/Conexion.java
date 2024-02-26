package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    private Connection con = null;

    private static final String base = "conexion"; // Nombre de la base de datos
    private static final String url = "jdbc:mysql://localhost:3306/" + base;
    private static final String user = "root"; // Reemplaza con tu usuario de MySQL
    private static final String password = "123123"; // Reemplaza con tu contraseña de MySQL

    public Connection getConexion() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Error al conectar a la base de datos:");
            e.printStackTrace();
        }
        return con;
    }

    public static void main(String[] args) {
        Conexion conexion = new Conexion();
        Connection con = conexion.getConexion();

        if (con != null) {
            System.out.println("¡Conectado exitosamente a la base de datos!");
            // Realiza operaciones de base de datos aquí
            try {
                con.close();
                System.out.println("Conexión cerrada.");
            }catch (SQLException e) {
                System.err.println("Error al cerrar la conexión:");
                e.printStackTrace();
            }
            // Código para usar la conexión
                    } else {
            System.err.println("No se pudo conectar a la base de datos.");
        }
    }
}
