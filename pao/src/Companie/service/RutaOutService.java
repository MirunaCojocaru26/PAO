package Companie.service;
import Companie.domain.entity.Ruta;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class RutaOutService
{
    public void functie() throws IOException {
        String str = "Hello";
        BufferedWriter writer = new BufferedWriter(new FileWriter("ruteOut.csv"));
        writer.write(str);

        writer.close();
    }
}
