package SegundaPregunta;

public class LinearEquation {
	private double a;

	  private double b;

	  public double c;

	  public double d;

	  public double e;

	  public double f;
	  
	  

	  public LinearEquation(double a, double b, double c, double d, double e, double f) {
		
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;
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



	public double getD() {
		return d;
	}



	public void setD(double d) {
		this.d = d;
	}



	public double getE() {
		return e;
	}



	public void setE(double e) {
		this.e = e;
	}



	public double getF() {
		return f;
	}



	public void setF(double f) {
		this.f = f;
	}
	
	public double getX() {
		double x = (getE()*getD()-getB()*getF())/(getA()*getD()-getB()*getC());
		return x;
	}
	public double getY() {
		double y = (getA()*getF()-getE()*getC())/(getA()*getD()-getB()*getC());
		return y;
	}

	public Boolean isSolvable() {
		boolean estado = false;
		double aux;
		aux = getA()*getD() - getB()*getC();
		if(aux !=0) {
			estado = true;
		}
	  return estado;
	  }
}
