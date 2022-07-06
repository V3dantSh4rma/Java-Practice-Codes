
public class PhraseOmatic {
    public static void main( String[] args ) {

        // Word lists
        String[] wordList1 = {
                "24/7", "multi-tier", "30,000 foot", "B-To-B", "win-win", "front-end", "web-based", "pervasive", "smart", "six-sigma", "critical-path", "dynamic"
        };

        String[] wordlist2 = {
                "empowered", "sticky", "value-added", "oriented", "centric", "distributed", "clustered", "branded", "outside-the-box", "positioned", "networked", "focused", "leveraged", "aligned", "targeted", "shared", "cooperative", "accelerated"
        };

        String[] wordList3 = {
                "process", "tipping-point", "solution", "architecture", "core competency", "strategy", "mindshare", "portal", "space", "vision", "paradigm", "mission"
        };

        // Random content of Word Lists
        int randomWordList1 = ( int ) ( Math.random( ) * wordList1.length );
        int randomWordList2 = ( int ) ( Math.random( ) * wordlist2.length );
        int randomWordList3 = ( int ) ( Math.random( ) * wordList3.length );


        // Phrase
        String phrase = wordList1[ randomWordList1 ] + " " + wordlist2[ randomWordList2 ] + " " + wordList3[ randomWordList3 ];

        System.out.println( "What we need is a " + phrase );
    }
}