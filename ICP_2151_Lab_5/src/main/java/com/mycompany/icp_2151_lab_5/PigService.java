package com.mycompany.icp_2151_lab_5;

import javax.jws.WebService;
import javax.jws.WebMethod;

/**
 * @author Huw
 * @author Michael
 */
@WebService(serviceName = "PigService")
public class PigService {

    private int playerAllocation;
    private int serverAllocation;

    private int playerScore;
    private int serverScore;
    /**
     * Rolls the dice between one and six for the player
     * @return a random dice number
     */
    @WebMethod(operationName = "playerRoll")
    public int playerRoll() {
        int diceNumber = 1 + (int) (Math.random() * 6);
        playerAllocation += diceNumber;
        return diceNumber;
    }

    /**
     * Rolls the dice between one and six for the server
     * @return a random dice number
     */
    @WebMethod(operationName = "serverRoll")
    public int serverRoll() {
        int diceNumber = 1 + (int) (Math.random() * 6);
        serverAllocation += diceNumber;
        return diceNumber;
    }

    /**
     * Returns the current total score of the player
     * @return player's total score
     */
    @WebMethod(operationName = "getPlayerScore")
    public String getPlayerScore() {
        String strScore = Integer.toString(playerScore + playerAllocation);
        //TODO write your implementation code here:
        return strScore;
    }

    /**
     * Resets the player's current turn allocation to 0
     */
    @WebMethod(operationName = "resetPlayerAllocation")
    public void resetPlayerAllocation() {
        playerAllocation = 0;
    }

    /**
     * Adds the player's current turn allocation to the player's total score
     * @return the player score with the increased value
     */
    @WebMethod(operationName = "savePlayerScore")
    public int savePlayerScore() {
        playerScore += playerAllocation;
        resetPlayerAllocation();
        return playerScore;
    }
    
    /**
     * Resets every parameter for a new game to begin
     */
    @WebMethod(operationName = "newGame")
    public void newGame() {
        playerScore = 0;
        serverScore = 0;
        
        resetPlayerAllocation();
        resetServerAllocation();
    }
    

    /**
     * Returns the current total score of the player
     * @return the server's total score
     */
    @WebMethod(operationName = "getServerScore")
    public String increaseServerScore() {
        String strScore = Integer.toString(serverScore + serverAllocation);
        //TODO write your implementation code here:
        return strScore;
    }

    /**
     * Resets the server's current turn allocation to 0
     */
    @WebMethod(operationName = "resetServerAllocation")
    public void resetServerAllocation() {
        serverAllocation = 0;
    }

    /**
     * Adds the server's current turn allocation to the server's total score
     * @return the server's score with the increased value
     */
    @WebMethod(operationName = "saveServerScore")
    public int saveServerScore() {
        serverScore += serverAllocation;
        resetServerAllocation();
        return serverScore;
    }
    
    /**
     * For the server's next turn randomize the amount of times he will try to gamble
     * @return a number of times the server will gamble between 3 and 6
     */
    @WebMethod(operationName = "serverSteps")
    public int serverSteps() {
        int rolls = 3 + (int) (Math.random() * 6);
        return rolls;
    }
    
    

}
