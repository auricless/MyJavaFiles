
public class Contestant {

	private int id;
	private int number;
	private boolean isRoundWinner;
	private boolean isChampion;

	public Contestant(int id, int number){
		this.id = id;
		this.number = number;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	public boolean isRoundWinner() {
		return isRoundWinner;
	}

	public void setRoundWinner(boolean isRoundWinner) {
		this.isRoundWinner = isRoundWinner;
	}
	
	public boolean isChampion() {
		return isChampion;
	}

	public void setChampion(boolean isChampion) {
		this.isChampion = isChampion;
	}
	
}
