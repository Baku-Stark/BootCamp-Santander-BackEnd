package mainApp;

public class Main {
	public static void main(String[] args) {
		/* UTILIZE PRIMEIRO O "DEBUG MAIN" > "STEP OVER" */
		System.out.println("Start program!");
		hello();
		secondStep();
		System.out.println("End program!");
	}
	
	public static void hello() {
		System.out.println("Hello");
	}
	
	public static void secondStep() {
		for(int num = 1; num <= 10; num++) {
			System.out.println("Number" + num);
		}
	}
}
