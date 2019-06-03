package Companie.service;

import Companie.configuration.RepositoryConfiguration;
import Companie.domain.entity.Angajat;
import Companie.domain.entity.Ruta;
import Companie.domain.repository.AngajatInterface;
import Companie.domain.repository.RutaInterface;
import Companie.tool.Writer;

import java.util.List;

public class RutaService {
    RutaInterface ruta=RepositoryConfiguration.getInstance().getRutarepository();
    AngajatInterface angajat= RepositoryConfiguration.getInstance().getAngajatrepository();
    public void programExcursii()
    {
        Writer.getInstance().write("programExcursii, ");
        List<Ruta> v=ruta.getRute();
        for(int i=0;i<v.size();i++)
            System.out.println("Urmatoarea masina spre " +v.get(i).getOras_destinatie().getNume()+" pleaca din "+v.get(i).getOras_start().getNume());
    }
    public void listaMasini()
    {
        Writer.getInstance().write("listaMasini, ");
        System.out.println("Marcile de masini de care dispunem:");
        List<Ruta> v=ruta.getRute();
        for(int i=0;i<v.size();i++)
            System.out.println("Marca:" + v.get(i).getMasina().getMarca() + " Modelul: " + v.get(i).getMasina().getModel());
    }
    public void soferTraseu()
    {
        Writer.getInstance().write("soferTraseu, ");
        List<Angajat> v1=angajat.getAngajati();
        List<Ruta> v2 =ruta.getRute();
        for(int i=0;i<v1.size();i++)
            for(int j=0;j<v2.size();j++)
                if(v1.get(i).getId()==v2.get(j).getId_sofer())
                    System.out.println("Pe traseul "+v2.get(j).getOras_start().getNume()+"->"+v2.get(i).getOras_destinatie().getNume()+" o sa il aveti ca sofer pe "+v1.get(i).getNume());
    }
    public void cautLocuri(String oras)
    {
        Writer.getInstance().write("cautLocuri, ");
        int ok=0;
        List<Ruta> v=ruta.getRute();
        for(int i=0;i<v.size();i++)
            if(oras.equalsIgnoreCase(v.get(i).getOras_destinatie().getNume())||oras.equalsIgnoreCase(v.get(i).getOras_start().getNume()))
            {
                ok=1;
                System.out.println("Numarul de locuri de pe aceasta ruta sunt: "+v.get(i).getMasina().getNr_locuri());
                break;
            }
        if(ok==0)
            System.out.println("Acest oras nu se afla pe nici o ruta a companie noastre");
    }
    public void cautAdresaDestinatie(String oras)
    {
        Writer.getInstance().write("cautAdresaDestinatie, ");
        int ok=0;
        List<Ruta> v=ruta.getRute();
        for(int i=0;i<v.size();i++)
            if(oras.equalsIgnoreCase(v.get(i).getOras_destinatie().getNume()))
            {
                ok=1;
                System.out.println("Strada "+v.get(i).getOras_start().getAdresa().getStrada()+" Numarul "+v.get(i).getOras_start().getAdresa().getNumar()+ " din Orasul "+v.get(i).getOras_start().getNume());
                break;
            }
            else
            if(oras.equalsIgnoreCase(v.get(i).getOras_start().getNume()))
            {
                ok=1;
                System.out.println("Strada "+v.get(i).getOras_destinatie().getAdresa().getStrada()+" numarul "+v.get(i).getOras_destinatie().getAdresa().getNumar()+ " din Orasul "+v.get(i).getOras_destinatie().getNume());
                break;
            }
        if(ok==0)
            System.out.println("Nu avem nici o calatorie planificata spre aceasta destinatie");
    }
}
