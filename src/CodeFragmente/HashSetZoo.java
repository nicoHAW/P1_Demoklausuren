package CodeFragmente;

import java.util.*;

public class HashSetZoo {

    public static void main(String[] args) {
       
        final Set<String> zoo = new HashSet<String>();
        zoo.add( "Emu" );
        zoo.add( "Nandu" );
        zoo.add( "Gilatier" );
        zoo.add( "Kaiman" );
        zoo.add( "Kiwi" );
        zoo.add( "Kiwi" );
        zoo.add( "Kiwi" );
        zoo.add( "Gilatier" );
        zoo.add( "Nandu" );
        zoo.add( "Uhu" );
        int n1 = zoo.size();
        
        boolean b1 = zoo.contains("Gilatier" );
        zoo.remove("Gilatier" );
        
        int n2 = zoo.size();
        
        boolean b2 = zoo.contains("Gilatier" );
        System.out.printf(
                "%d ; %s ; %d ; %s",
                n1, b1, n2, b2
                );

        System.out.printf( "\n\n\n" );

    }

}
