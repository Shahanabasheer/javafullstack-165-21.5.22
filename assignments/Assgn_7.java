package assignments;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Assgn_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
		
		Date dateobj = new Date();
		
		System.out.println(dateobj);
		
		System.out.println(df.format(dateobj));
	}

}
