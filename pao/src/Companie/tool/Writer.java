package Companie.tool;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Writer {
    String filename="ruteOut.csv";
    private static final SimpleDateFormat sdf=new SimpleDateFormat("HH:mm:ss dd.MM.yyyy");
    private static Writer Instance=new Writer();
    private Writer() { }
    public static Writer getInstance()
    {
        return Instance;
    }
    public void write(String output)
    {
        try{
            FileOutputStream file=new FileOutputStream(filename,true);
            byte[] outputbyte=output.getBytes();
            file.write(outputbyte);
            Date date=new Date();
            String timestamp=sdf.format(date.getTime());
            byte[] timestampbyte=timestamp.getBytes();
            file.write(timestampbyte);
            file.write("\n".getBytes());
            file.close();
        }
        catch(FileNotFoundException e){
            System.out.println("Fisier output prost");
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
