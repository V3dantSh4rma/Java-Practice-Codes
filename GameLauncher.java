// Number guesser game made in Java.
class Player {
    int     number;
    boolean isItRight = false;

    public Integer guess( ) {
        return number = ( int ) ( Math.random( ) * 10 );
    }
}

class GuessGame {

    public void startGame( ) {
        Player player1 = new Player( );
        Player player2 = new Player( );
        Player player3 = new Player( );

        int numberToGuess = ( int ) ( Math.random( ) * 10 );
        System.out.println( "Think of a number between 0 to 9." );
        System.out.println( "The number to guess is " + numberToGuess );

        while ( true ) {
            // Making our players guess the Number. These guessed numbers can be accessed by player.number.
            player1.guess( );
            player2.guess( );
            player3.guess( );

            if ( player1.number == numberToGuess ) {
                player1.isItRight = true;
            }

            if ( player2.number == numberToGuess ) {
                player2.isItRight = true;
            }

            if ( player3.number == numberToGuess ) {
                player3.isItRight = true;
            }

            if ( player1.isItRight || player2.isItRight || player3.isItRight ) {
                System.out.println( "- Player 1 got it right? " + player1.isItRight );
                System.out.println( "- Player 2 got it right? " + player2.isItRight );
                System.out.println( "- Player 3 got it right? " + player3.isItRight );
                System.out.println( "We have a winner!" );
                break;
            } else {
                System.out.println( "Players will have to try again. Better luck next time!" );
                break;
            }
        }
    }
}

public class GameLauncher {
    public static void main( String... args ) {
        new GuessGame( ).startGame( );
    }
}