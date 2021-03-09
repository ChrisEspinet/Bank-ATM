import java.util.Scanner;

public class Bank_ATM {
	static char choice;
	static double Sbalance = 10000;
	static double Cbalance = 5000;

	public static void main(String[] args) {

		// Customer information
		String name = "Christopher";
		int customer_number = 516314;
		int pin = 1234;

		Scanner bankScanner = new Scanner(System.in);
		System.out.println("Welcome!");
		System.out.println();

		System.out.println("Please enter your customer number");
		System.out.println("A = OK");
		int enteredNumber = bankScanner.nextInt();

		if (enteredNumber == customer_number) {
			System.out.println("Enter PIN");
			System.out.println("A = OK");
			int enteredPin = bankScanner.nextInt();

			if (enteredPin == pin) {
				System.out.println("Welcome " + name + ".");
				System.out
						.println("Please choose which account you want to view: \nA = Checking\nB = Savings\nC = Exit");
				choice = bankScanner.next(".").charAt(0);

				// Checking Account
				if (choice == 'A') {
					System.out.println("Checking Balance = " + Cbalance);
					System.out.println(
							"Please choose one of the following actions: \nA = Withdraw\nB = Deposit\nC = Cancel");
					choice = bankScanner.next(".").charAt(0);

					// Checking Withdraw
					if (choice == 'A') {
						Cwithdraw();
					}

					// Checking Deposit
					if (choice == 'B') {
						Cdeposit();
					}

					// Checking Exit
					if (choice == 'C') {
						System.exit(0);
					}
				}

				// Savings Account
				if (choice == 'B') {
					System.out.println("Savings Balance = " + Sbalance);
					System.out.println(
							"Please choose one of the following actions: \nA = Withdraw\nB = Deposit\nC = Cancel");
					choice = bankScanner.next(".").charAt(0);

					// Savings Withdraw
					if (choice == 'A') {
						Swithdraw();
					}

					// Savings Deposit
					if (choice == 'B') {
						Sdeposit();
					}

					// Savings Exit
					if (choice == 'C') {
						System.exit(0);
					}
				}

				// Exit
				if (choice == 'C') {
					System.exit(0);
				}
			} else
				System.out.println("Invalid PIN. Please try again.");
		} else
			System.out.print("Invalid customer number. Please try again.");
		bankScanner.close();

	}

	public static void Swithdraw() {
		System.out.println("How much money would you like to withdraw?");
		Scanner in = new Scanner(System.in);
		double withdraw_amount = in.nextDouble();
		if (withdraw_amount > Sbalance) {
			System.out.println("Insuficient Balance. Please try again");
		} else {
			Sbalance -= withdraw_amount;
			System.out.println("Withdrawal successful. Your new balance is: " + Sbalance);
		}
		in.close();
	}

	public static void Sdeposit() {
		System.out.println("How much money would you like to deposit?");
		Scanner in = new Scanner(System.in);
		double deposit_amount = in.nextDouble();

		Sbalance += deposit_amount;
		System.out.println("Your new balance is: " + Sbalance);
		in.close();
	}

	public static void Cwithdraw() {
		System.out.println("How much money would you like to withdraw?");
		Scanner in = new Scanner(System.in);
		double withdraw_amount = in.nextDouble();
		if (withdraw_amount > Cbalance) {
			System.out.println("Insuficient Balance. Please try again");
		} else {
			Cbalance -= withdraw_amount;
			System.out.println("Withdrawal successful. Your new balance is: " + Cbalance);
		}
		in.close();
	}

	public static void Cdeposit() {
		System.out.println("How much money would you like to deposit?");
		Scanner in = new Scanner(System.in);
		double deposit_amount = in.nextDouble();

		Cbalance += deposit_amount;
		System.out.println("Your new balance is: " + Cbalance);
		in.close();
	}

}
