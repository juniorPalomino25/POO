package hgfhyrdhtr;

public class a {
	protected int v;
	public a() {
		v=0;
	}
	
	void m1() {
		v+=5;
		m2();
	}
	void m2() {
		v+=10;
	}
	int getv() {
		return v;
	}
}
