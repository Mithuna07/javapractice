import java.sql.*;

public class update_ex {
    public static void main(String[] args){
        try{
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/jdbc_practice",
                    "root",
                    "mit"
            );

            PreparedStatement ps = con.prepareStatement(
                    "UPDATE details SET age=? WHERE id=?"
            );

            ps.setInt(1,22);
            ps.setInt(2,4);

            ps.executeUpdate();

            System.out.println("successful");

            con.close();
        }

        catch(Exception e){
            e.printStackTrace();
        }

    }
}

