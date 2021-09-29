import java.util.Scanner;
public class AverageCalc {

	public static void main(String[] args) {
		Scanner Keyboard = new Scanner(System.in);
		
		double data = 0.0;
		int counter = 0;
		int sum = 0;
		String Words = "Enter a number to calculate average, if you are finished type -1";
		int Fin = -1;
		
		System.out.println(Words);
		data = Keyboard.nextInt();
		
		do {
				
				sum += data;
				counter += 1;
				System.out.println(Words);
				data = Keyboard.nextDouble();
				Keyboard.nextLine();
				
			}while(data != Fin); 
				System.out.println("your avg is = " + sum / (1.0 * counter));	
	Keyboard.close();
			
		}
}