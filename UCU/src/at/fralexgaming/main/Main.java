package at.fralexgaming.main;

public class Main {

	public static void main(String[] args) {

		Login.main();

	}

	public static void loginTrue() {
		System.out.println("Login successfull!!!");
		Boot.preInit();
		Boot.Init();
		Boot.postInit();

	}

	public static void loginFalse() {
		System.exit(1);
	}
}
