package at.fralexgaming;

public class Main {

	public static void main(String[] args) throws InterruptedException {


		for(int faktor = 1; faktor <= 9; faktor ++ ) {
			SSHConnect.sender("gpio write 1 1");
			SSHConnect.sender("gpio write 1 0");

		try{
			Thread.sleep(250);
		}catch(InterruptedException e){}
		
	}

}
}
