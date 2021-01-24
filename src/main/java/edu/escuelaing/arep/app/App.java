package edu.escuelaing.arep.app;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Reader fr = new Reader("archivo.txt");
        fr.readFile();
    }
}
