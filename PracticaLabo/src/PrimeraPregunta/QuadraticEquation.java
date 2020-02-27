package PrimeraPregunta;



public class QuadraticEquation {

  private double a;

  private double b;

  private double c;

  
  
  public QuadraticEquation(double a, double b, double c) {
	
	this.a = a;
	this.b = b;
	this.c = c;
}

public double getA() {
	return a;
}

public void setA(double a) {
	this.a = a;
}

public double getB() {
	return b;
}

public void setB(double b) {
	this.b = b;
}

public double getC() {
	return c;
}

public void setC(double c) {
	this.c = c;
}

public double getRoot2() {
	 double r1;
	  r1= (-getB()+ Math.sqrt(getDiscriminant()))/(2*getA());
	  return r1;
	  
  }

  public double getDiscriminant() {
	  double discriminante;
	  discriminante = Math.pow(getB(),2)-(4*getA()*getC());
  return discriminante;
  }

  public double getRoot1() {
	  double r2;
	  r2= (-getB()- Math.sqrt(getDiscriminant()))/(2*getA());
	  return r2;
  }


}