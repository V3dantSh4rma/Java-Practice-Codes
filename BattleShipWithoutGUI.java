import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

class GameManager {
    private int[]  locationOfCells;
    private int    hits;
    private String result = "miss";
    public String guess;
    public int    userTry;

    public void setLocationOfCells( int[] locationOfCells ) {
        this.locationOfCells = locationOfCells;
    }

    public String checkIfHit( String guess ) {
        int guessToInt = Integer.parseInt( guess );

        for ( int SingleCell : this.locationOfCells ) {
            if ( guessToInt == SingleCell ) {
                this.result = "Hit";
                this.hits++;
                break;
            };

            this.result = "Miss";
        }

        if ( hits == locationOfCells.length ) {
            this.result = "Kill";
        }

        System.out.println( this.result );
        return this.result;
    }

    public void getUserInput( String questionToAsk ) {
        try {
            System.out.println( questionToAsk + " " );
            BufferedReader reader    = new BufferedReader( new InputStreamReader( System.in ) );
            String         InputLine = reader.readLine( );

            if ( InputLine.length( ) == 0 ) System.out.println( "You must specify an input." );
            this.guess = InputLine;
        } catch ( IOException e ) {
            e.printStackTrace( );
        }
    }
};

public class BattleShipWithoutGUI {
    public static void main( String... args ) {
        GameManager game         = new GameManager( );
        int         randomNumber = ( int ) ( Math.random( ) * 5 );

        int[] locationOfCells = { randomNumber, randomNumber + 1, randomNumber + 2 };

        game.setLocationOfCells( locationOfCells );
        game.getUserInput( "Enter your guess: " );

        boolean isAlive = true;
        String  Usertry = game.checkIfHit( game.guess );

        while ( isAlive ) {
            game.getUserInput( "Enter your guess: " );
            String result = game.checkIfHit( game.guess );
            game.userTry++;

            if ( Objects.equals( result, "Kill" ) ) {
                isAlive = false;
                System.out.println( "You took "+game.userTry+" number of guesses." );
            }
        }
    }
}