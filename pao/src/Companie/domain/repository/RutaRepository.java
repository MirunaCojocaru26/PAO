package Companie.domain.repository;

import Companie.domain.entity.Adresa;
import Companie.domain.entity.Ruta;

public class RutaRepository implements RutaInterface{
    private Adresa[] adrese=
            new Adresa[]{
                    new Adresa("Creatiei",32),
                    new Adresa("Politiei",65),
                    new Adresa("Pisici",8),
                    new Adresa("Creanga",45)
            };
    private Ruta[] rute=
            new Ruta[]{
                    new Ruta("Paleru",18,"Constanta","Eminescu",6,"Arad","Mercedes","Tourismo",50,1325),
                    new Ruta("Caragiale",7,"Brasov","Titulescu",43,"Cluj","Man","Lion's Coach",25,5732),
                    new Ruta("Argesului",31,"Bicaz","Fecioarei",10,"Braila","Renault","Ares",10,1945),
                    new Ruta("Pacii",2,"Roman","Libertatii",66,"Iasi","Temsa","Box",35,1818)
            };

    public Ruta[] getRute()
    {
        return rute;
    }
}
