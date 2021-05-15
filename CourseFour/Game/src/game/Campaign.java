package game;

public class Campaign {
	private float campaignRate;
	private int campaignTime;
	private String name;
	public Campaign() {
		super();
	}
	public Campaign(float campaignRate, int campaignTime, String name) {
		super();
		this.campaignRate = campaignRate;
		this.campaignTime = campaignTime;
		this.name = name;
	}
	public float getCampaignRate() {
		return campaignRate;
	}
	public void setCampaignRate(float campaignRate) {
		this.campaignRate = campaignRate;
	}
	public int getCampaignTime() {
		return campaignTime;
	}
	public void setCampaignTime(int campaignTime) {
		this.campaignTime = campaignTime;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
