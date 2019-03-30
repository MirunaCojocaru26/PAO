public abstract class Angajat
{
    private String nume;
    private Adresa adresa;
    private int id;

    public Angajat(String nume, String strada, int nr, int id)
    {
        this.nume = nume;
        this.adresa=new Adresa(strada,nr);
        this.id=id;
    }
    public Adresa getAdresa()
    {
        return adresa;
    }
    public void setAdresa(Adresa adresa)
    {
        this.adresa = adresa;
    }
    public String getNume()
    {
        return nume;
    }
    public void setNume(String nume)
    {
        this.nume = nume;
    }
    public int getId()
    {
        return id;
    }
    public void setId(int id)
    {
        this.id = id;
    }
}
