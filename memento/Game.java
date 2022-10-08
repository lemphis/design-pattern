package memento;

// originator
public class Game {

	private int blueTeamScore;
	private int redTeamScore;

	public int getBlueTeamScore() {
		return blueTeamScore;
	}

	public void setBlueTeamScore(int blueTeamScore) {
		this.blueTeamScore = blueTeamScore;
	}

	public int getRedTeamScore() {
		return redTeamScore;
	}

	public void setRedTeamScore(int redTeamScore) {
		this.redTeamScore = redTeamScore;
	}

	public GameSave save() {
		return new GameSave(blueTeamScore, redTeamScore);
	}

	public void restore(GameSave gameSave) {
		this.blueTeamScore = gameSave.getBlueTeamScore();
		this.redTeamScore = gameSave.getRedTeamScore();
	}

}
