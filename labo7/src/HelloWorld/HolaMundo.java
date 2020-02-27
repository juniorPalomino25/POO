package HelloWorld;
import javax.swing.SwingUtilities;
public class HolaMundo {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new MainFrame();
			}
		});
	}
}
