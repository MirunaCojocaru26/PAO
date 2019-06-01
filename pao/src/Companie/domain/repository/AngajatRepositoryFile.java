package Companie.domain.repository;
import Companie.domain.entity.Angajat;
import Companie.domain.entity.PersonalAuxiliar;
import Companie.domain.entity.Sofer;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AngajatRepositoryFile implements AngajatInterface{
    List <Angajat> v=new ArrayList<>();
    public List<Angajat> getAngajati()
    {
        return v;
    }
    public AngajatRepositoryFile(String fisier1,String fisier2) throws FileNotFoundException
    {
        FileInputStream fis1 =new FileInputStream(fisier1);
        Scanner scanner1=new Scanner(fis1);
        while(scanner1.hasNext())
        {
            String line=scanner1.nextLine();
            String[] values=line.split(",");
            v.add(new PersonalAuxiliar(values[0],values[1],Integer.parseInt(values[2]),Integer.parseInt(values[3]),values[4]));
        }
        FileInputStream fis2 =new FileInputStream(fisier2);
        Scanner scanner2=new Scanner(fis2);
        while(scanner2.hasNext())
        {
            String line=scanner2.nextLine();
            String[] value=line.split(",");
            v.add(new Sofer(value[0],value[1],Integer.parseInt(value[2]),Integer.parseInt(value[3]),value[4],Integer.parseInt(value[5])));
        }
    }
}
