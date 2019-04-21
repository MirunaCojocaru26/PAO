package Companie.service;

import Companie.configuration.RepositoryConfiguration;
import Companie.domain.entity.Angajat;
import Companie.domain.entity.Ruta;
import Companie.domain.repository.AngajatInterface;
import Companie.domain.repository.AngajatRepository;
import Companie.domain.repository.RutaInterface;
import Companie.domain.repository.RutaRepository;

public class RutaService {
    RutaInterface ruta=RepositoryConfiguration.getInstance().getRutarepository();
    AngajatInterface angajat= RepositoryConfiguration.getInstance().getAngajatrepository();
    public void programExcursii()
    {
        Ruta v[]=ruta.getRute();
        for(int i=0;i<4;i++)
            System.out.println("Urmatoarea masina spre " +v[i].getOras_destinatie().getNume()+" pleaca din "+v[i].getOras_start().getNume());
    }
    public void listaMasini()
    {
        System.out.println("Marcile de masini de care dispunem:");
        Ruta v[]=ruta.getRute();
        for(int i=0;i<=3;i++)
            System.out.println("Marca:" + v[i].getMasina().getMarca() + " Modelul: " + v[i].getMasina().getModel());
    }
    public void soferTraseu()
    {
        Angajat v1[]=angajat.getAngajati();
        Ruta v2[]=ruta.getRute();
        for(int i=0;i<v1.length;i++)
            for(int j=0;j<v2.length;j++)
                if(v1[i].getId()==v2[j].getId_sofer())
                    System.out.println("Pe traseul "+v2[j].getOras_start().getNume()+"->"+v2[i].getOras_destinatie().getNume()+" o sa il aveti ca sofer pe "+v1[i].getNume());
    }
    public void cautLocuri(String oras)
    {
        int ok=0;
        Ruta v[]=ruta.getRute();
        for(int i=0;i<v.length;i++)
            if(oras.equalsIgnoreCase(v[i].getOras_destinatie().getNume())||oras.equalsIgnoreCase(v[i].getOras_start().getNume()))
            {
                ok=1;
                System.out.println("Numarul de locuri de pe aceasta ruta sunt: "+v[i].getMasina().getNr_locuri());
                break;
            }
        if(ok==0)
            System.out.println("Acest oras nu se afla pe nici o ruta  companie noastre");
    }
    public void cautAdresaDestinatie(String oras)
    {
        int ok=0;
        Ruta v[]=ruta.getRute();
        for(int i=0;i<v.length;i++)
            if(oras.equalsIgnoreCase(v[i].getOras_destinatie().getNume()))
            {
                ok=1;
                System.out.println("Strada "+v[i].getOras_start().getAdresa().getStrada()+" Numarul "+v[i].getOras_start().getAdresa().getNumar()+ " din Orasul"+v[i].getOras_start().getNume());
                break;
            }
            else
            if(oras.equalsIgnoreCase(v[i].getOras_start().getNume()))
            {
                ok=1;
                System.out.println("Strada "+v[i].getOras_destinatie().getAdresa().getStrada()+" numarul "+v[i].getOras_destinatie().getAdresa().getNumar()+ " din Orasul "+v[i].getOras_destinatie().getNume());
                break;
            }
        if(ok==0)
            System.out.println("Nu avem nici o calatorie planificata spre aceasta destinatie");
    }
}
