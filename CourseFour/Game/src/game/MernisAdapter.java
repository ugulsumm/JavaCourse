package game;



public class MernisAdapter implements GamerService{

	@Override
	public boolean verifyPerson(Gamer gamer) {

		Mernis mernis = new Mernis();
		return mernis.TCKimlikNoDogrula(gamer.getTcNo(), gamer.getAd(), gamer.getSoyad(), gamer.getDogumYili());

		
	}

}
