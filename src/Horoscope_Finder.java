import javax.swing.JOptionPane;

public class Horoscope_Finder {
public static void main(String[] args) {
String star = JOptionPane.showInputDialog(" what is your star sign");
	if(star .equalsIgnoreCase("Aries")) {
		JOptionPane.showMessageDialog(null," you are courageous, energetic, willful, commanding, leading. Often leads when following would be best course of action.\n" + 
				"" );
	}
	if(star .equalsIgnoreCase("Taurus")) {
		JOptionPane.showMessageDialog(null,"you are Pleasure seeking, loves control, dependable, grounded, provokes slowly, and highly sensual in nature." );
	}
	else if(star .equalsIgnoreCase("Gemini")) {
		JOptionPane.showMessageDialog(null,"you are Cerebral, chatty, loves learning and education, charming, and adventurous." );
	}
	else if(star .equalsIgnoreCase("Cancer")) {
		JOptionPane.showMessageDialog(null,"you are Emotional, group oriented, seeks security, family." );
	}
	else if(star .equalsIgnoreCase("Leo")) {
		JOptionPane.showMessageDialog(null,"you are Generous, organized, protective, beautiful." );
	}
	else if(star .equalsIgnoreCase("Virgo")) {
		JOptionPane.showMessageDialog(null,"you are Particular, logical, practical, sense of duty, critical." );
	}
	else if(star .equalsIgnoreCase("Libra")) {
		JOptionPane.showMessageDialog(null,"you are Balanced, seeks beauty, sense of justice." );
	}
	else if(star .equalsIgnoreCase("Scorpio")) {
		JOptionPane.showMessageDialog(null,"you are Passionate, exacting, loves extremes, combative, reflective." );
	}
	else if(star .equalsIgnoreCase("Sagittarius")) {
		JOptionPane.showMessageDialog(null,"you are Happy, absent minded, creative, adventurous." );
	}
	else if(star .equalsIgnoreCase("Capricorn")) {
		JOptionPane.showMessageDialog(null,"you are Timeless, driven, calculating, ambitious." );
	}
	else if(star .equalsIgnoreCase("Aquarius")) {
		JOptionPane.showMessageDialog(null,"you are Forward thinking, communicative, people oriented, stubborn, generous, and dedicated." );
	}
	else if(star .equalsIgnoreCase("Pisces")) {
		JOptionPane.showMessageDialog(null,"you are Likeable, energetic, passionate, sensitive." );
	}
	else JOptionPane.showMessageDialog(null, "thats not a star sign!");
}
}
