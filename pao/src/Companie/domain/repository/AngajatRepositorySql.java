package Companie.domain.repository;
import Companie.domain.entity.Angajat;
import Companie.domain.entity.PersonalAuxiliar;
import Companie.domain.entity.Sofer;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AngajatRepositorySql implements AngajatInterface{
    List<Angajat> v=new ArrayList<>();
    public List<Angajat> getAngajati()
    {
        return v;
    }

    public AngajatRepositorySql() throws SQLException {
        try(Connection c= DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test", "Miruna", "parola");) {
            PreparedStatement ps = null;
            ResultSet rs = null;
            ps = c.prepareStatement("SELECT * FROM soferi");
            rs = ps.executeQuery();
            while (rs.next())
                v.add(new Sofer(rs.getString(1),rs.getString(2),rs.getInt(3),rs.getInt(4),rs.getString(5),rs.getInt(6)));
            ps = c.prepareStatement("SELECT * FROM personalauxiliar");
            rs = ps.executeQuery();
            while (rs.next())
                v.add(new PersonalAuxiliar(rs.getString(1),rs.getString(2),rs.getInt(3),rs.getInt(4),rs.getString(5)));
        }
        catch (SQLException ex)
        {
            System.out.println("Eroare la conectarea la BD: " + ex);
        }
    }
}
