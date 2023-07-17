package world.hello;

public class HelloWorld {

	public static void main(String[] args) {
		// 1
		System.out.println("Hello World!");
		System.out.print("Hello everybody\t");
		System.out.println("and my friends!\n");

		// 2
		String message = "Hello world";
		System.out.println(message + "!");

		System.out.println("Hello World!");
		String words = "Java forever";
		System.out.println(words);
		String space = " ";
		System.out.println(message + space + words + "\n");

		// 3
		int i = 42, j = 3;

		System.out.println(i);
		System.out.println(i + j + "\n");

		// 4
		int a = 6, b = 7;
		int answer = a * b;
		System.out.println(answer);
		double d = 2.5;
		System.out.println(a + b * d + "\n");

		//5
		String stringAnswer;
		stringAnswer = message + " " + answer;
		System.out.println(stringAnswer);
		System.out.println(message);

		String number = "-2";
		int result = answer + Integer.parseInt(number);
		System.out.println("Rezultatul este:" + " " + result);
		String oneMoreAnswer = message + " " + result;
		System.out.println(oneMoreAnswer + "\n");
		
		//6
		float answer2 = (float)b / (float)a;
		System.out.println(answer2);
		int hugeNumber = 521124244;
		System.out.println(hugeNumber % i + "\n");
		
		//7
		boolean isMoreThanOne;
		if (answer > 1) {
			isMoreThanOne = true;
		} else {
			isMoreThanOne = false;
		}
		System.out.println(isMoreThanOne);
		
		boolean evenNumber;
		if (a % 2 == 0 ) {
			evenNumber = true;
		} else {
			evenNumber = false;
		} 
		System.out.println(evenNumber);
		if (b % 2 == 0) {
			evenNumber = true;
		} else {
			evenNumber = false;
		}
		System.out.println(evenNumber);
		
	}
	

}
