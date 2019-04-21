package Companie.domain.repository;

import Companie.domain.entity.Angajat;
import Companie.domain.entity.PersonalAuxiliar;
import Companie.domain.entity.Sofer;

public class AngajatRepository implements AngajatInterface{
    private Angajat[] angajati=
            new Angajat[]{
                    new Sofer("Mihai Abcd","Pacurei",23,1325,"B",5),
                    new Sofer("Costel Zxy","Pallady",40,1945,"D",8),
                    new Sofer("Andrei Hopa","Orhideelor",17,5732,"C",10),
                    new Sofer("Marius Neagu","Lalelelor",16,1818,"D",18),
                    new PersonalAuxiliar("Alexandru Siceva","Eroilor",5,3425,"Instalator"),
                    new PersonalAuxiliar("Ion Idee","Tineretii",52,4352,"Om de serviciu")
            };

    public Angajat[] getAngajati()
    {
        return angajati;
    }
}
