package Companie.domain.entity;

public class GarajMasini extends Filiala implements Comparable
{
    private int nr_masini;
    private int nr_soferi;

    public GarajMasini(String strada, int nr, String nume, int nr_masini, int nr_soferi)
    {
        super(strada, nr, nume);
        this.nr_masini = nr_masini;
        this.nr_soferi=nr_soferi;
    }
    public int getNr_soferi()
    {
        return nr_soferi;
    }
    public void setNr_soferi(int nr_soferi)
    {
        this.nr_soferi = nr_soferi;
    }
    public int getNr_masini()
    {
        return nr_masini;
    }
    public void setNr_masini(int nr_masini)
    {
        this.nr_masini = nr_masini;
    }

    @Override
    public int compareTo(Object o) {
        return nr_soferi;
    }
}
