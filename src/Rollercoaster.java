import javax.swing.JOptionPane;

public class Rollercoaster {
public static void main(String[] args) {
String inches =	JOptionPane.showInputDialog("How many inches are you?");
int in = Integer.parseInt(inches);
	if(in >48 ) {
	JOptionPane.showMessageDialog(null, "You can enter the rollercoaster");
	}	
	else{
	JOptionPane.showMessageDialog(null, "You need to grow more first");
	}
	
	
	
	
	
	
	
	
	
}
}
