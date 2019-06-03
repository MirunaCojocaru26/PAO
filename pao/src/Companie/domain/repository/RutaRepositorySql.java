package Companie.domain.repository;
import Companie.domain.entity.Ruta;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class RutaRepositorySql implements RutaInterface{
    List<Ruta> v=new ArrayList<>();
    public List<Ruta> getRute() {
        return null;
    }
    public RutaRepositorySql() throws SQLException {
        try(Connection c= DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test", "Miruna", "parola");) {
            PreparedStatement ps = null;
            ResultSet rs = null;
            ps = c.prepareStatement("SELECT * FROM rute");
            rs = ps.executeQuery();
            while (rs.next())
                v.add(new Ruta(rs.getString(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getInt(9), rs.getInt(10)));
        }
        catch (SQLException ex)
        {
            System.out.println("Eroare la conectarea la BD: " + ex);
        }
    }
}
