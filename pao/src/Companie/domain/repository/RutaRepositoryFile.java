package Companie.domain.repository;

import Companie.domain.entity.Ruta;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RutaRepositoryFile implements  RutaInterface {
    List<Ruta> v=new ArrayList<>();
    public List<Ruta> getRute() {
        return v;
    }
    public RutaRepositoryFile(String fisier) throws FileNotFoundException {
        FileInputStream fis =new FileInputStream(fisier);
        Scanner scanner =new Scanner(fis);
        while(scanner.hasNext())
        {
            String line = scanner.nextLine();
            String [] values = line.split(",");
            v.add(new Ruta(values[0],Integer.parseInt(values[1]),values[2],values[3],Integer.parseInt(values[4]),values[5],values[6],values[7],Integer.parseInt(values[8]),Integer.parseInt(values[9])));
        }
    }
}
