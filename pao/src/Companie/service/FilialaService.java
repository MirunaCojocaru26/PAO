package Companie.service;
import Companie.configuration.RepositoryConfiguration;
import Companie.domain.entity.Filiala;
import Companie.domain.entity.GarajMasini;
import Companie.domain.entity.SediuAngajati;
import Companie.domain.repository.FilialaInterface;

import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class FilialaService {
    private FilialaInterface filiala = RepositoryConfiguration.getInstance().getFilialarepository();
    int sum=0;
    public void nrMasini()
    {
        TreeSet<Filiala> v=filiala.getFiliale();
        Iterator<Filiala> it = v.iterator();
        Filiala i=null;
        while(it.hasNext())
        {
            i=it.next();
            if(i instanceof GarajMasini)
            {
                GarajMasini ref = (GarajMasini)i;
                sum=sum+ref.getNr_masini();
            }
        }
        System.out.println("Numarul total de masini de care dispunem este: " + sum);
    }
    public void nrAngajatiSoferi()
    {
        TreeSet<Filiala> v=filiala.getFiliale();
        Iterator<Filiala> it = v.iterator();
        Filiala i=null;
        int sum=0, total=0;
        while (it.hasNext())
        {
            i=it.next();
            if(i instanceof GarajMasini)
            {
                GarajMasini ref = (GarajMasini)i;
                sum=sum+ref.getNr_soferi();
                total=total+ref.getNr_soferi();
            }
            else
            {
                SediuAngajati aux=(SediuAngajati) i;
                total=total+aux.getNr_angajeti();
            }
        }
        System.out.println("Numarul total de angajati ai firmei noastre este: " + total+ " dintre care: "+sum+ " sunt soferi autorizati si foarte bine pregatiti.");
    }
    public void cautOras(String oras)
    {
        TreeSet<Filiala> v=filiala.getFiliale();
        Iterator<Filiala> it = v.iterator();
        Filiala i=null;
        int ok=0;
        while(it.hasNext())
        {
            i=it.next();
            if (oras.equalsIgnoreCase(i.getOras().getNume())) {
                ok = 1;
                System.out.println("Suntem fericiti sa va anuntam ca aven sediu in acest oras");
                break;
            }
        }
        if(ok==0)
            System.out.println("Ne pare rau, dar nu avem filiala in aces oras inca");
    }
    public void cautAdresa(String oras)
    {
        int ok=0;
        TreeSet<Filiala> v=filiala.getFiliale();
        Iterator<Filiala> it = v.iterator();
        Filiala i=null;
        while ((it.hasNext()))
        {
            i=it.next();
            if (oras.equalsIgnoreCase(i.getOras().getNume())) {
                ok = 1;
                System.out.println("Strada " + i.getOras().getAdresa().getStrada() + " numarul " + i.getOras().getAdresa().getNumar());
                break;
            }
        }
        if(ok==0)
            System.out.println("Ne pare rau, dar nu avem filiala in aces oras inca");
    }
}
