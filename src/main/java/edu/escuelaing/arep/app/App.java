package edu.escuelaing.arep.app;

/**
 * @author Jose Gutierrez Marin
 */ 
import java.util.*;
public class App 
{
	private static JoseLinkedList jl;
	private static Reader r;
	private static Calculator c;
    public static void main( String[] args )
    {
    	jl = new JoseLinkedList();
    	r = new Reader();
    	c = new Calculator();
    	List<List<String>> mat = r.readFile("archivo.txt");
    	jl = createLinkedList(mat, jl, 1);
    	double mean = c.calculateMeanOf(jl);
    	System.out.println(mean);
    	System.out.println(c.calculateStandartDerivationOf(jl, mean));
    }
    
    
    private static JoseLinkedList createLinkedList(List<List<String>> mat, JoseLinkedList jl, int column) {
    	for (int i = 0; i < mat.size(); i++) {
    		jl.addFirst(new Node(Double.parseDouble(mat.get(i).get(column))));
    	}
    	return jl;
    }
}
