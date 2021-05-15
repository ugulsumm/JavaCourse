package game;

public class CampaignManager {
	public void addCampaign(Campaign campaign) {
		System.out.println(campaign.getName()+ "added.");
	}
	public void deleteCampaign(Campaign campaign) {
		System.out.println(campaign.getName()+ "deleted.");
	}
	public void updateCampaign(Campaign campaign) {
		
		System.out.println(campaign.getName()+ "updated.");
	}
}
