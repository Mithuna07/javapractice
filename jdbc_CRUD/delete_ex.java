import java.sql.*;

public class delete_ex {
    public static void main(String[] args){
        try{
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/jdbc_practice",
                    "root",
                    "mit"
            );

            PreparedStatement ps = con.prepareStatement(
                    "DELETE FROM details WHERE id=?"
            );

            ps.setInt(1,4);

            ps.executeUpdate();

            System.out.println("successful");

            con.close();
        }

        catch(Exception e){
            e.printStackTrace();
        }
    }
}

