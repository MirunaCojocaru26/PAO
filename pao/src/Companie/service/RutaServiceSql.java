package Companie.service;

import java.sql.*;

public class RutaServiceSql {
    public void programExcursii()
    {
        try (Connection c = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test", "Miruna", "parola");) {
            int ok = 0;
            PreparedStatement ps = c.prepareStatement("SELECT oras_plecare, oras_sosire FROM rute");
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
                ok=1;
                System.out.println("Urmatoarea masina spre " +rs.getString(2)+" pleaca din "+rs.getString(1));
            }
            if(ok==0)
                System.out.println("Informatie indisponibila");
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void listaMasini()
    {
        System.out.println("Marcile de masini de care dispunem:");
        try (Connection c = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test", "Miruna", "parola");) {
            int ok = 0;
            PreparedStatement ps = c.prepareStatement("SELECT marca_masina, model_masina FROM rute");
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
                ok=1;
                System.out.println("Marca: " +rs.getString(1)+" Model: "+rs.getString(2));
            }
            if(ok==0)
                System.out.println("Informatie indisponibila");
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void soferTraseu()
    {
        try (Connection c = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test", "Miruna", "parola");) {
            int ok = 0;
            PreparedStatement ps = c.prepareStatement("SELECT r.oras_plecare, r.oras_sosire,s.nume FROM rute r,soferi s where s.id=r.id_sofer");
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
                ok=1;
                System.out.println("Pe traseul "+rs.getString(1)+" -> "+rs.getString(2)+" o sa il aveti ca sofer pe "+rs.getString(3));
            }
            if(ok==0)
                System.out.println("Informatie indisponibila");
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void cautLocuri(String nume)
    {
        try (Connection c = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test", "Miruna", "parola");) {
            int ok = 0;
            PreparedStatement ps = c.prepareStatement("SELECT nr_locuri FROM rute WHERE oras_plecare=? OR oras_sosire=?");
            ps.setString(1, nume);
            ps.setString(2, nume);
            ResultSet rs = ps.executeQuery();
            if(rs.next())
            {
                ok=1;
                System.out.println("Numarul de locuri de pe aceasta ruta sunt: "+rs.getInt(1));
            }
            if(ok==0)
                System.out.println("Acest oras nu se afla pe nici o ruta a companie noastre");
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void cautaAdresaDestinatie(String oras)
    {
        try (Connection c = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test", "Miruna", "parola");) {
            int ok = 0;
            PreparedStatement ps = c.prepareStatement("SELECT * FROM rute WHERE oras_plecare=? OR oras_sosire=?");
            ps.setString(1, oras);
            ps.setString(2, oras);
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
                ok=1;
                if(rs.getString(3).equalsIgnoreCase(oras))
                    System.out.println("Strada "+rs.getString(4)+" Numarul "+rs.getInt(5)+ " din Orasul "+rs.getString(6));
                else
                    System.out.println("Strada "+rs.getString(1)+" Numarul "+rs.getInt(2)+ " din Orasul "+rs.getString(3));
            }
            if(ok==0)
                System.out.println("Nu avem nici o calatorie planificata spre aceasta destinatie");
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
