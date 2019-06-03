package Companie.domain.repository;

import Companie.domain.entity.Filiala;
import Companie.domain.entity.GarajMasini;
import Companie.domain.entity.SediuAngajati;

import java.sql.*;
import java.util.TreeSet;

public class FilialaRepositorySql implements FilialaInterface {
    TreeSet<Filiala> v=new TreeSet<>();
    public TreeSet<Filiala> getFiliale() {
        return v;
    }
    public FilialaRepositorySql() throws SQLException {
        try(Connection c= DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test", "Miruna", "parola");) {
            PreparedStatement ps = null;
            ResultSet rs = null;
            ps = c.prepareStatement("SELECT * FROM garaje");
            rs = ps.executeQuery();
            while (rs.next())
                v.add(new GarajMasini(rs.getString(1),rs.getInt(2),rs.getString(3),rs.getInt(4),rs.getInt(5)));
            ps = c.prepareStatement("SELECT * FROM sedii");
            rs = ps.executeQuery();
            while (rs.next())
                v.add(new SediuAngajati(rs.getString(1),rs.getInt(2),rs.getString(3),rs.getInt(4)));
        }
        catch (SQLException ex)
        {
            System.out.println("Eroare la conectarea la BD: " + ex);
        }
    }
}
