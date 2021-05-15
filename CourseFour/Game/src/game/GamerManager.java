package game;

public class GamerManager implements GamerService{
	
	public void register(Gamer gamer) {
		
		System.out.println("Gamer" + gamer.getAd()+ "registered.");
	}
	public void update(Gamer gamer) {
			System.out.println("Gamer" + gamer.getAd()+ "updated.");		
	}
	public void delete(Gamer gamer) {
		System.out.println("Gamer " + gamer.getAd()+ " deleted.");
	}

	@Override
	public boolean verifyPerson(Gamer gamer) {
		// TODO Auto-generated method stub
		MernisAdapter mernisAdapter = new MernisAdapter();
		return mernisAdapter.verifyPerson(gamer);

	}
}
