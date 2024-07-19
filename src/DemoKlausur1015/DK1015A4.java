package DemoKlausur1015;
import java.util.*;
import java.lang.*;

public class DK1015A4 {
    public static void main(String[] args) {



        //aufgabe 4a
        System.out.printf("\n\n\nAUFGABE 4a\\");
        final List<Character> lista = new ArrayList<Character>();
        lista.add('l');lista.add('a'); lista.add(',');
        lista.add('l'); lista.add('i'); lista.add(',');
        lista.add('l'); lista.add('u'); lista.add('.');
        final Iterator<Character> itera = lista.iterator();
        while( itera.hasNext() ){
            final Character c = itera.next();
            System.out.printf( "%c", c ); }//while


        //aufgabe 4b
        System.out.printf("\n\n\nAUFGABE 4b \n\n");
        final Integer[] ib = { 7, 3, 5, 2 };
        final List<Integer> listb = Arrays.asList( ib );
        final Iterator<Integer> iterb = listb.iterator();
        while( iterb.hasNext() ){

            final Integer ibb = iterb.next();   //hier wird die 7 zugewiesen. 
            if( iterb.hasNext() ) iterb.next(); //hier wird  die 3 übersprungen, weil 7 next hat, wird es 3
            System.out.printf( "%d ", ibb ); }//while

        //Aufgabe 4c
        final Stack<String> s = new Stack<String>(); s.push( "x" ); s.push( "p" ); s.push( "o" ); s.push( "q" ); s.push( "x" );
        while( ! s.isEmpty() ){ System.out.printf( "%s", s.pop() );
        }//while


        //Aufgabe 4d
        final List<String> vm = new ArrayList<String>(); vm.add( "Gurke" ); vm.add( "Paprika" ); vm.add( "Tomate" ); vm.add( "Zucchini" ); final List<String> cm = new ArrayList<String>(); cm.add( "rot" ); cm.add( "gelb" ); cm.add( "gruen" ); for( final String v : vm ){ for( final String c : cm ){ System.out.println( c + "e " + v ); }//for }//for


        
        
        

    }
}

