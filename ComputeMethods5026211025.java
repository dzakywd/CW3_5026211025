import java.util.Random;
import java.util.Scanner;

public class ComputeMethods5026211025{

	public double fToC(double degreesF){
		double celsius = ((5.0/9.0)*(degreesF-32));
		return(celsius);
	}

	public double hypotenuse(int a, int b){
		double hypo = (Math.sqrt(Math.pow(a,2) + Math.pow(b,2)));
		return(hypo);
	}

	public int roll(){
		Random dice = new Random();
		int r1 = dice.nextInt(5)+1;
		int r2 = dice.nextInt(5)+1;
		int sum = (r1 + r2);
		return(sum);
	}
}