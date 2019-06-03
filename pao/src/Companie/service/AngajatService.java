package Companie.service;

import Companie.configuration.RepositoryConfiguration;
import Companie.domain.entity.Angajat;
import Companie.domain.entity.Sofer;
import Companie.domain.repository.AngajatInterface;
import java.util.List;

public class AngajatService {
    AngajatInterface angajat= RepositoryConfiguration.getInstance().getAngajatrepository();
    public void cautDupaNume(String nume)
    {
        List<Angajat> v=angajat.getAngajati();
        int ok=0;
        for(int i=0;i<v.size();i++)
            if(v.get(i).getNume().indexOf(nume)>=0)
            {
                ok=1;
                System.out.println(v.get(i).getNume());
            }
        if(ok==0)
            System.out.println("Nu am gasit nici un angajat cu acest nume in baza de date");
    }
    public void soferulCuCeaMaiMareExperienta()
    {
        List<Angajat> v=angajat.getAngajati();
        int max=0, poz=0;
        for(int i=0;i<v.size();i++)
            if(v.get(i) instanceof Sofer)
            {
                Sofer aux=(Sofer)v.get(i);
                if(aux.getExperienta()>max)
                {
                    max = aux.getExperienta();
                    poz=i;
                }
            }
        Sofer aux=(Sofer)v.get(poz);
        System.out.println("Soferul cu cea mai mare experienta din firma noastra este "+aux.getNume()+" si are o experienta de "+aux.getExperienta()+" ani.");
    }
}
