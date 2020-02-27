package Prob3_Prob4_Prob5_Prob6;

public class Prob3 {
	public static void main(String[] args) {
		double x = 1.0;
		double y = 0.0;
		double z = 2.0;
		boolean w = x * y < z / x || x / y > z * x && z * y < x && (++y < x || - - z > y);
		System.out.println("El valor de w es: "+ w);
	}
}
