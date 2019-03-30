public class Sofer extends Angajat
{
    private String categorie_permis;
    private int experienta;

    public Sofer(String nume, String strada, int nr, int id, String categorie_permis, int experienta)
    {
        super(nume, strada, nr, id);
        this.categorie_permis = categorie_permis;
        this.experienta=experienta;
    }
    public String getCategorie_permis()
    {
        return categorie_permis;
    }
    public void setCategorie_permis(String categorie_permis)
    {
        this.categorie_permis = categorie_permis;
    }
    public int getExperienta()
    {
        return experienta;
    }
    public void setExperienta(int experienta)
    {
        this.experienta = experienta;
    }
}
