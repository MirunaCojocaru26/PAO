package Companie.configuration;

import Companie.domain.repository.*;

import java.io.FileNotFoundException;

public class RepositoryConfiguration {
    private static RepositoryConfiguration ourInstance = new RepositoryConfiguration();
    public static RepositoryConfiguration getInstance() {
        return ourInstance;
    }
    private RepositoryConfiguration() {
        try{
            rutarepository=new RutaRepositoryFile("rute.csv");
            angajatrepository=new AngajatRepositoryFile("angajatPersonalAuxiliar.csv","angajatSofer.csv");
            filialarepository=new FilialaRepositoryFile("adresaGaraje.csv","adresaSedii.csv");
        }
        catch (FileNotFoundException E)
        {
            System.out.println("Fisier prost");
        }
    }
    private AngajatInterface angajatrepository=new AngajatRepository();
    private FilialaInterface filialarepository=new FilialaRepository();
    private RutaInterface rutarepository=null;
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