package Companie.service;

import java.sql.*;

public class FilialaServiceSql {
    public void nrMasini()
    {
        try(Connection c = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test", "Miruna", "parola");) {
            int ok=0;
            PreparedStatement ps = c.prepareStatement("SELECT SUM(nr_masini) FROM garaje");
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                ok=1;
                System.out.println("Numarul total de masini detinute de compania noastra este: "+rs.getString(1));
            }
            if(ok==0)
                System.out.println("Informatie indisponibila");
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void nrAngajatiSoferi()
    {
        try(Connection c = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test", "Miruna", "parola");) {
            int ok=0;
            PreparedStatement ps = c.prepareStatement("SELECT SUM(nr_soferi) FROM garaje");
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                ok=1;
                System.out.println("Numarul total de soferi profesionisti angajati la noi: "+rs.getString(1));
            }
            if(ok==0)
                System.out.println("Informatie indisponibila");
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void cautOras(String nume)
    {
        try (Connection c = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test", "Miruna", "parola");)
        {
            int ok = 0;
            PreparedStatement ps = c.prepareStatement("SELECT * FROM garaje WHERE oras =?");
            ps.setString(1, nume);
            ResultSet rs = ps.executeQuery();
            if (!rs.first())
                ok = ok + 1;
            else
                System.out.println("Compania noastra are un garaj de masini in acest oras");
            ps = c.prepareStatement("SELECT * FROM sedii WHERE nume =?");
            ps.setString(1, nume);
            rs = ps.executeQuery();
            if (!rs.first())
                ok = ok + 1;
            else
                System.out.println("Compania noastra are sediu in acest oras");
            if (ok == 2)
                System.out.println("Nu avem sedii in acest oras");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void cautAdresa(String nume)
    {
        try (Connection c = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test", "Miruna", "parola");)
        {
            int ok = 0;
            PreparedStatement ps = c.prepareStatement("SELECT * FROM garaje WHERE oras =?");
            ps.setString(1, nume);
            ResultSet rs = ps.executeQuery();
            if (!rs.first())
                ok = ok + 1;
            else
                System.out.println("Compania noastra are un garaj de masini in acest oras la adresa: "+rs.getString(1)+" numarul "+rs.getInt(2));
            ps = c.prepareStatement("SELECT * FROM sedii WHERE nume =?");
            ps.setString(1, nume);
            rs = ps.executeQuery();
            if (!rs.first())
                ok = ok + 1;
            else
                System.out.println("Compania noastra are sediu in acest oras la adresa: "+rs.getString(1)+" numarul "+rs.getInt(2));
            if (ok == 2)
                System.out.println("Nu avem sedii in acest oras");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
