package Companie.service;
import java.sql.*;

public class AngajatServiceSql {
    public void cautDupaNume(String nume) {
        try (Connection c = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test", "Miruna", "parola");) {
            int ok = 0;
            PreparedStatement ps = c.prepareStatement("SELECT nume FROM soferi WHERE nume =?");
            ps.setString(1, nume);
            ResultSet rs = ps.executeQuery();
            if (!rs.first())
                ok = ok + 1;
            else
                System.out.println("Aceasta persoana este angajata la noi pe postul de sofer");
            ps = c.prepareStatement("SELECT meserie FROM personalauxiliar WHERE nume =?");
            ps.setString(1, nume);
            rs = ps.executeQuery();
            if (!rs.first())
                ok = ok + 1;
            else
                System.out.println("Aceasta persoana este angajata la noi pe postul de " + rs.getString(1));
            if (ok == 2)
                System.out.println("Nu exista nici un angajat cu acest nume in baza de date");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void soferulCuCeaMaiMareExperienta() {
        try (Connection c = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test", "Miruna", "parola");) {
            int ok = 0;
            PreparedStatement ps = c.prepareStatement("SELECT nume FROM soferi WHERE experienta=(SELECT MAX(experienta) from soferi)");
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                ok=1;
                System.out.println(rs.getString(1));
            }
            if(ok==0)
                System.out.println("Informatie indisponibila");
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
}