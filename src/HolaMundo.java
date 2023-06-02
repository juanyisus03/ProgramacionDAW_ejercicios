
import java.io.Console;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;



public class HolaMundo {
	
	public static void main(String[] args) {
		int esp = 0;
		String s = "v";
		
		while(s!="0") {
			System.out.println("o");
			s = JOptionPane.showInputDialog(null, "<a d>");
			if(s == null) break;
			if(s.equalsIgnoreCase("a") && esp != 0) esp--;
			if(s.equalsIgnoreCase("d")) esp++;
			
			for (int i = 0; i < esp; i++) {
				System.out.print(" ");
				
			}
			
		}
		
		
	}
}

