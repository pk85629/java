import com.hotmail.prakash04.units.*;

public class unitrun {
	public static void main(String[] args) {
		Temperature t = new Temperature();
		Distance d = new Distance();
		Currency c = new Currency();
		
		System.out.println("The Temperature in Celcius is " + t.f2c(60));
		System.out.println("One Mile is "+ d.m2k(1) + " KM");
		System.out.println("One Dollar is "+ c.us2ind(1) + " Rupees");
	}
}
	

	