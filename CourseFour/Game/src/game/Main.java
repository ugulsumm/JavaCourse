package game;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Game game = new Game();
		game.setCategory("araba");game.setName("araba yarýþý");game.setPrice(100);
		System.out.println(game.getCategory()+game.getName()+game.getPrice());
			
		Gamer gamer = new Gamer();
		gamer.setAd("gulsum");gamer.setDogumYili("1990");gamer.setSoyad("taban");gamer.setTcNo("11111111111");gamer.setBoughtGame(game);

		Campaign campaign = new Campaign();
		campaign.setCampaignRate(0.2f);campaign.setCampaignTime(2);campaign.setName("buyukindirim");
		
		GamerManager gamerManager = new GamerManager();
		gamerManager.register(gamer);		
		//gamerManager.verify(gamer, userEdevlet);
		gamerManager.verifyPerson(gamer);
		if(gamerManager.verifyPerson(gamer)) {
			System.out.println("Real person");
		}else {
			System.out.println("Unreal person");
		}
		
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.addCampaign(campaign);
		
		GameManager gameManager = new GameManager();
		gameManager.sales(gamer,game);
		gameManager.salesWithCampaign(game, campaign);
		
		
		
		
	}

}
