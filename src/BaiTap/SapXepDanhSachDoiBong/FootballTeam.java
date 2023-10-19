package BaiTap.SapXepDanhSachDoiBong;

public class FootballTeam {
    private int footballTeamId;
    private String teamName;
    private int numOfPlayers;
    private int score;

    public int getFootballTeamId() {
        return footballTeamId;
    }

    public void setFootballTeamId(int footballTeamId) {
        this.footballTeamId = footballTeamId;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public int getNumOfPlayers() {
        return numOfPlayers;
    }

    public void setNumOfPlayers(int numOfPlayers) {
        this.numOfPlayers = numOfPlayers;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public FootballTeam(int footballTeamId, String teamName, int numOfPlayers, int score) {
        this.footballTeamId = footballTeamId;
        this.teamName = teamName;
        this.numOfPlayers = numOfPlayers;
        this.score = score;
    }

    @Override
    public String toString() {
        return "FootballTeam{" +
                "footballTeamId=" + footballTeamId +
                ", teamName='" + teamName + '\'' +
                ", numOfPlayers=" + numOfPlayers +
                ", score=" + score +
                '}';
    }
}
