package Companie.configuration;
import Companie.domain.repository.*;
import java.io.FileNotFoundException;
import java.sql.SQLException;

public class RepositoryConfiguration {
    private static RepositoryConfiguration ourInstance = new RepositoryConfiguration();
    private AngajatInterface angajatrepository;
    private FilialaInterface filialarepository;
    private RutaInterface rutarepository;
    public static RepositoryConfiguration getInstance()
    {
        //System.out.println("Sau aici?");
        return ourInstance;
    }
    private RepositoryConfiguration()
    {
        //System.out.println("Am ajuns si pe aici");
        try{
            rutarepository=new RutaRepositoryFile("B:\\Git PAO\\pao\\rute.csv");
            angajatrepository= new AngajatRepositorySql();
            filialarepository=new FilialaRepositoryFile("B:\\Git PAO\\pao\\adresaGaraje.csv","B:\\Git PAO\\pao\\adresaSedii.csv");
        }
        catch (FileNotFoundException E)
        {
            System.out.println("Fisier prost");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //System.out.println("am iesit de aici");
    }
    public AngajatInterface getAngajatrepository()
    {
        return angajatrepository;
    }
    public FilialaInterface getFilialarepository()
    {
        return filialarepository;
    }
    public RutaInterface getRutarepository()
    {
        return rutarepository;
    }
}