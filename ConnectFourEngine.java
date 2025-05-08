public class ConnectFourEngine {
    
    public static int move(int[][] gameBoard, int turn)
    {
        int engineNumber = turn;
        int opponentNumber = turn % 2 + 1;

        if (checkPossibleWin(gameBoard, engineNumber) >= 0) // check if engine can win on this move 
        {

        }

        if (checkPossibleWin(gameBoard, opponentNumber) >= 0) // check if opponent can win on their next move (block if so)
        {
            
        }
    }

    private static int checkPossibleWin(int[][] gameBoard, int player)
    {

    }
}
