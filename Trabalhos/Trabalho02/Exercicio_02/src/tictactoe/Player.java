package tictactoe;

public class Player {

    private char playerOne = 'X';
    private char playerTwo = 'O';

    /**
     * @return char return the playerOne
     */
    public char getPlayerOne() {
        return playerOne;
    }

    /**
     * @param playerOne the playerOne to set
     */
    public void setPlayerOne(char playerOne) {
        this.playerOne = playerOne;
    }

    /**
     * @return char return the playerTwo
     */
    public char getPlayerTwo() {
        return playerTwo;
    }

    /**
     * @param playerTwo the playerTwo to set
     */
    public void setPlayerTwo(char playerTwo) {
        this.playerTwo = playerTwo;
    }

}