import java.sql.*;

public class Main {
    public static void main(String[] args) {
        String url="jdbc:oracle:thin:@localhost:1521:xe";
        String user="RIBERA";
        String password="ribera";

        try (Connection conn = DriverManager.getConnection(url,user,password)){
            String sql="DELETE FROM empleado2 WHERE id=?";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);

            preparedStatement.setInt(1,10);

            int Eliminado=preparedStatement.executeUpdate();
            System.out.println("Filas eliminadas: "+Eliminado);
        }catch (SQLException e){
            System.out.println("ERROR: "+e.getMessage());
        }
    }
}