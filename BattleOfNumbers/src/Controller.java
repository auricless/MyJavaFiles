import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/*
 * Used ArrayList for Data
 * All ArrayList SEARCH functions weren't used
 */
public class Controller {
	
	private int numberOfBrackets;
	private int totalNumberOfRounds;
	
	public enum Player{
		ONE,
		TWO
	}
	
	List<Contestant> contestants = new ArrayList<>();
	List<Contestant> nextRoundContestants = new ArrayList<>();
	
	public Controller(int numberOfContestants) {
		for(int i = 1; i <= numberOfContestants; i++) {
			int contestantId = i;
			int contestantNum = (int)(Math.random() * 51) + 0;
			contestants.add(new Contestant(contestantId, contestantNum));
			System.out.println("Enter Contestant #" + contestantId + ": " + contestantNum);
		}
	}
	
	/*
	 * Start the Battle and Initiate Bracket Match
	 * -If there are only 1 Contestant left in play, declare him champion
	 * -Resets the Contestant property isRoundWinner for the next round 
	 */
	public void startSimulation() {
		while(contestants.size() > 1) {
			startBracket();
			
			if(contestants.size() <= 1) {
				for(Contestant contestant : contestants) {
					System.out.println("CHAMPION: " + contestant.getNumber());
				}
				System.out.println("TOTAL BRACKET MATCHES: " + numberOfBrackets);
				System.out.println("TOTAL ROUNDS: " + totalNumberOfRounds);
			}
			
			for(Contestant contestant : contestants) {
				contestant.setRoundWinner(false);
			}
		}
	}
	
	/*
	 * Starts the Bracket Match(es)
	 * -Increments the number of Bracket and Prints Next... every start of Bracket Match
	 * -Determine the number of rounds
	 * -Initiate Round Match(es)
	 * -Remove Lost Contestants in play
	 * -Reorder Contestants every round so the selection would always be FIRST IN vs LAST IN and so on
	 */
	private void startBracket() {
		numberOfBrackets++;
		System.out.println("Next...");
		int roundContestants = contestants.size();
		int numberOfRounds = setNumberOfRounds(roundContestants);
		
		for(int i = 1; i <= numberOfRounds; i++) {
			int currentRound = i;
			if(roundContestants == 1) {
				declareDefaultWinner(currentRound);
				break;
			}
			startRound(currentRound);
			roundContestants -= 2;
		}
		removeLostContestantInPlay();
		reorderContestantsInPlay();
	}
	
	/*
	 * Starts the Round Match(es)
	 * -Increment number of Rounds
	 * -Get all participating contestants in current round, called player
	 * -Evaluate their respective number and declare them winner
	 */
	private void startRound(int currentRound) {
		totalNumberOfRounds++;
		
		Contestant player1 = getPlayer(currentRound, Player.ONE);
		Contestant player2 = getPlayer(currentRound, Player.TWO);
		
		evaluateWinner(player1, player2, currentRound);
	}
	
	/*
	 * Determines the number of rounds per bracket before starting Round match
	 */
	private int setNumberOfRounds(int roundContestants){
		if(roundContestants % 2 != 0) {
			return (roundContestants / 2) + 1;
		}
		
		return roundContestants / 2;
	}
	
	/*
	 * Declare and Adds default winner to move on to the next round
	 */
	private void declareDefaultWinner(int currentRound) {
		int counter = 1;
		for(Contestant contestant : contestants) {
			if(counter == ((contestants.size() / 2) + 1)){
				contestant.setRoundWinner(true);
				nextRoundContestants.add(contestant);
				System.out.println("Round " + currentRound + ": Default Winner is " + contestant.getNumber());
			}
			counter++;
		}
	}
	
	/*
	 * Remove Contestants in play by removing it on the ArrayList Contestants
	 */
	private void removeLostContestantInPlay() {
		for(Iterator<Contestant> iterator = contestants.iterator(); iterator.hasNext();) {
			Contestant contestant = iterator.next();
			if(!contestant.isRoundWinner()) {
				iterator.remove();
			}
		}
	}
	
	/*
	 * Reorder Contestants in play so the mechanics FIRST IN VS LAST IN will always happen
	 */
	private void reorderContestantsInPlay() {
		contestants.removeAll(contestants);
		for(int i = 0; i < nextRoundContestants.size(); i++) {
			contestants.add(nextRoundContestants.get(i));
		}
		nextRoundContestants.removeAll(contestants);
	}
	
	/*
	 * Evaluate the winner between two participating contestants in the current round and declare him winner
	 */
	private void evaluateWinner(Contestant player1, Contestant player2, int currentRound) {
		if(player1.getNumber() > player2.getNumber()) {
			System.out.println("Round " + currentRound + ": " + player1.getNumber() + " vs " + player2.getNumber() + " Winner is: " + player1.getNumber());
			for(Iterator<Contestant> iterator = contestants.iterator(); iterator.hasNext();) {
				Contestant contestant = iterator.next();
				if(contestant.getId() == player1.getId()) {
					contestant.setRoundWinner(true);
					nextRoundContestants.add(contestant);
				}
			}
		}else{
			System.out.println("Round " + currentRound + ": " + player1.getNumber() + " vs " + player2.getNumber() + " Winner is: " + player2.getNumber());
			for(Iterator<Contestant> iterator = contestants.iterator(); iterator.hasNext();) {
				Contestant contestant = iterator.next();
				if(contestant.getId() == player2.getId()) {
					contestant.setRoundWinner(true);
					nextRoundContestants.add(contestant);
				}
			}
		}
	}
	
	/*
	 * Fetch Contestants to participate in the current round, if enum Player.One is in the argument,
	 * return contestant for player1 else if enum Player.Two, return contestant for player 2.
	 */
	private Contestant getPlayer(int currentRound, Player playerNumber) {
		int counter = 1;
		int player;
		
		if(playerNumber == Player.ONE) {
			player = currentRound;
			for(Contestant contestant : contestants) {
				if(counter == player){
					return contestant;
				}
				counter++;
			}
		}else if(playerNumber == Player.TWO){
			player = ((contestants.size() + 1) - currentRound);
			for(Contestant contestant : contestants) {
				if(counter == player){
					return contestant;
				}
				counter++;
			}
		}
		
		return null;
	}
	
}
	