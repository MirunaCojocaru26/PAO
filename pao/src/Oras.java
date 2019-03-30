public class Oras
{
    private String nume;
    private Adresa adresa;

    public Oras(String strada, int nr,String nume)
    {
        this.adresa=new Adresa(strada, nr);
        this.nume=nume;
    }
    public String getNume()
    {
        return nume;
    }
    public void setNume(String nume)
    {
        this.nume = nume;
    }
    public Adresa getAdresa()
    {
        return adresa;
    }
    public void setAdresa(Adresa adresa)
    {
        this.adresa = adresa;
    }
}
