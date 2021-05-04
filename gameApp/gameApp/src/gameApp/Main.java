package gameApp;

import java.util.Scanner;
 
public class Main {

	public static void main(String[] args) {
		
		Logger[] loggers = {new IdentifyLogger(),new NameLogger()};
		PlayerManager playerManager = new PlayerManager(loggers);
		GameManager gameManager = new GameManager();
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);		
		System.out.println("Tc'ni gir: ");		 			 		 
		String idNo = scan.nextLine();
		System.out.println("Adini gir: ");	
		String ad = scan.nextLine();
		System.out.println("Soyadi gir: ");	
		String soyad = scan.nextLine();
	    Player player = new Player(idNo,ad,soyad,1999);
		
	    playerManager.permission(loggers, player.getName()+ " " + player.getSurname());
	    System.out.println(); 
	    playerManager.signUp(player.getName() + " " + player.getSurname());
		playerManager.updateInformation(player.getName() + " " + player.getSurname());
		playerManager.deleteAccount(player.getName() + " " + player.getSurname());
		System.out.println();
		gameManager.gameSales(player);
		System.out.println();
		gameManager.gameSalesWithCampaign();
		

	}

}