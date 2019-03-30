public class Rute
{
    private Oras oras_start;
    private Oras oras_destinatie;
    private Masina masina;
    private int id_sofer;

    public Rute(String strada1, int nr1, String nume1, String strada2, int nr2, String nume2, String marca, String model, int nr_locuri,int id_sofer)
    {
        this.oras_start=new Oras(strada1,nr1,nume1);
        this.oras_destinatie=new Oras(strada2,nr2,nume2);
        this.masina=new Masina(marca,model,nr_locuri);
        this.id_sofer=id_sofer;
    }
    public Oras getOras_destinatie()
    {
        return oras_destinatie;
    }
    public void setOras_destinatie(Oras oras_destinatie)
    {
        this.oras_destinatie = oras_destinatie;
    }
    public Masina getMasina()
    {
        return masina;
    }
    public void setMasina(Masina masina)
    {
        this.masina = masina;
    }
    public Oras getOras_start()
    {
        return oras_start;
    }
    public void setOras_start(Oras oras_start)
    {
        this.oras_start = oras_start;
    }
    public int getId_sofer()
    {
        return id_sofer;
    }
    public void setId_sofer(int id_sofer)
    {
        this.id_sofer = id_sofer;
    }
}
