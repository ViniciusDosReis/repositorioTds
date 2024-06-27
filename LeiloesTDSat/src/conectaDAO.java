import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class conectaDAO {

    public Connection connectDB() {
        Connection conn = null;
        try {
            String url = "jdbc:mysql://localhost:3306/uc11"; // Substitua com sua URL do banco de dados
            String user = "root"; // Substitua com seu usuário do banco de dados
            String password = "sasuke12lee"; // Substitua com sua senha do banco de dados
            conn = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro de Conexão: " + e.getMessage());
        }
        return conn;
    }
}
