package Companie.domain.entity;

public class SediuAngajati extends Filiala
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
}
