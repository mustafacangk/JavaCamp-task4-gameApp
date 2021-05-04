package gameApp;

public class GameManager {
	
	 
	Game game1 = new Game(1, "Age of Empires II: Definitive Edition", 99);
	Game game2 = new Game(2, "The Forest", 39);
	Game game3 = new Game(3, "Valheim", 29);
	Campaign campain = new Campaign();
	
	
	public void gameSales(Player player) {
		System.out.println();
		System.out.println(player.getName() + " oyuncusuna " + game1.getName() + " oyunu satilmistir.");
		System.out.println(player.getName() + " oyuncusuna " + game2.getName() + " oyunu satilmistir.");
		System.out.println(player.getName() + " oyuncusuna " + game3.getName() + " oyunu satilmistir.");
	}
    
	public void gameSalesWithCampaign() {
		Double priceWithCampaign = game1.getPrice() - (game1.getPrice()*campain.getDiscountRate());
		System.out.println("Age of Empires II: Definitive Edition oyununun kampanyali fiyati : " + priceWithCampaign);
		Double priceWithCampaign2 = game2.getPrice() - (game1.getPrice()*campain.getDiscountRate());
		System.out.println("The Forest kampanyali fiyati : " + priceWithCampaign2);
		Double priceWithCampaign3 = game3.getPrice() - (game1.getPrice()*campain.getDiscountRate());
		System.out.println("Valheim oyununun kampanyali fiyati : " + priceWithCampaign3);
		
		
	}
}