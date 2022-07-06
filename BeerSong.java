// 99 Bottles of Beer on the wall.

public class BeerSong {
    public static void main( String[] args ) {
        int    beers = 99;
        String word  = "bottles";

        while ( beers > 0 ) {
            if ( beers == 1 ) {
                word = "bottle";
            }

            System.out.println( beers + " " + word + " of beer on the wall." );
            System.out.println( beers + " " + word + " of beer." );
            System.out.println( "Take one down." );
            System.out.println( "Pass it around." );
            beers -= 1;


            if ( beers == 0 ) {
                System.out.println( "No more bottles of beer on the wall." );
            }
        }
    }
}