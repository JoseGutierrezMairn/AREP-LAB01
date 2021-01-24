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
	
	/***
	 * Main method in charge of solving the problem
	 * @param args
	 */
    public static void main( String[] args )
    {
    	jl = new JoseLinkedList();
    	r = new Reader();
    	c = new Calculator();
    	List<List<String>> mat = r.readFile("archivo.txt");
    	jl = createLinkedList(mat, jl, 1);
    	double mean = c.calculateMeanOf(jl);
    	System.out.println(mean);
    	System.out.println(c.calculateStandardDerivationOf(jl, mean));
    }
    
    /***
     * Method In charge of completing the JoseLinkedList
     * @param mat this is the matrix obtained from Reader class
     * @param jl it is the null JoseLinkedList created previously 
     * @param column Indicates the column to solve
     * @return Returns the JoseLinkedList with the values obtained from mat
     */
    private static JoseLinkedList createLinkedList(List<List<String>> mat, JoseLinkedList jl, int column) {
    	for (int i = 0; i < mat.size(); i++) {
    		jl.addFirst(new Node(Double.parseDouble(mat.get(i).get(column))));
    	}
    	return jl;
    }
}
