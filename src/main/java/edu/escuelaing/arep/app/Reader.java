package edu.escuelaing.arep.app;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Reader {
	
	private String file;
	
	public Reader (String file) {
		this.file = file;
	}
	
	public void readFile() {
		try {
			FileReader fr = new FileReader (file);
			BufferedReader b = new BufferedReader(fr);
			String x = "inicial";
			while (x != null) {
				x = b.readLine();
			}
		}catch(Exception e) {
			System.out.println("Something went wrong");
			System.out.println(e);
		}
		
	}
}
