package game;

public class GameManager {
	public void sales(Gamer gamer, Game game) {
		gamer.setBoughtGame(game);
		System.out.println(game.getName() + "was sold to "+ gamer.getAd());
	}
	public void salesWithCampaign(Game game, Campaign campaign) {
		game.setPrice(game.getPrice()-game.getPrice()*campaign.getCampaignRate());
		System.out.println(game.getName()+ "'s new price is "+ game.getPrice());
	}
}
