package Companie.domain.entity;

public class Masina
{
    private String marca;
    private String model;
    private int nr_locuri;

    public Masina(String marca, String model, int nr_locuri)
    {
        this.marca=marca;
        this.model=model;
        this.nr_locuri=nr_locuri;
    }
    public int getNr_locuri()
    {
        return nr_locuri;
    }
    public void setNr_locuri(int nr_locuri)
    {
        this.nr_locuri = nr_locuri;
    }
    public String getModel()
    {
        return model;
    }
    public void setModel(String model)
    {
        this.model = model;
    }
    public String getMarca()
    {
        return marca;
    }
    public void setMarca(String marca)
    {
        this.marca = marca;
    }
}
