package at.fralexgaming;

public class Main {

	public static void main(String[] args) throws InterruptedException {

		SSHConnect.main("pi", "raspberrypi", "root", "gpio write 1 1");
	}
}
