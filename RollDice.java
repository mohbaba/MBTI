import java.security.SecureRandom;
public class RollDice{

	public static void main(String[]args){

		SecureRandom randomGenerator = new SecureRandom();

		
		int face;

		int counter = 1;

		int frequency1 = 0;
		int frequency2 = 0;
		int frequency3 = 0;
		int frequency4 = 0;
		int frequency5 = 0;
		int frequency6 = 0;
		while( counter <= 60_000_000 ){
			face = 1 + randomGenerator.nextInt(6);
			switch(face){
				case 1:
					++frequency1;

				case 2:
					++frequency2;
				case 3:
					++frequency3;
				case 4:
					++frequency4;
				case 5:
					++frequency5;
				case 6:
					++frequency6;
					break;

			}
			 counter++;
		}
		System.out.println("Face\tFrequency"); // output headers
		System.out.printf("1\t%d%n2\t%d%n3\t%d%n4\t%d%n5\t%d%n6\t%d%n",
		frequency1, frequency2, frequency3, frequency4,
		frequency5, frequency6);
	}



}