package selectiva;
	import javax.swing.JOptionPane;
public class prob1 {
	public static void main(String[] args) {
        int num;
        
        num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        if (num%2==0){
            JOptionPane.showMessageDialog(null,"El numero "+num+" es par");
        }
        else{
            JOptionPane.showMessageDialog(null,"El numero "+num+" es impar");
        }
    }
}
