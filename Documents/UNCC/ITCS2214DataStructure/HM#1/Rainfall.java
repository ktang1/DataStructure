import java.util.Random;

public class Rainfall {
	public static void main(String[] cheese){
		
		Random rand = new Random();
		int[] numbers = new int[50];
		String[] output = {"", "", "", "", "", "", "", "", "", ""};
		
		for(int i = 0; i < numbers.length; i++){
			numbers[i] = rand.nextInt(100) + 1;
		}
		
		for(int i = 0; i < numbers.length; i++){
			int index = (numbers[i] - 1) / 10;
			output[index] += "*";
		}
		
		for(int i = 0; i < output.length; i++){
			System.out.println((i*10 + 1) + "-" + (i*10 + 10) + ": " + output[i]);
		}
	}	
}