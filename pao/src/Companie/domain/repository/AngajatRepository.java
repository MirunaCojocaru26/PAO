package Companie.domain.repository;

import Companie.domain.entity.Angajat;
import Companie.domain.entity.PersonalAuxiliar;
import Companie.domain.entity.Sofer;
import java.util.ArrayList;
import java.util.List;

public class AngajatRepository implements AngajatInterface{
    private List<Angajat> angajati= new ArrayList<>();
    public List<Angajat> getAngajati()
    {
        return angajati;
    }
    public AngajatRepository()
    {
        angajati.add(new Sofer("Mihai Abcd","Pacurei",23,1325,"B",5));
        angajati.add(new Sofer("Costel Zxy","Pallady",40,1945,"D",8));
        angajati.add( new Sofer("Andrei Hopa","Orhideelor",17,5732,"C",10));
        angajati.add(new Sofer("Marius Neagu","Lalelelor",16,1818,"D",18));
        angajati.add(new PersonalAuxiliar("Alexandru Siceva","Eroilor",5,3425,"Instalator"));
        angajati.add(new PersonalAuxiliar("Ion Idee","Tineretii",52,4352,"Om de serviciu"));
    }
}
