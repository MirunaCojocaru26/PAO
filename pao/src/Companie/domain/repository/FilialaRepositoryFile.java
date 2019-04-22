package Companie.domain.repository;

import Companie.domain.entity.Filiala;
import Companie.domain.entity.GarajMasini;
import Companie.domain.entity.SediuAngajati;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FilialaRepositoryFile implements FilialaInterface {
    List<Filiala> v=new ArrayList<>();
    public List<Filiala> getFiliale()
    {
        return v;
    }
    public FilialaRepositoryFile(String fisier1,String fisier2) throws FileNotFoundException
    {
        FileInputStream fis1=new FileInputStream(fisier1);
        Scanner scanner1=new Scanner(fis1);
        while(scanner1.hasNext())
        {
            String line=scanner1.nextLine();
            String[] values=line.split(",");
            v.add(new GarajMasini(values[0],Integer.parseInt(values[1]),values[2],Integer.parseInt(values[3]),Integer.parseInt(values[4])));
        }
        FileInputStream fis2=new FileInputStream(fisier2);
        Scanner scanner2=new Scanner(fis2);
        while (scanner2.hasNext())
        {
            String line=scanner1.nextLine();
            String[] values=line.split(",");
            v.add(new SediuAngajati(values[0],Integer.parseInt(values[1]),values[2],Integer.parseInt(values[3])));
        }
    }
}