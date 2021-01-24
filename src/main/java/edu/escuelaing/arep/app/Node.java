package edu.escuelaing.arep.app;

public class Node {
	private double value;
	private Node next;
	
	public Node(double value) {
		this.value = value;
	}
	
	public double getValue() {
		return value;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	
	public Node getNext() {
		return next;
	}
	
}
