package Companie.configuration;

import Companie.domain.repository.*;

public class RepositoryConfiguration {
    private static RepositoryConfiguration ourInstance = new RepositoryConfiguration();
    public static RepositoryConfiguration getInstance() {
        return ourInstance;
    }
    private RepositoryConfiguration() {}
    private AngajatInterface angajatrepository=new AngajatRepository();
    private FilialaInterface filialarepository=new FilialaRepository();
    private RutaInterface rutarepository=new RutaRepository();
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