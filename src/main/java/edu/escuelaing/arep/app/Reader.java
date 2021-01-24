package edu.escuelaing.arep.app;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.*;
/**
 * @author Jose Gutierrez Marin
 */
public class Reader {
	
	
	public Reader () {
	}
	
	public List<List<String>> readFile(String file) {
		List<List<String>> data = new ArrayList<List<String>>();
		try {
			FileReader fr = new FileReader (file);
			BufferedReader b = new BufferedReader(fr);
			String x =  "Joker";
			while (x != null) {
				data.add(Arrays.asList(x.split(" ")));
				x = b.readLine();
			}
			data.remove(0);
		}catch(Exception e) {
			System.out.println("Something went wrong");
			System.out.println(e);
		}
		return data;
		
		
	}
}
