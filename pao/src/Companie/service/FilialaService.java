package Companie.service;

import Companie.configuration.RepositoryConfiguration;
import Companie.domain.entity.Filiala;
import Companie.domain.entity.GarajMasini;
import Companie.domain.entity.SediuAngajati;
import Companie.domain.repository.FilialaInterface;

public class FilialaService {
    FilialaInterface filiala = RepositoryConfiguration.getInstance().getFilialarepository();
    int sum=0;
    public void nrMasini()
    {
        Filiala v[]=filiala.getFiliale();
        for(int i=0;i<v.length;i++)
        {
            if(v[i] instanceof GarajMasini)
            {
                GarajMasini ref = (GarajMasini)v[i];
                sum=sum+ref.getNr_masini();
            }
        }
        System.out.println("Numarul total de masini de care dispunem este: " + sum);
    }
    public void nrAngajatiSoferi()
    {
        Filiala v[]=filiala.getFiliale();
        int sum=0, total=0;
        for(int i=0;i<v.length;i++)
        {
            if(v[i] instanceof GarajMasini)
            {
                GarajMasini ref = (GarajMasini)v[i];
                sum=sum+ref.getNr_soferi();
                total=total+ref.getNr_soferi();
            }
            else
            {
                SediuAngajati aux=(SediuAngajati) v[i];
                total=total+aux.getNr_angajeti();
            }
        }
        System.out.println("Numarul total de angajati ai firmei noastre este: " + total+ " dintre care: "+sum+ " sunt soferi autorizati si foarte bine pregatiti.");
    }
    public void cautOras(String oras)
    {
        Filiala v[]=filiala.getFiliale();
        int ok=0;
        for(int i=0;i<v.length;i++)
            if(oras.equalsIgnoreCase(v[i].getOras().getNume()))
            {
                ok=1;
                System.out.println("Suntem fericiti sa va anuntam ca aven sediu in acest oras");
                break;
            }
        if(ok==0)
            System.out.println("Ne pare rau, dar nu avem filiala in aces oras inca");
    }
    public void cautAdresa(String oras)
    {
        int ok=0;
        Filiala v[]=filiala.getFiliale();
        for(int i=0;i<v.length;i++)
            if(oras.equalsIgnoreCase(v[i].getOras().getNume()))
            {
                ok=1;
                System.out.println("Strada "+v[i].getOras().getAdresa().getStrada()+" numarul "+v[i].getOras().getAdresa().getNumar());
                break;
            }
        if(ok==0)
            System.out.println("Ne pare rau, dar nu avem filiala in aces oras inca");
    }
}
