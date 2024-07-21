package CodeFragmente;

import java.util.*;

public class Fragment7352 {

    public static void main(String[] args) {

        
        
        System.out.printf("final Integer[] ia = { 7, 5, 3, 2 };\r\n"
                + "final Iterator<Integer> iter = Arrays.asList( ia ).iterator();\r\n"
                + "while( iter.hasNext() ){\r\n"
                + "final Integer i = iter.next(); = ");

        final Integer[] iab = { 7, 5, 3, 2 };
        final Iterator<Integer> iterb = Arrays.asList( iab ).iterator();
        while( iterb.hasNext() ){
            final Integer ib = iterb.next();
            System.out.printf( "%d ", ib );
        }//while

        
        System.out.printf( "\n\n\n" );
        
        
        System.out.printf(" final Integer[] ia = { 7, 3, 5, 2 };\r\n"
                + "        final List<Integer> list = Arrays.asList( ia );\r\n"
                + "        final Iterator<Integer> iter = list.iterator();\r\n"
                + "        while( iter.hasNext() ){\r\n"
                + "            final Integer i = iter.next();\r\n"
                + "            if( iter.hasNext() ) iter.next();\r\n"
                + "            System.out.printf( \"%%d \", i );\r\n"
                + "        }//while = ");
        final Integer[] iac = { 7, 3, 5, 2 };
        final List<Integer> listc = Arrays.asList( iac );
        final Iterator<Integer> iterc = listc.iterator();
        
        while( iterc.hasNext() ){
            final Integer ic = iterc.next();
            if( iterc.hasNext() ) iterc.next();
            System.out.printf( "%d ", ic );
        }//while


        System.out.printf( "\n\n\n" );
        
        
        
        final List<Integer> list = new ArrayList<Integer>();
        list.add( 3 );
        list.add( 5 );
        list.add( 7 );
        list.add( 11 );
        final ListIterator<Integer> lIter = list.listIterator();
        
        while( lIter.hasNext() ) System.out.printf( "%d ", lIter.next());
        
        while( lIter.hasPrevious() ) System.out.printf( "%d ", lIter.previous());


        System.out.printf( "\n\n\n" );

        
        
    }

}
