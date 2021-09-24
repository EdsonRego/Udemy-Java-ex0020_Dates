package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.util.TimeZone;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//definindo mascaras de exibição
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		Date y1 = sdf1.parse("22/09/2021");
		Date y2 = sdf2.parse("22/09/2021 09:10:15");
		
		System.out.println(y1);
		System.out.println(y2);
		System.out.println("y1: " + sdf1.format(y1));
		System.out.println("y2: " + sdf2.format(y2));
		
		System.out.println();
		System.out.println("====================================");
		
		Date x1 = new Date();
		System.out.println(x1);
		System.out.println("x1: " + sdf1.format(x1));
		System.out.println("x1: " + sdf2.format(x1));
		
		System.out.println();
		System.out.println("====================================");
		
		Date x2 = new Date(System.currentTimeMillis());
		System.out.println(x2);
		System.out.println("x2: " + sdf1.format(x2));
		System.out.println("x2: " + sdf2.format(x2));

		System.out.println();
		System.out.println("====================================");
		
		Date x3 = new Date(0);
		System.out.println(x3);
		System.out.println("x3: " + sdf1.format(x3));
		System.out.println("x3: " + sdf2.format(x3));
		
		System.out.println();
		System.out.println("====================================");
		
		Date x4 = new Date(1000L * 60L * 60L * 5L);
		System.out.println(x4);
		System.out.println("x4: " + sdf1.format(x4));
		System.out.println("x4: " + sdf2.format(x4));

		System.out.println();
		System.out.println("====================================");
		
		Date y3 = Date.from(Instant.parse("2021-09-22T09:54:20Z"));
		System.out.println(y3);
		System.out.println("y3: " + sdf1.format(y3));
		System.out.println("y3: " + sdf2.format(y3));
		System.out.println("y3: " + sdf3.format(y3));
		
		sc.close();
	}

}
