package edu.escuelaing.arep.app;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * @author Jose Gutierrez Marin
 */
public class AppTest 
{
    @Test
    public void shouldReadTheTestFile() {
    	Reader r = new Reader();
    	List<List<String>> answ = new ArrayList<List<String>>();
    	List<String> temp = new ArrayList<String>();
    	temp.add("primera");
    	temp.add("linea");
    	answ.add(temp);
    	temp.remove(0);
    	temp.remove(0);
    	temp.add("segunda");
    	temp.add("linea");
    	answ.add(temp);
    	temp.remove(0);
    	temp.remove(0);
    	temp.add("linea");
    	temp.add("tercera");
    	answ.add(temp);
    	temp.remove(0);
    	temp.remove(0);
    	temp.add("fin");
    	temp.add("lineas");
    	answ.add(temp);
    	List<List<String>> data = r.readFile("fileTests.txt");
    	
    	int i = 0;
    	for (List<String> row : data) {
    		answ.get(i).get(0).equals(data.get(0));
    		answ.get(i).get(1).equals(data.get(1));
    		i++;
    	}
    	
    }
    

    
}
