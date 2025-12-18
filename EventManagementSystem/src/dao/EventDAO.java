package dao;
import java.sql.*;
public class EventDAO {
    public static void addEvent(String name, String date) {
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps =
                con.prepareStatement("INSERT INTO events VALUES (?,?)");
            ps.setString(1, name);
            ps.setString(2, date);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}