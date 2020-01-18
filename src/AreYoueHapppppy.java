import javax.swing.JOptionPane;

public class AreYoueHapppppy {
public static void main(String[] args) {
	
	
String answer = JOptionPane.showInputDialog("Are you happy?");

if(answer.equalsIgnoreCase("yes")) {
	JOptionPane.showMessageDialog(null,"Keep doing whatever you're doing");
}	
else if(answer.equalsIgnoreCase("no")) {
	String happy = JOptionPane.showInputDialog("Do you want to be happy?");


	
if(happy.equalsIgnoreCase("no")) {
	JOptionPane.showMessageDialog(null,"Keep doing whatever you're doing");
}	
	if(happy.equalsIgnoreCase("yes")) {
	JOptionPane.showMessageDialog(null, "change something");
	
}



	
	}


}
}