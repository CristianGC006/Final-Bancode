package service;

import DB.ConectionDatabase;
import model.modelUsuarios;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class serviceUsuarios {
    public boolean registrarUsuario(modelUsuarios usuario) throws SQLException {
        String sql = "INSERT INTO usuarios (nombre, contraseña, correo, rol) VALUES (?, ?, ?, ?)";

        try (Connection connection = ConectionDatabase.getConnection();
             PreparedStatement stmt = connection.prepareStatement(sql)){

            stmt.setString(1, modelUsuarios.getNombre());
            stmt.setString(2, modelUsuarios.getContraseña());
            stmt.setString(3, modelUsuarios.getCorreo());
            stmt.setString(4, modelUsuarios.getRol());
            stmt.executeUpdate();
            return true;
        }catch (SQLException e){
            System.out.println("Error al registrar Usuario: " + e.getMessage());
            return false;
        }
    }

    // Método para iniciar sesión
    public modelUsuarios iniciarSesion(String correo, String contraseña){
        String sql = "SELECT * FROM usuarios WHERE correo = ? AND contraseña = ?";
        try (Connection connection = ConectionDatabase.getConnection();
             PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, correo);
            stmt.setString(2, contraseña);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()){
                return new modelUsuarios(
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getString("contraseña"),
                        rs.getString("correo"),
                        rs.getString("rol")
                );
            }

        }catch (SQLException e){
            System.out.println("Error al iniciar sesión" + e.getMessage());
        }
        return null; // Retorna null si no se encuentra el usuario
    }

}
