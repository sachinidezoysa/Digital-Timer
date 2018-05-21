/**Name: Kiththingal Rannulu Sachini Bawanthi De Zoysa
*IIT ID: 2016212
*UOW ID: 16266388
*/

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.util.GregorianCalendar;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.Date;


public class DigitalTimer {

	
	public static void main(String[] args) {

		JFrame J1 = new JFrame("Digital timer");


		J1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		J1.setLayout(new GridLayout(3, 1));
		J1.setVisible(true);
		J1.setResizable(true);
		J1.setSize(400, 300);
		J1.getContentPane().setBackground(Color.darkGray);

		JLabel lbldate = new JLabel(); // dicleration of date label
		JLabel lbltime = new JLabel();
		JLabel lblday = new JLabel();

		J1.add(lbldate); // add label to frame
		J1.add(lbltime);
		J1.add(lblday);

		lbldate.setFont(new Font("Arial", Font.BOLD + Font.ITALIC, 25));
		lbldate.setHorizontalAlignment(SwingConstants.CENTER);
		lbldate.setForeground(Color.green); 

		lbltime.setFont(new Font("Castella", Font.BOLD + Font.ITALIC, 50));
		lbltime.setHorizontalAlignment(SwingConstants.CENTER);
		lbltime.setForeground( Color.green);

		lblday.setFont(new Font("Arial Narrow", Font.BOLD + Font.ITALIC, 30));
		lblday.setHorizontalAlignment(SwingConstants.CENTER);
		lblday.setForeground( Color.green);
	

		while (true) {
			Date date = new Date();
			String dayOfYear = new SimpleDateFormat("yyyy : MM  :dd").format(date);
			String dayOfWeek = new SimpleDateFormat("EE").format(date);
			lbldate.setText(dayOfYear);
			lblday.setText(dayOfWeek+"day");

			Calendar c = new GregorianCalendar();// create a calendar object

			int hour = c.get(Calendar.HOUR);// variable = hour
			int min = c.get(Calendar.MINUTE);
			int amPm = c.get(Calendar.AM_PM);
			
			String fm; // if tere is no 2 digits this will provide a zero
			if (min < 10)
				fm = "0" + min;
			else
				fm = "" + min;

			int sec = c.get(Calendar.SECOND);
			String fs;
			if (sec < 10)
				fs = "0" + sec;
			else
				fs = "" + sec;
			
			String ampmStr;
			
			if(amPm == Calendar.AM){
				ampmStr = "AM";
			} else {
				ampmStr = "PM";
			}
			
			String time = hour + ":" + min + ":" + fs + " " + ampmStr;

			lbltime.setText(time);
		
		}
		

	}

}

