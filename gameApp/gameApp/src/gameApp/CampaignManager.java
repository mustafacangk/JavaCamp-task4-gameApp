package gameApp;

public class CampaignManager {
	 
	Campaign campaign1 = new Campaign("Yaz kampanyasi", 0.5, 3);
	Campaign campaign2 = new Campaign("Mayis kampanyasi", 0.7, 2);
	Campaign campaign3 = new Campaign("Kis kampanyasi",0.95,1);
	
	
	public CampaignManager(Campaign campaign1, Campaign campaign2, Campaign campaign3) {
		this.campaign1 = campaign1;
		this.campaign2 = campaign2;
		this.campaign3 = campaign3;
	}

	public void campainEntry(Campaign campaign) {
		System.out.println(campaign.getCampainName() + " isimli kampanya basariyla girildi.");
	}
	
	public void updateCampain(Campaign campaign) {
		System.out.println(campaign.getCampainName() + " isimli kampanya basariyla guncellendi.");
		
	}
	
	public void deleteCampaign(Campaign campaign) {
		System.out.println(campaign.getCampainName() + " isimli kampanya basariyla silindi.");
		
	}

}
