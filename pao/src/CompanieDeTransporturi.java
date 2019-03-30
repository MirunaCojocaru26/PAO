public class CompanieDeTransporturi
{
    private Angajat[] angajati=
            new Angajat[]{
                    new Sofer("Mihai Abcd","Pacurei",23,1325,"B",5),
                    new Sofer("Costel Zxy","Pallady",40,1945,"D",8),
                    new Sofer("Andrei Hopa","Orhideelor",17,5732,"C",10),
                    new Sofer("Marius Neagu","Lalelelor",16,1818,"D",18),
                    new PersonalAuxiliar("Alexandru Siceva","Eroilor",5,3425,"Instalator"),
                    new PersonalAuxiliar("Ion Idee","Tineretii",52,4352,"On de serviciu")
            };
    private Filiala[] filiale=
            new Filiala[]{
                    new SediuAngajati("Pallady",20,"Braila",23),
                    new SediuAngajati("Tudor",15,"Bucuresti",20),
                    new GarajMasini("Timis",53,"Arad",10,25),
                    new SediuAngajati("Eclipsa",12,"Constanta",25),
                    new GarajMasini("Demnitatii",110,"Cluj",4,10),
                    new GarajMasini("Timpuri noi",6,"Galati",8,20)
            };
    private Adresa[] adrese=
            new Adresa[]{
                    new Adresa("Creatiei",32),
                    new Adresa("Politiei",65),
                    new Adresa("Pisici",8),
                    new Adresa("Creanga",45)
            };
    private Rute[] rute=
            new Rute[]{
                    new Rute("Paleru",18,"Constanta","Eminescu",6,"Arad","Mercedes","Tourismo",50,1325),
                    new Rute("Caragiale",7,"Brasov","Titulescu",43,"Cluj","Man","Lion's Coach",25,5732),
                    new Rute("Argesului",31,"Bicaz","Fecioarei",10,"Braila","Renault","Ares",10,1945),
                    new Rute("Pacii",2,"Roman","Libertatii",66,"Iasi","Temsa","Box",35,1818)
            };
    private static CompanieDeTransporturi instance;

    public static CompanieDeTransporturi getInstance()
    {
        System.out.println("Se apeleasa getInstance");
        if(instance==null)
        {
            instance=new CompanieDeTransporturi();
            System.out.println("S-a instantiat singleton-ul");
        }
        return instance;
    }
    public void programExcursii()
    {
        for(int i=0;i<4;i++)
            System.out.println("Urmatoarea masina spre " +rute[i].getOras_destinatie().getNume()+" pleaca din "+rute[i].getOras_start().getNume());
    }
    public void masiniList()
    {
        System.out.println("Marcile de masini de care dispunem:");
        int sum=0;
        for(int i=0;i<=3;i++)
            System.out.println("Marca:" + rute[i].getMasina().getMarca() + " Modelul: " + rute[i].getMasina().getModel());
        for(int i=0;i<filiale.length;i++)
        {
            if(filiale[i] instanceof GarajMasini )
            {
                GarajMasini ref = (GarajMasini)filiale[i];
                sum=sum+ref.getNr_masini();
            }
        }
        System.out.println("Numarul total de masini de care dispunem este: " + sum);
    }
    public void nrAngajatiSoferi()
    {
        int sum=0, total=0;
        for(int i=0;i<filiale.length;i++)
        {
            if(filiale[i] instanceof GarajMasini )
            {
                GarajMasini ref = (GarajMasini)filiale[i];
                sum=sum+ref.getNr_soferi();
                total=total+ref.getNr_soferi();
            }
            else
            {
                SediuAngajati aux=(SediuAngajati) filiale[i];
                total=total+aux.getNr_angajeti();
            }
        }
        System.out.println("Numarul total de angajati ai firmei noastre este: " + total+ " dintre care: "+sum+ " sunt soferi autorizati si foarte bine pregatiti.");
    }
    public void cautDupaNume(String nume)
    {
        int ok=0;
        for(int i=0;i<angajati.length;i++)
            if(angajati[i].getNume().indexOf(nume)>=0)
            {
                ok=1;
                System.out.println(angajati[i].getNume());
            }
        if(ok==0)
            System.out.println("Nu am gasit nici un angajat cu acest nume in baza de date");
    }
    public void cautOras(String oras)
    {
        int ok=0;
        for(int i=0;i<filiale.length;i++)
            if(oras.equalsIgnoreCase(filiale[i].getOras().getNume()))
            {
                ok=1;
                System.out.println("Suntem fericiti sa va anuntam ca aven sediu in acest oras");
                break;
            }
        if(ok==0)
            System.out.println("Ne pare rau, dar nu avem filiala in aces oras inca");
    }
    public void soferTraseu()
    {
        for(int i=0;i<angajati.length;i++)
            for(int j=0;j<rute.length;j++)
                if(angajati[i].getId()==rute[j].getId_sofer())
                    System.out.println("Pe traseul "+rute[j].getOras_start().getNume()+"->"+rute[i].getOras_destinatie().getNume()+" o sa il aveti ca sofer pe "+angajati[i].getNume());
    }
    public void cautLocuri(String oras)
    {
        int ok=0;
        for(int i=0;i<rute.length;i++)
            if(oras.equalsIgnoreCase(rute[i].getOras_destinatie().getNume())||oras.equalsIgnoreCase(rute[i].getOras_start().getNume()))
            {
                ok=1;
                System.out.println("Numarul de locuri de pe aceasta ruta sunt: "+rute[i].getMasina().getNr_locuri());
                break;
            }
        if(ok==0)
            System.out.println("Acest oras nu se afla pe nici o ruta  companie noastre");
    }
    public void cautAdresa(String oras)
    {
        int ok=0;
        for(int i=0;i<filiale.length;i++)
            if(oras.equalsIgnoreCase(filiale[i].getOras().getNume()))
            {
                ok=1;
                System.out.println("Strada "+filiale[i].getOras().getAdresa().getStrada()+" numarul "+filiale[i].getOras().getAdresa().getNumar());
                break;
            }
        if(ok==0)
            System.out.println("Ne pare rau, dar nu avem filiala in aces oras inca");
    }
    public void soferulCuCeaMaiMareExperienta()
    {
        int max=0, poz=0;
        for(int i=0;i<angajati.length;i++)
            if(angajati[i] instanceof Sofer)
            {
                Sofer aux=(Sofer)angajati[i];
                if(aux.getExperienta()>max)
                {
                    max = aux.getExperienta();
                    poz=i;
                }
            }
        Sofer aux=(Sofer)angajati[poz];
        System.out.println("Soferul cu cea mai mare experienta din firma noastra este "+aux.getNume()+" si are o experienta de "+aux.getExperienta()+" ani.");
    }
    public void cautAdresaDestinatie(String oras)
    {
        int ok=0;
        for(int i=0;i<rute.length;i++)
            if(oras.equalsIgnoreCase(rute[i].getOras_destinatie().getNume()))
            {
                ok=1;
                System.out.println("Strada "+rute[i].getOras_start().getAdresa().getStrada()+" Numarul "+rute[i].getOras_start().getAdresa().getNumar()+ " din Orasul"+rute[i].getOras_start().getNume());
                break;
            }
            else
                if(oras.equalsIgnoreCase(rute[i].getOras_start().getNume()))
                {
                    ok=1;
                    System.out.println("Strada "+rute[i].getOras_destinatie().getAdresa().getStrada()+" numarul "+rute[i].getOras_destinatie().getAdresa().getNumar()+ " din Orasul "+rute[i].getOras_destinatie().getNume());
                    break;
                }
        if(ok==0)
            System.out.println("Nu avem nici o calatorie planificata spre aceasta destinatie");
    }
}
