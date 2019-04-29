package Companie.configuration;
import Companie.domain.repository.*;
import java.io.FileNotFoundException;

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
            angajatrepository=new AngajatRepositoryFile("B:\\Git PAO\\pao\\angajatPersonalAuxiliar.csv","B:\\Git PAO\\pao\\angajatSofer.csv");
            filialarepository=new FilialaRepositoryFile("B:\\Git PAO\\pao\\adresaGaraje.csv","B:\\Git PAO\\pao\\adresaSedii.csv");
        }
        catch (FileNotFoundException E)
        {
            System.out.println("Fisier prost");
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