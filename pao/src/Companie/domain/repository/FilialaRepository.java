package Companie.domain.repository;

import Companie.domain.entity.Filiala;
import Companie.domain.entity.GarajMasini;
import Companie.domain.entity.SediuAngajati;

import java.util.ArrayList;
import java.util.List;

public class FilialaRepository implements FilialaInterface {
    private List<Filiala> filiale= new ArrayList<>();
    public List<Filiala> getFiliale()
    {
        return filiale;
    }
    public FilialaRepository()
    {
        filiale.add(new SediuAngajati("Pallady",20,"Braila",23));
        filiale.add(new SediuAngajati("Tudor",15,"Bucuresti",20));
        filiale.add(new GarajMasini("Timis",53,"Arad",10,25));
        filiale.add(new SediuAngajati("Eclipsa",12,"Constanta",25));
        filiale.add(new GarajMasini("Demnitatii",110,"Cluj",4,10));
        filiale.add(new GarajMasini("Timpuri noi",6,"Galati",8,20));
    }
}
