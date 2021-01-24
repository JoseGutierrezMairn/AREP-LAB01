package edu.escuelaing.arep.app;

public class Calculator {
	
	
	public Calculator(){
	}
	
	public double calculateMeanOf(JoseLinkedList jl) {
		double answ = 0;
		Node current = jl.getFirst();
		for (int i = 0; i < jl.size(); i++) {
			answ+= current.getValue();
			current =  current.getNext();
		}
		
		return answ/jl.size();
	}
	
	
	public double calculateStandartDerivationOf(JoseLinkedList jl, double mean) {
		double answ = 0;
		Node current = jl.getFirst();
		for (int i = 0; i < jl.size(); i++) {
			answ+= Math.pow(current.getValue() - mean, 2);
			current =  current.getNext();
		}
		return Math.round(Math.sqrt(answ/ (jl.size()-1)) * 100.0)/ 100.0;
	}
}
