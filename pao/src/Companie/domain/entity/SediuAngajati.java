package Companie.domain.entity;

public class SediuAngajati extends Filiala implements Comparable
{
    private int nr_angajeti;

    public SediuAngajati(String strada, int nr, String nume, int nr_angajeti)
    {
        super(strada, nr, nume);
        this.nr_angajeti = nr_angajeti;
    }
    public int getNr_angajeti()
    {
        return nr_angajeti;
    }
    public void setNr_angajeti(int nr_angajeti)
    {
        this.nr_angajeti = nr_angajeti;
    }

    @Override
    public int compareTo(Object o) {
        return nr_angajeti;
    }
}
