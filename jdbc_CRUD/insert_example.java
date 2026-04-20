import java.sql.*;

public class insert_example {
    public static void main(String[] args){
        try{
            Connection con = DriverManager.getConnection(
                   "jdbc:mysql://localhost:3306/jdbc_practice",
                   "root",
                   "mit"
            );

            PreparedStatement ps = con.prepareStatement(
                    "INSERT INTO details (id,name,age) VALUES(?,?,?)"
            );

            ps.setInt(1,14);
            ps.setString(2,"mith");
            ps.setInt(3,21);

            ps.executeUpdate();

            System.out.println("successful");

            con.close();
        }

        catch(Exception e){
            e.printStackTrace();
        }

    }
}
