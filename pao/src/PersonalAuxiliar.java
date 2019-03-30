public class PersonalAuxiliar extends Angajat
{
    private String meserie;

    public PersonalAuxiliar(String nume, String strada, int nr, int id, String meserie)
    {
        super(nume, strada, nr, id);
        this.meserie = meserie;
    }
    public String getMeserie()
    {
        return meserie;
    }
    public void setMeserie(String meserie)
    {
        this.meserie = meserie;
    }
}
