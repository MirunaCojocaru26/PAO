public abstract class Filiala
{
    private Oras oras;
    public Filiala(String strada, int nr, String nume)
    {
        this.oras = new Oras(strada, nr, nume);
    }
    public Oras getOras()
    {
        return oras;
    }
    public void setOras(Oras oras)
    {
        this.oras = oras;
    }
}
