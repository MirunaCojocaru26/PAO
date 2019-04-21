package Companie.domain.repository;

import Companie.domain.entity.Filiala;
import Companie.domain.entity.GarajMasini;
import Companie.domain.entity.SediuAngajati;

public class FilialaRepository {
    private Filiala[] filiale=
            new Filiala[]{
                    new SediuAngajati("Pallady",20,"Braila",23),
                    new SediuAngajati("Tudor",15,"Bucuresti",20),
                    new GarajMasini("Timis",53,"Arad",10,25),
                    new SediuAngajati("Eclipsa",12,"Constanta",25),
                    new GarajMasini("Demnitatii",110,"Cluj",4,10),
                    new GarajMasini("Timpuri noi",6,"Galati",8,20)
            };

    public Filiala[] getFiliale()
    {
        return filiale;
    }
}
