package CodeFragmente;
import java.util.*;
import java.lang.*;
import java.math.*;

public class CodeFragmente {

    public static void main(String[] args) {

        System.out.printf("----- SEITE 1 -----");
        System.out.printf("\n\n");

        System.out.printf("final Integer[] ia = { 7, 5, 3, 2 };\r\n"
                + "final Iterator<Integer> iter = Arrays.asList( ia ).iterator();\r\n"
                + "while( iter.hasNext() ){\r\n"
                + "final Integer i = iter.next(); = ");

        final Integer[] ia = { 7, 5, 3, 2 };
        final Iterator<Integer> iter = Arrays.asList( ia ).iterator();
        while( iter.hasNext() ){
            final Integer i = iter.next();
            System.out.printf( "%d ", i );
        }//while

        System.out.printf( "\n\n\n");


        System.out.printf("-final Stack<String> s = new Stack<String>();\r\n"
                + "        s.push( \"a\" );\r\n"
                + "        s.push( \"b\" );\r\n"
                + "        s.push( \"c\" );\r\n"
                + "        s.push( \"d\" );\r\n"
                + "        s.push( \"e\" );\r\n"
                + "        while( ! s.isEmpty() ){\r\n"
                + "            System.out.printf( \"%%s\", s.pop() );\r\n"
                + "        }//while\n = ");
        final Stack<String> s = new Stack<String>();
        s.push( "a" );
        s.push( "b" );
        s.push( "c" );
        s.push( "d" );
        s.push( "e" );
        while( ! s.isEmpty() ){
            System.out.printf( "%s", s.pop() );
        }//while


        System.out.printf( "\n\n\n");





        System.out.printf("----- SEITE 2 -----");
        System.out.printf("\n\n");
        

        System.out.printf( "final Map<String,Character> map = new TreeMap<String,Character>();\r\n"
                + "        map.put( \"Luke\", 'a' );\r\n"
                + "        map.put( \"Yoda\", 'b' );\r\n"
                + "        map.put( \"Rey\", 'c' );\r\n"
                + "        map.put( \"Ahsoka\", 'd' );\r\n"
                + "        map.put( \"Yoda\", 'e' );\r\n"
                + "        map.put( \"Yoda\", 'f' );\r\n"
                + "        map.put( \"Anakin\", 'g' );\r\n"
                + "        map.put( \"Rey\", 'h' );\r\n"
                + "        map.put( \"Aayla\", 'i' );\r\n"
                + "        map.put( \"Luminara\", 'j' );\r\n"
                + "        map.put( \"Luke\", 'k' );\r\n"
                + "        map.put( \"Yoda\", 'l' );\r\n"
                + "        map.put( \"Aayla\", 'm' );\r\n"
                + "        map.put( \"Yoda\", 'n' );\r\n"
                + "        map.put( \"Yoda\", 'o' );\r\n"
                + "        System.out.printf( \"%%d : \", map.size() );\r\n"
                + "        for ( final String sa : map.keySet() ){\r\n"
                + "            System.out.printf( \"%%c \", map.get( sa ) );\r\n"
                + "        }//for = ");
        final Map<String,Character> map = new TreeMap<String,Character>();
        map.put( "Luke", 'a' );
        map.put( "Yoda", 'b' );
        map.put( "Rey", 'c' );
        map.put( "Ahsoka", 'd' );
        map.put( "Yoda", 'e' );
        map.put( "Yoda", 'f' );
        map.put( "Anakin", 'g' );
        map.put( "Rey", 'h' );
        map.put( "Aayla", 'i' );
        map.put( "Luminara", 'j' );
        map.put( "Luke", 'k' );
        map.put( "Yoda", 'l' );
        map.put( "Aayla", 'm' );
        map.put( "Yoda", 'n' );
        map.put( "Yoda", 'o' );
        System.out.printf( "%d : ", map.size() );
        for ( final String sa : map.keySet() ){
            System.out.printf( "%c ", map.get( sa ) );
        }//for

        System.out.printf( "\n\n\n" );




        System.out.printf( "for( char c : new char[]{'a', 'w', 'u' }) {\r\n"
                + "         System.out.printf( \"%%c \", c ); } = ");

        for( char c : new char[]{'a', 'w', 'u' }) {
            System.out.printf( "%c ", c ); }


        System.out.printf( "\n\n\n" );


        System.out.printf("----- SEITE 6 -----");
        System.out.printf("\n\n");
        
        System.out.printf( "        final List<Character> list = new ArrayList<Character>();\r\n"
                + "        list.add('l'); list.add('a'); list.add(',');\r\n"
                + "        list.add('l'); list.add('i'); list.add(',');\r\n"
                + "        list.add('l'); list.add('u'); list.add('.');\r\n"
                + "        final Iterator<Character> itera = list.iterator();\r\n"
                + "        while( iter.hasNext() ){\r\n"
                + "            final Character c = itera.next(); = ");
        final List<Character> listuzt = new ArrayList<Character>();
        listuzt.add('l'); listuzt.add('a'); listuzt.add(',');
        listuzt.add('l'); listuzt.add('i'); listuzt.add(',');
        listuzt.add('l'); listuzt.add('u'); listuzt.add('.');
        final Iterator<Character> iteruzt = listuzt.iterator();
        while( iteruzt.hasNext() ){
            final Character c = iteruzt.next();
            System.out.printf( "%c", c );
        }//while



        System.out.printf( "\n\n\n" );


        System.out.printf( "        final Integer[] iab = { 7, 3, 5, 2 };\r\n"
                + "        final List<Integer> listb = Arrays.asList( iab );\r\n"
                + "        final Iterator<Integer> iterb = listb.iterator();\r\n"
                + "        while( iterb.hasNext() ){\r\n"
                + "            final Integer ib = iterb.next();\r\n"
                + "            if( iter.hasNext() ) iterb.next();\r\n"
                + "            System.out.printf( \"%%d \", ib );\r\n"
                + "        }//while = ");
        final Integer[] iab = { 7, 3, 5, 2 };
        final List<Integer> listb = Arrays.asList( iab );
        final Iterator<Integer> iterb = listb.iterator();
        while( iterb.hasNext() ){
            final Integer ib = iterb.next();
            if( iterb.hasNext() ) iterb.next();
            System.out.printf( "%d ", ib );
        }//while


        System.out.printf( "\n\n\n" );




        System.out.printf("----- SEITE 7 -----");
        System.out.printf("\n\n");
        
        System.out.printf( "        final Stack<String> sc = new Stack<String>();\r\n"
                + "        s.push( \"x\" );\r\n"
                + "        s.push( \"p\" );\r\n"
                + "        s.push( \"o\" );\r\n"
                + "        s.push( \"q\" );\r\n"
                + "        s.push( \"x\" );\r\n"
                + "        while( ! sc.isEmpty() ){\r\n"
                + "            System.out.printf( \"%%s\", s.pop() );\r\n"
                + "        }//while  = ");
        final Stack<String> sc = new Stack<String>();
        sc.push( "x" );
        sc.push( "p" );
        sc.push( "o" );
        sc.push( "q" );
        sc.push( "x" );
        while( ! sc.isEmpty() ){
            System.out.printf( "%s", sc.pop() );
        }//while


        System.out.printf( "\n\n\n" );

        System.out.printf( "        final List<String> vm = new ArrayList<String>();\r\n"
                + "        vm.add( \"Gurke\" );\r\n"
                + "        vm.add( \"Paprika\" );\r\n"
                + "        vm.add( \"Tomate\" );\r\n"
                + "        vm.add( \"Zucchini\" );\r\n"
                + "\r\n"
                + "        final List<String> cm = new ArrayList<String>();\r\n"
                + "        cm.add( \"rot\" );\r\n"
                + "        cm.add( \"gelb\" );\r\n"
                + "        cm.add( \"gruen\" );\r\n"
                + "\r\n"
                + "        for( final String v : vm ){\r\n"
                + "\r\n"
                + "            for( final String c : cm ){\r\n"
                + "                System.out.println( c + \"e \" + v );\r\n"
                + "            }//for\r\n"
                + "        }//for = \n");
        final List<String> vm = new ArrayList<String>();
        vm.add( "Gurke" );
        vm.add( "Paprika" );
        vm.add( "Tomate" );
        vm.add( "Zucchini" );

        final List<String> cm = new ArrayList<String>();
        cm.add( "rot" );
        cm.add( "gelb" );
        cm.add( "gruen" );

        for( final String v : vm ){

            for( final String c : cm ){
                System.out.println( c + "e " + v );
            }//for
        }//for


        System.out.printf( "\n\n\n" );

        System.out.printf("----- SEITE 8 -----");
        System.out.printf("\n\n");
        

        System.out.printf("final Map<String,Character> mapa = new TreeMap<String,Character>();\r\n"
                + "        map.put( \"Papaya\", 'a' );\r\n"
                + "        map.put( \"Ananas\", 'b' );\r\n"
                + "        map.put( \"Ananas\", 'c' );\r\n"
                + "        map.put( \"Mango\", 'd' );\r\n"
                + "        map.put( \"Orange\", 'e' );\r\n"
                + "        map.put( \"Mango\", 'f' );\r\n"
                + "        map.put( \"Orange\", 'g' );\r\n"
                + "        map.put( \"Mango\", 'h' );\r\n"
                + "        map.put( \"Papaya\", 'o' ); // \"Sprung\", also 'o' statt 'i', damit Buschtaben leichter unterscheidbar\r\n"
                + "        map.put( \"Zitrone\", 'p' );\r\n"
                + "        map.put( \"Orange\", 'q' );\r\n"
                + "        System.out.printf( \"%%d : \", mapa.size() );\r\n"
                + "        for ( final String sd : mapa.keySet() ){\r\n"
                + "            System.out.printf( \"%%c\", map.get( sd ) );\r\n"
                + "        }//for = ");
        final Map<String,Character> mapa = new TreeMap<String,Character>();
        mapa.put( "Papaya", 'a' );
        mapa.put( "Ananas", 'b' );
        mapa.put( "Ananas", 'c' );
        mapa.put( "Mango", 'd' );
        mapa.put( "Orange", 'e' );
        mapa.put( "Mango", 'f' );
        mapa.put( "Orange", 'g' );
        mapa.put( "Mango", 'h' );
        mapa.put( "Papaya", 'o' ); // "Sprung", also 'o' statt 'i', damit Buschtaben leichter unterscheidbar
        mapa.put( "Zitrone", 'p' );
        mapa.put( "Orange", 'q' );
        System.out.printf( "%d : ", mapa.size() );
        for ( final String sd : mapa.keySet() ){
            System.out.printf( "%c", mapa.get( sd ) );
        }//for


        System.out.printf( "\n\n\n" );


        System.out.printf("        final Set<String> setd = new TreeSet<String>();\r\n"
                + "        setd.add( \"v\" ); setd.add( \"w\" ); setd.add( \"x\" );\r\n"
                + "        setd.add( \"w\" ); setd.add( \"x\" ); setd.add( \"y\" );\r\n"
                + "        setd.add( \"x\" ); setd.add( \"y\" ); setd.add( \"z\" );\r\n"
                + "        for( String se : setd ) System.out.printf( \"%%s \", se );  = ");
        final Set<String> setd = new TreeSet<String>();
        setd.add( "v" ); setd.add( "w" ); setd.add( "x" );
        setd.add( "w" ); setd.add( "x" ); setd.add( "y" );
        setd.add( "x" ); setd.add( "y" ); setd.add( "z" );
        for( String se : setd ) System.out.printf( "%s ", se );



        System.out.printf( "\n\n\n" );


        System.out.printf("final Queue<String> queue = new LinkedList<String>();\r\n"
                + "        for( final String sf : new String[]{ \"Merkur\",\"Venus\",\"Mars\",\"Venus\",\"Pluto\"\r\n"
                + "        }){\r\n"
                + "            queue.offer( sf );\r\n"
                + "        }//for\r\n"
                + "        while( !queue.isEmpty() ){\r\n"
                + "            System.out.printf( \"%%s \", queue.poll() );\r\n"
                + "        }//while  = ");
        final Queue<String> queue = new LinkedList<String>();
        for( final String sf : new String[]{ "Merkur","Venus","Mars","Venus","Pluto"
        }){
            queue.offer( sf );
        }//for
        while( !queue.isEmpty() ){
            System.out.printf( "%s ", queue.poll() );
        }//while


        System.out.printf( "\n\n\n" );


        System.out.printf("----- SEITE 10 -----");
        System.out.printf("\n\n");
        
        System.out.printf("final List<Character> listg = new ArrayList<Character>();\r\n"
                + "        listg.add('B'); listg.add('l'); listg.add('a'); listg.add(',');\r\n"
                + "        listg.add('b'); listg.add('l'); listg.add('a'); listg.add(',');\r\n"
                + "        listg.add('b'); listg.add('l'); listg.add('a'); listg.add('.');\r\n"
                + "        final Iterator<Character> iterg = listg.iterator();\r\n"
                + "        while( iterg.hasNext() ){\r\n"
                + "            final Character cg = iterg.next();\r\n"
                + "            System.out.printf( \"%%c\", cg );\r\n"
                + "        }//while = ");
        final List<Character> listg = new ArrayList<Character>();
        listg.add('B'); listg.add('l'); listg.add('a'); listg.add(',');
        listg.add('b'); listg.add('l'); listg.add('a'); listg.add(',');
        listg.add('b'); listg.add('l'); listg.add('a'); listg.add('.');
        final Iterator<Character> iterg = listg.iterator();
        while( iterg.hasNext() ){
            final Character cg = iterg.next();
            System.out.printf( "%c", cg );
        }//while


        System.out.printf( "\n\n\n" );



        System.out.printf("final Stack<String> sh = new Stack<String>();\r\n"
                + "        s.push( \"x\" );\r\n"
                + "        s.push( \"p\" );\r\n"
                + "        s.push( \"q\" );\r\n"
                + "        s.push( \"x\" );\r\n"
                + "        s.push( \"o\" );\r\n"
                + "        while( ! sh.isEmpty() ){\r\n"
                + "            System.out.printf( \"%%s\", sh.pop() );\r\n"
                + "        }//while = ");
        final Stack<String> sh = new Stack<String>();
        sh.push( "x" );
        sh.push( "p" );
        sh.push( "q" );
        sh.push( "x" );
        sh.push( "o" );
        while( ! sh.isEmpty() ){
            System.out.printf( "%s", sh.pop() );
        }//while

        System.out.printf( "\n\n\n" );


        System.out.printf("----- SEITE 11 -----");
        System.out.printf("\n\n");
        

        System.out.printf("final Map<String,Character> mapi = new TreeMap<String,Character>();\r\n"
                + "        map.put( \"Yoda\", 'Y' );\r\n"
                + "        map.put( \"Rey\", 'x' );\r\n"
                + "        map.put( \"Yoda\", 'o' );\r\n"
                + "        map.put( \"Aayla\", 'i' );\r\n"
                + "        map.put( \"Jabba\", 'o' );\r\n"
                + "        map.put( \"Rey\", 'k' );\r\n"
                + "        map.put( \"Aayla\", 'q' );\r\n"
                + "        map.put( \"Luke\", 's' );\r\n"
                + "        map.put( \"Yoda\", 'd' );\r\n"
                + "        map.put( \"Aayla\", 'K' );\r\n"
                + "        map.put( \"Yoda\", 'a' );\r\n"
                + "        System.out.printf( \"%%d : \", mapi.size() );\r\n"
                + "        for ( final String si : mapi.keySet() ){\r\n"
                + "            System.out.printf( \"%%c\", mapi.get( si ) );\r\n"
                + "        }//for = ");
        final Map<String,Character> mapi = new TreeMap<String,Character>();
        mapi.put( "Yoda", 'Y' );
        mapi.put( "Rey", 'x' );
        mapi.put( "Yoda", 'o' );
        mapi.put( "Aayla", 'i' );
        mapi.put( "Jabba", 'o' );
        mapi.put( "Rey", 'k' );
        mapi.put( "Aayla", 'q' );
        mapi.put( "Luke", 's' );
        mapi.put( "Yoda", 'd' );
        mapi.put( "Aayla", 'K' );
        mapi.put( "Yoda", 'a' );
        System.out.printf( "%d : ", mapi.size() );
        for ( final String si : mapi.keySet() ){
            System.out.printf( "%c", mapi.get( si ) );
        }//for


        System.out.printf( "\n\n\n" );


        System.out.printf("        final Set<String> setj = new TreeSet<String>();\r\n"
                + "        setj.add( \"a\" ); setj.add( \"b\" ); setj.add( \"c\" );\r\n"
                + "        setj.add( \"b\" ); setj.add( \"c\" ); setj.add( \"d\" );\r\n"
                + "        setj.add( \"c\" ); setj.add( \"d\" ); setj.add( \"e\" );\r\n"
                + "        for( String sj : setj ) System.out.printf( \"%%s \", sj );  = ");
        final Set<String> setj = new TreeSet<String>();
        setj.add( "a" ); setj.add( "b" ); setj.add( "c" );
        setj.add( "b" ); setj.add( "c" ); setj.add( "d" );
        setj.add( "c" ); setj.add( "d" ); setj.add( "e" );
        for( String sj : setj ) System.out.printf( "%s ", sj );

        System.out.printf( "\n\n\n" );


        System.out.printf("final Queue<String> queuek = new LinkedList<String>();\r\n"
                + "        for( String sk : new String[]{ \"Tri\", \"tra\", \"trullala\" }){\r\n"
                + "            queuek.offer( sk );\r\n"
                + "        }//for\r\n"
                + "        while( !queuek.isEmpty() ){\r\n"
                + "            System.out.printf( \"%%s \", queuek.poll() );\r\n"
                + "        }//while  = ");
        final Queue<String> queuek = new LinkedList<String>();
        for( String sk : new String[]{ "Tri", "tra", "trullala" }){
            queuek.offer( sk );
        }//for
        while( !queuek.isEmpty() ){
            System.out.printf( "%s ", queuek.poll() );
        }//while

        System.out.printf( "\n\n\n" );




        System.out.printf("----- SEITE 13 -----");
        System.out.printf("\n\n");
        

        System.out.printf("final Collection<Character> coll = new ArrayList<Character>();\r\n"
                + "        coll.add( 'P' );\r\n"
                + "        coll.add( 'O' );\r\n"
                + "        coll.add( 'N' );\r\n"
                + "        coll.add( 'M' );\r\n"
                + "        coll.add( 'L' );\r\n"
                + "        final Iterator<Character> i = coll.iterator();\r\n"
                + "        while( i.hasNext() ){\r\n"
                + "            final char c = i.next();\r\n"
                + "            System.out.printf( \"%%c \", c );\r\n"
                + "        }//while = ");
        final Collection<Character> coll = new ArrayList<Character>();
        coll.add( 'P' );
        coll.add( 'O' );
        coll.add( 'N' );
        coll.add( 'M' );
        coll.add( 'L' );
        final Iterator<Character> i = coll.iterator();
        while( i.hasNext() ){
            final char c = i.next();
            System.out.printf( "%c ", c );
        }//while

        System.out.printf( "\n\n\n" );




        System.out.printf("final Stack<String> sl = new Stack<String>();\r\n"
                + "        sl.push( \"U\" );\r\n"
                + "        sl.push( \"r\" );\r\n"
                + "        sl.push( \"m\" );\r\n"
                + "        sl.push( \"e\" );\r\n"
                + "        sl.push( \"l\" );\r\n"
                + "        System.out.printf(\r\n"
                + "                \"%%s \",\r\n"
                + "                sl.pop() + sl.pop() + sl.pop() + sl.pop() + sl.pop()\r\n"
                + "                ); = ");
        final Stack<String> sl = new Stack<String>();
        sl.push( "U" );
        sl.push( "r" );
        sl.push( "m" );
        sl.push( "e" );
        sl.push( "l" );
        System.out.printf(
                "%s ",
                sl.pop() + sl.pop() + sl.pop() + sl.pop() + sl.pop()
                );


        System.out.printf( "\n\n\n" );



        System.out.printf("----- SEITE 14 -----");
        System.out.printf("\n\n");
        

        System.out.printf("final Map<String,Integer> mapm = new TreeMap<String,Integer>();\r\n"
                + "        mapm.put( \"Luke\", 1 );\r\n"
                + "        mapm.put( \"Yoda\", 2 );\r\n"
                + "        mapm.put( \"Rey\", 3 );\r\n"
                + "        for ( final String sm : map.keySet() ){\r\n"
                + "            System.out.printf( \"%%d \", mapm.get( sm ) );\r\n"
                + "        }//for\r\n"
                + "        mapm.put( \"Aayla\", 4 );\r\n"
                + "        mapm.put( \"Luminara\", 5 );\r\n"
                + "        mapm.put( \"Luke\", 6 );\r\n"
                + "        for ( final String sm : mapm.keySet() ){\r\n"
                + "            System.out.printf( \"%%d \", mapm.get( sm ) );\r\n"
                + "        }//for = ");
        final Map<String,Integer> mapm = new TreeMap<String,Integer>();
        mapm.put( "Luke", 1 );
        mapm.put( "Yoda", 2 );
        mapm.put( "Rey", 3 );
        for ( final String sm : mapm.keySet() ){
            System.out.printf( "%d ", mapm.get( sm ) );
        }//for
        mapm.put( "Aayla", 4 );
        mapm.put( "Luminara", 5 );
        mapm.put( "Luke", 6 );
        for ( final String sm : mapm.keySet() ){
            System.out.printf( "%d ", mapm.get( sm ) );
        }//for

        System.out.printf( "\n\n\n" );




        System.out.printf("final List<Integer> listn = new ArrayList<Integer>();\r\n"
                + "        int sn = 0;\r\n"
                + "        do{\r\n"
                + "            listn.add( sn );\r\n"
                + "            sn = listn.size();\r\n"
                + "        }while( sn <= 3 );\r\n"
                + "        int in=sn;\r\n"
                + "        while( 0<in ) System.out.printf( \"%%d \", listn.get( --in )); = ");
        final List<Integer> listn = new ArrayList<Integer>();
        int sn = 0;
        do{
            listn.add( sn );
            sn = listn.size();
        }while( sn <= 3 );
        int in=sn;
        while( 0<in ) System.out.printf( "%d ", listn.get( --in ));


        System.out.printf( "\n\n\n" );



        System.out.printf("final List<Integer> listo = new ArrayList<Integer>();\r\n"
                + "        listo.add( 3 );\r\n"
                + "        listo.add( 5 );\r\n"
                + "        listo.add( 7 );\r\n"
                + "        listo.add( 11 );\r\n"
                + "        final ListIterator<Integer> lItero = listo.listIterator();\r\n"
                + "        while( lItero.hasNext() ) System.out.printf( \"%%d \", lItero.next());\r\n"
                + "        while( lItero.hasPrevious() ) System.out.printf( \"%%d \", lItero.previous()); = ");
        final List<Integer> listo = new ArrayList<Integer>();
        listo.add( 3 );
        listo.add( 5 );
        listo.add( 7 );
        listo.add( 11 );
        final ListIterator<Integer> lItero = listo.listIterator();
        while( lItero.hasNext() ) System.out.printf( "%d ", lItero.next());
        while( lItero.hasPrevious() ) System.out.printf( "%d ", lItero.previous());


        System.out.printf( "\n\n\n" );

        
        
        
        System.out.printf("----- SEITE 15 -----");
        System.out.printf("\n\n");
        


        System.out.printf("final Set<String> zoo = new HashSet<String>();\r\n"
                + "        zoo.add( \"Emu\" );\r\n"
                + "        zoo.add( \"Nandu\" );\r\n"
                + "        zoo.add( \"Gilatier\" );\r\n"
                + "        zoo.add( \"Kaiman\" );\r\n"
                + "        zoo.add( \"Kiwi\" );\r\n"
                + "        zoo.add( \"Kiwi\" );\r\n"
                + "        zoo.add( \"Kiwi\" );\r\n"
                + "        zoo.add( \"Gilatier\" );\r\n"
                + "        zoo.add( \"Nandu\" );\r\n"
                + "        zoo.add( \"Uhu\" );\r\n"
                + "        int n1 = zoo.size();\r\n"
                + "        boolean b1 = zoo.contains(\"Gilatier\" );\r\n"
                + "        zoo.remove(\"Gilatier\" );\r\n"
                + "        int n2 = zoo.size();\r\n"
                + "        boolean b2 = zoo.contains(\"Gilatier\" );\r\n"
                + "        System.out.printf(\r\n"
                + "                \"%%d ; %%s ; %%d ; %%s\",\r\n"
                + "                n1, b1, n2, b2\r\n"
                + "                ); = ");
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




        System.out.printf("for( char c : new char[]{ 'q', 'x', 'p' } ) System.out.printf( \"%%c \", c ); = ");
        for( char c : new char[]{ 'q', 'x', 'p' } ) System.out.printf( "%c ", c );


        System.out.printf( "\n\n\n" );




        System.out.printf("System.out.printf( \"  = \");\r\n"
                + "        final List<String> vmp = new ArrayList<String>();\r\n"
                + "        vm.add( \"Gurke\" );\r\n"
                + "        vm.add( \"Paprika\" );\r\n"
                + "        vm.add( \"Tomate\" );\r\n"
                + "        vm.add( \"Zucchini\" );\r\n"
                + "        final List<String> cmp = new ArrayList<String>();\r\n"
                + "        cm.add( \"rot\" );\r\n"
                + "        cm.add( \"gelb\" );\r\n"
                + "        cm.add( \"gruen\" );\r\n"
                + "        for( final String vp : vmp ){\r\n"
                + "            for( final String cp : cmp ){\r\n"
                + "                System.out.println( cp + \"e \" + vp );\r\n"
                + "            }//for\r\n"
                + "        }//for = \n");
        final List<String> vmp = new ArrayList<String>();
        vmp.add( "Gurke" );
        vmp.add( "Paprika" );
        vmp.add( "Tomate" );
        vmp.add( "Zucchini" );
        final List<String> cmp = new ArrayList<String>();
        cmp.add( "rot" );
        cmp.add( "gelb" );
        cmp.add( "gruen" );
        for( final String vp : vmp ){
            for( final String cp : cmp ){
                System.out.println( cp + "e " + vp );
            }//for
        }//for




        System.out.printf( "\n\n\n" );

        
        
        
        System.out.printf("----- SEITE 17 -----");
        System.out.printf("\n\n");
        

        System.out.printf("final Short[] array = { null, null, null, null };\r\n"
                + "        for( int iq=0; iq<4; ){\r\n"
                + "            array[iq] = (Short)( (short)( ++iq ));\r\n"
                + "        }//for\r\n"
                + "        int sum = 0;\r\n"
                + "        for( int iq=array.length; --iq>=0; ){\r\n"
                + "            sum += array[iq];\r\n"
                + "        }//for\r\n"
                + "        System.out.printf( \"%%d\", sum ); = ");
        final Short[] array = { null, null, null, null };
        for( int iq=0; iq<4; ){
            array[iq] = (Short)( (short)( ++iq ));
        }//for
        int sum = 0;
        for( int iq=array.length; --iq>=0; ){
            sum += array[iq];
        }//for
        System.out.printf( "%d", sum );

        System.out.printf( "\n\n\n" );



        System.out.printf("long z = 1;\r\n"
                + "        for( int stillToDo=1000; --stillToDo>=0; ){\r\n"
                + "            z *= 1000L;\r\n"
                + "        }//for\r\n"
                + "        for( int stillToDo=1000; --stillToDo>=0; ){\r\n"
                + "            z /= 1000L;\r\n"
                + "        }//for\r\n"
                + "        System.out.printf( \"z=%%d\\n\", z ); = ");
        long z = 1;
        for( int stillToDo=1000; --stillToDo>=0; ){
            z *= 1000L;
        }//for
        for( int stillToDo=1000; --stillToDo>=0; ){
            z /= 1000L;
        }//for
        System.out.printf( "z=%d\n", z );

        System.out.printf( "\n\n\n" );



        System.out.printf("final BigInteger tausend = new BigInteger( \"1000\" );\r\n"
                + "        BigInteger za = new BigInteger( \"1\" );\r\n"
                + "        for( int stillToDo=1000; --stillToDo>=0; ){\r\n"
                + "            za = za.multiply( tausend );\r\n"
                + "        }//for\r\n"
                + "        for( int stillToDo=1000; --stillToDo>=0; ){\r\n"
                + "            za = za.divide( tausend );\r\n"
                + "        }//for\r\n"
                + "        System.out.printf( \"z=%%s\\n\", z ); = ");
        final BigInteger tausend = new BigInteger( "1000" );
        BigInteger za = new BigInteger( "1" );
        for( int stillToDo=1000; --stillToDo>=0; ){
            za = za.multiply( tausend );
        }//for
        for( int stillToDo=1000; --stillToDo>=0; ){
            za = za.divide( tausend );
        }//for
        System.out.printf( "z=%s\n", z );


        System.out.printf( "\n\n\n" );




        System.out.printf("----- SEITE 20 -----");
        System.out.printf("\n\n");
        
        
        System.out.printf( "  = ");
        final Collection<Character> colla = new ArrayList<Character>();
        coll.add( 'P' );
        coll.add( 'O' );
        coll.add( 'N' );
        coll.add( 'M' );
        coll.add( 'L' );
        final Iterator<Character> ir = colla.iterator();
        while( ir.hasNext() ){
            final char c = ir.next();
            System.out.printf( "%c ", c );
        }//while

        System.out.printf( "\n\n\n" );





        System.out.printf("final Stack<String> sr = new Stack<String>();\r\n"
                + "        sr.push( \"U\" );\r\n"
                + "        sr.push( \"r\" );\r\n"
                + "        sr.push( \"m\" );\r\n"
                + "        sr.push( \"e\" );\r\n"
                + "        sr.push( \"l\" );\r\n"
                + "        System.out.printf(\r\n"
                + "                \"%%s \",\r\n"
                + "                sr.pop() + sr.pop() + sr.pop() + sr.pop() + sr.pop()\r\n"
                + "                ); = ");
        final Stack<String> sr = new Stack<String>();
        sr.push( "U" );
        sr.push( "r" );
        sr.push( "m" );
        sr.push( "e" );
        sr.push( "l" );
        System.out.printf(
                "%s ",
                sr.pop() + sr.pop() + sr.pop() + sr.pop() + sr.pop()
                );


        System.out.printf( "\n\n\n" );




        System.out.printf("----- SEITE 21 -----\n\n");
        System.out.printf("\n\n");
        


        System.out.printf("final Map<String,Integer> mapr = new TreeMap<String,Integer>();\r\n"
                + "        mapr.put( \"Luke\", 1 );\r\n"
                + "        mapr.put( \"Yoda\", 2 );\r\n"
                + "        mapr.put( \"Rey\", 3 );\r\n"
                + "        for ( final String st : mapr.keySet() ){\r\n"
                + "            System.out.printf( \"%%d \", mapr.get( st ) );\r\n"
                + "        }//for\r\n"
                + "        mapr.put( \"Aayla\", 4 );\r\n"
                + "        mapr.put( \"Luminara\", 5 );\r\n"
                + "        mapr.put( \"Luke\", 6 );\r\n"
                + "        for ( final String st : mapr.keySet() ){\r\n"
                + "            System.out.printf( \"%%d \", mapr.get( st ) );\r\n"
                + "        }//for = ");
        final Map<String,Integer> mapr = new TreeMap<String,Integer>();
        mapr.put( "Luke", 1 );
        mapr.put( "Yoda", 2 );
        mapr.put( "Rey", 3 );
        for ( final String st : mapr.keySet() ){
            System.out.printf( "%d ", mapr.get( st ) );
        }//for
        mapr.put( "Aayla", 4 );
        mapr.put( "Luminara", 5 );
        mapr.put( "Luke", 6 );
        for ( final String st : mapr.keySet() ){
            System.out.printf( "%d ", mapr.get( st ) );
        }//for

        System.out.printf( "\n\n\n" );


        System.out.printf("final List<Integer> listu = new ArrayList<Integer>();\r\n"
                + "        int su = 0;\r\n"
                + "        do{\r\n"
                + "            listu.add( su );\r\n"
                + "            su = listu.size();\r\n"
                + "        }while( su <= 3 );\r\n"
                + "        int iu=su;\r\n"
                + "        while( 0<iu ) System.out.printf( \"%%d \", listu.get( --iu )); = ");
        final List<Integer> listu = new ArrayList<Integer>();
        int su = 0;
        do{
            listu.add( su );
            su = listu.size();
        }while( su <= 3 );
        int iu=su;
        while( 0<iu ) System.out.printf( "%d ", listu.get( --iu ));

        System.out.printf( "\n\n\n" );



        System.out.printf("final List<Integer> listv = new ArrayList<Integer>();\r\n"
                + "        listv.add( 3 );\r\n"
                + "        listv.add( 5 );\r\n"
                + "        listv.add( 7 );\r\n"
                + "        listv.add( 11 );\r\n"
                + "        final ListIterator<Integer> lIterv = listv.listIterator();\r\n"
                + "        while( lIterv.hasNext() ) System.out.printf( \"%%d \", lIterv.next());\r\n"
                + "        while( lIterv.hasPrevious() ) System.out.printf( \"%%d \", lIterv.previous()); = ");
        final List<Integer> listv = new ArrayList<Integer>();
        listv.add( 3 );
        listv.add( 5 );
        listv.add( 7 );
        listv.add( 11 );
        final ListIterator<Integer> lIterv = listv.listIterator();
        while( lIterv.hasNext() ) System.out.printf( "%d ", lIterv.next());
        while( lIterv.hasPrevious() ) System.out.printf( "%d ", lIterv.previous());


        System.out.printf( "\n\n\n" );




        System.out.printf("----- SEITE 22 -----");
        System.out.printf("\n\n");
        

        System.out.printf("final Set<String> zoow = new HashSet<String>();\r\n"
                + "        zoo.add( \"Emu\" );\r\n"
                + "        zoo.add( \"Nandu\" );\r\n"
                + "        zoo.add( \"Gilatier\" );\r\n"
                + "        zoo.add( \"Kaiman\" );\r\n"
                + "        zoo.add( \"Kiwi\" );\r\n"
                + "        zoo.add( \"Kiwi\" );\r\n"
                + "        zoo.add( \"Kiwi\" );\r\n"
                + "        zoo.add( \"Gilatier\" );\r\n"
                + "        zoo.add( \"Nandu\" );\r\n"
                + "        zoo.add( \"Uhu\" );\r\n"
                + "        int n1w = zoow.size();\r\n"
                + "        boolean b1w = zoow.contains(\"Gilatier\" );\r\n"
                + "        zoo.remove(\"Gilatier\" );\r\n"
                + "        int n2w = zoow.size();\r\n"
                + "        boolean b2w = zoo.contains(\"Gilatier\" );\r\n"
                + "        System.out.printf(\r\n"
                + "                \"%%d ; %%s ; %%d ; %%s\",\r\n"
                + "                n1w, b1w, n2w, b2w\r\n"
                + "                ); = ");
        final Set<String> zoow = new HashSet<String>();
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
        int n1w = zoow.size();
        boolean b1w = zoow.contains("Gilatier" );
        zoo.remove("Gilatier" );
        int n2w = zoow.size();
        boolean b2w = zoo.contains("Gilatier" );
        System.out.printf(
                "%d ; %s ; %d ; %s",
                n1w, b1w, n2w, b2w
                );


        System.out.printf( "\n\n\n" );




        System.out.printf("----- SEITE 23 -----");
        System.out.printf("\n\n");
        

        System.out.printf("final List<String> vmt = new ArrayList<String>();\r\n"
                + "        vmt.add( \"Gurke\" );\r\n"
                + "        vmt.add( \"Paprika\" );\r\n"
                + "        vmt.add( \"Tomate\" );\r\n"
                + "        vmt.add( \"Zucchini\" );\r\n"
                + "        final List<String> cmt = new ArrayList<String>();\r\n"
                + "        cmt.add( \"rot\" );\r\n"
                + "        cmt.add( \"gelb\" );\r\n"
                + "        cmt.add( \"gruen\" );\r\n"
                + "        for( final String vt : vmt ){\r\n"
                + "            for( final String ct : cmt ){\r\n"
                + "                System.out.println( ct + \"e \" + vt );\r\n"
                + "            }//for\r\n"
                + "        }//for = ");
        final List<String> vmt = new ArrayList<String>();
        vmt.add( "Gurke" );
        vmt.add( "Paprika" );
        vmt.add( "Tomate" );
        vmt.add( "Zucchini" );
        final List<String> cmt = new ArrayList<String>();
        cmt.add( "rot" );
        cmt.add( "gelb" );
        cmt.add( "gruen" );
        for( final String vt : vmt ){
            for( final String ct : cmt ){
                System.out.println( ct + "e " + vt );
            }//for
        }//for

        System.out.printf( "\n\n\n" );




        System.out.printf("----- SEITE 24 -----");
        System.out.printf("\n\n");
        

        System.out.printf("final Short[] arrayc = { null, null, null, null };\r\n"
                + "        for( int ire=0; ire<4; ){\r\n"
                + "            arrayc[ire] = (Short)( (short)( ++ire ));\r\n"
                + "        }//for\r\n"
                + "        int sumre = 0;\r\n"
                + "        for( int ire=arrayc.length; --ire>=0; ){\r\n"
                + "            sumre += arrayc[ire];\r\n"
                + "        }//for\r\n"
                + "        System.out.printf( \"%%d\", sumre ); = ");
        final Short[] arrayc = { null, null, null, null };
        for( int ire=0; ire<4; ){
            arrayc[ire] = (Short)( (short)( ++ire ));
        }//for
        int sumre = 0;
        for( int ire=arrayc.length; --ire>=0; ){
            sumre += arrayc[ire];
        }//for
        System.out.printf( "%d", sumre );


        System.out.printf( "\n\n\n" );




        System.out.printf("long zre = 1;\r\n"
                + "        for( int stillToDo=1000; --stillToDo>=0; ){\r\n"
                + "            zre *= 1000L;\r\n"
                + "        }//for\r\n"
                + "        for( int stillToDo=1000; --stillToDo>=0; ){\r\n"
                + "            zre /= 1000L;\r\n"
                + "        }//for\r\n"
                + "        System.out.printf( \"z=%%d\\n\", zre ); = ");
        long zre = 1;
        for( int stillToDo=1000; --stillToDo>=0; ){
            zre *= 1000L;
        }//for
        for( int stillToDo=1000; --stillToDo>=0; ){
            zre /= 1000L;
        }//for
        System.out.printf( "z=%d\n", zre );


        System.out.printf( "\n\n\n" );




        System.out.printf("final BigInteger tausender = new BigInteger( \"1000\" );\r\n"
                + "        BigInteger zer = new BigInteger( \"1\" );\r\n"
                + "        for( int stillToDo=1000; --stillToDo>=0; ){\r\n"
                + "            zer = zer.multiply( tausender );\r\n"
                + "        }//for\r\n"
                + "        for( int stillToDo=1000; --stillToDo>=0; ){\r\n"
                + "            zer = zer.divide( tausender );\r\n"
                + "        }//for = ");
        final BigInteger tausender = new BigInteger( "1000" );
        BigInteger zer = new BigInteger( "1" );
        for( int stillToDo=1000; --stillToDo>=0; ){
            zer = zer.multiply( tausender );
        }//for
        for( int stillToDo=1000; --stillToDo>=0; ){
            zer = zer.divide( tausender );
        }//for
        System.out.printf( "z=%s\n", zer );


        System.out.printf( "\n\n\n" );




        System.out.printf("----- SEITE 25 -----");
        System.out.printf("\n\n");
        
        
        System.out.printf("final Collection<Character> coller = new ArrayList<Character>();\r\n"
                + "        coller.add( 'A' );\r\n"
                + "        coller.add( 'B' );\r\n"
                + "        coller.add( 'C' );\r\n"
                + "        coller.add( 'D' );\r\n"
                + "        coller.add( 'E' );\r\n"
                + "        final Iterator<Character> ier = coll.iterator();\r\n"
                + "        while( ier.hasNext() ){\r\n"
                + "            final char cer = ier.next();\r\n"
                + "            System.out.printf( \"%%c \", cer );\r\n"
                + "        }//while = ");
        final Collection<Character> coller = new ArrayList<Character>();
        coller.add( 'A' );
        coller.add( 'B' );
        coller.add( 'C' );
        coller.add( 'D' );
        coller.add( 'E' );
        final Iterator<Character> ier = coll.iterator();
        while( ier.hasNext() ){
            final char cer = ier.next();
            System.out.printf( "%c ", cer );
        }//while



        System.out.printf( "\n\n\n" );


        System.out.printf("final Stack<String> shz = new Stack<String>();\r\n"
                + "        shz.push( \"1\" );\r\n"
                + "        shz.push( \"2\" );\r\n"
                + "        shz.push( \"3\" );\r\n"
                + "        shz.push( \"4\" );\r\n"
                + "        shz.push( \"5\" );\r\n"
                + "        System.out.printf(\r\n"
                + "                \"%%s \",\r\n"
                + "                shz.pop() + shz.pop() + shz.pop() + shz.pop() + shz.pop()\r\n"
                + "                ); = ");
        final Stack<String> shz = new Stack<String>();
        shz.push( "1" );
        shz.push( "2" );
        shz.push( "3" );
        shz.push( "4" );
        shz.push( "5" );
        System.out.printf(
                "%s ",
                shz.pop() + shz.pop() + shz.pop() + shz.pop() + shz.pop()
                );


        System.out.printf( "\n\n\n" );




        System.out.printf("----- SEITE 26 -----");
        System.out.printf("\n\n");
        

        System.out.printf("final Map<String,Integer> maptz = new TreeMap<String,Integer>();\r\n"
                + "        maptz.put( \"Luke\", 1 );\r\n"
                + "        maptz.put( \"Yoda\", 2 );\r\n"
                + "        maptz.put( \"Rey\", 3 );\r\n"
                + "        for ( final String stz : maptz.keySet() ){\r\n"
                + "            System.out.printf( \"%%d \", maptz.get( stz ) );\r\n"
                + "        }//for\r\n"
                + "        maptz.put( \"Aayla\", 4 );\r\n"
                + "        maptz.put( \"Yoda\", 5 );\r\n"
                + "        maptz.put( \"Luminara\", 6 );\r\n"
                + "        for ( final String stz : maptz.keySet() ){\r\n"
                + "            System.out.printf( \"%%d \", maptz.get( stz ) );\r\n"
                + "        }// = ");
        final Map<String,Integer> maptz = new TreeMap<String,Integer>();
        maptz.put( "Luke", 1 );
        maptz.put( "Yoda", 2 );
        maptz.put( "Rey", 3 );
        for ( final String stz : maptz.keySet() ){
            System.out.printf( "%d ", maptz.get( stz ) );
        }//for
        maptz.put( "Aayla", 4 );
        maptz.put( "Yoda", 5 );
        maptz.put( "Luminara", 6 );
        for ( final String stz : maptz.keySet() ){
            System.out.printf( "%d ", maptz.get( stz ) );
        }//

        System.out.printf( "\n\n\n" );




        System.out.printf("final List<Integer> listhn = new ArrayList<Integer>();\r\n"
                + "        int shn = 0;\r\n"
                + "        do{\r\n"
                + "            listhn.add( shn );\r\n"
                + "            shn = listhn.size();\r\n"
                + "        }while( shn < 4 );\r\n"
                + "        int ihn=shn;\r\n"
                + "        while( 0<ihn ) System.out.printf( \"%%d \", listhn.get( --ihn )); = ");
        final List<Integer> listhn = new ArrayList<Integer>();
        int shn = 0;
        do{
            listhn.add( shn );
            shn = listhn.size();
        }while( shn < 4 );
        int ihn=shn;
        while( 0<ihn ) System.out.printf( "%d ", listhn.get( --ihn ));

        System.out.printf( "\n\n\n" );




        System.out.printf("final List<Integer> listmj = new ArrayList<Integer>();\r\n"
                + "        listmj.add( 2 );\r\n"
                + "        listmj.add( 3 );\r\n"
                + "        listmj.add( 5 );\r\n"
                + "        listmj.add( 7 );\r\n"
                + "        final ListIterator<Integer> lItermj = listmj.listIterator();\r\n"
                + "        while( lItermj.hasNext() ) System.out.printf( \"%%d \", lItermj.next());\r\n"
                + "        while( lItermj.hasPrevious() ) System.out.printf( \"%%d \", lItermj.previous()); = ");
        final List<Integer> listmj = new ArrayList<Integer>();
        listmj.add( 2 );
        listmj.add( 3 );
        listmj.add( 5 );
        listmj.add( 7 );
        final ListIterator<Integer> lItermj = listmj.listIterator();
        while( lItermj.hasNext() ) System.out.printf( "%d ", lItermj.next());
        while( lItermj.hasPrevious() ) System.out.printf( "%d ", lItermj.previous());


        System.out.printf( "\n\n\n" );




        System.out.printf("----- SEITE 27 -----");
        System.out.printf("\n\n");
        


        System.out.printf("final Set<String> zoomj = new HashSet<String>();\r\n"
                + "        zoomj.add( \"Emu\" );\r\n"
                + "        zoomj.add( \"Nandu\" );\r\n"
                + "        zoomj.add( \"Gilatier\" );\r\n"
                + "        zoomj.add( \"Kaiman\" );\r\n"
                + "        zoomj.add( \"Kiwi\" );\r\n"
                + "        zoomj.add( \"Kiwi\" );\r\n"
                + "        zoomj.add( \"Kiwi\" );\r\n"
                + "        zoomj.add( \"Gilatier\" );\r\n"
                + "        zoomj.add( \"Nandu\" );\r\n"
                + "        zoomj.add( \"Uhu\" );\r\n"
                + "        int n1mj = zoomj.size();\r\n"
                + "        boolean b1mj = zoomj.contains(\"Gilatier\" );\r\n"
                + "        zoomj.remove(\"Gilatier\" );\r\n"
                + "        int n2mj = zoomj.size();\r\n"
                + "        boolean b2mj = zoomj.contains(\"Gilatier\" );\r\n"
                + "        System.out.printf(\r\n"
                + "                \"%%d ; %%s ; %%d ; %%s\",\r\n"
                + "                n1mj, b1mj, n2mj, b2mj\r\n"
                + "                ); = ");
        final Set<String> zoomj = new HashSet<String>();
        zoomj.add( "Emu" );
        zoomj.add( "Nandu" );
        zoomj.add( "Gilatier" );
        zoomj.add( "Kaiman" );
        zoomj.add( "Kiwi" );
        zoomj.add( "Kiwi" );
        zoomj.add( "Kiwi" );
        zoomj.add( "Gilatier" );
        zoomj.add( "Nandu" );
        zoomj.add( "Uhu" );
        int n1mj = zoomj.size();
        boolean b1mj = zoomj.contains("Gilatier" );
        zoomj.remove("Gilatier" );
        int n2mj = zoomj.size();
        boolean b2mj = zoomj.contains("Gilatier" );
        System.out.printf(
                "%d ; %s ; %d ; %s",
                n1mj, b1mj, n2mj, b2mj
                );


        System.out.printf( "\n\n\n" );




        System.out.printf(" for( char c : new char[]{ 'x', 'y', 'z' } ) System.out.printf( \"%%c \", c ); = ");
        for( char c : new char[]{ 'x', 'y', 'z' } ) System.out.printf( "%c ", c );

        System.out.printf( "\n\n\n" );



        System.out.printf("----- SEITE 28 -----");
        System.out.printf("\n\n");
        
        
        System.out.printf("final List<String> vmjh = new ArrayList<String>();\r\n"
                + "        vmjh.add( \"Zucchini\" );\r\n"
                + "        vmjh.add( \"Tomate\" );\r\n"
                + "        vmjh.add( \"Paprika\" );\r\n"
                + "        vmjh.add( \"Gurke\" );\r\n"
                + "        final List<String> cmjh = new ArrayList<String>();\r\n"
                + "        cmjh.add( \"gelb\" );\r\n"
                + "        cmjh.add( \"gruen\" );\r\n"
                + "        cmjh.add( \"rot\" );\r\n"
                + "        for( final String vjh : vmjh ){\r\n"
                + "            for( final String cjh : cmjh ){\r\n"
                + "                System.out.println( cjh + \"e \" + vjh );\r\n"
                + "            }/ = ");
        final List<String> vmjh = new ArrayList<String>();
        vmjh.add( "Zucchini" );
        vmjh.add( "Tomate" );
        vmjh.add( "Paprika" );
        vmjh.add( "Gurke" );
        final List<String> cmjh = new ArrayList<String>();
        cmjh.add( "gelb" );
        cmjh.add( "gruen" );
        cmjh.add( "rot" );
        for( final String vjh : vmjh ){
            for( final String cjh : cmjh ){
                System.out.println( cjh + "e " + vjh );
            }//for
        }//for


        System.out.printf( "\n\n\n" );




        System.out.printf("----- SEITE 29 -----");
        System.out.printf("\n\n");
        

        System.out.printf("final Short[] arraygf = { null, null, null, null };\r\n"
                + "        for( int igf=0; igf<4; ){\r\n"
                + "            arraygf[igf] = (Short)( (short)( ++igf ));\r\n"
                + "        }//for\r\n"
                + "        int sumgf = 0;\r\n"
                + "        for( int igf=arraygf.length; --igf>=0; ){\r\n"
                + "            sumgf += arraygf[igf];\r\n"
                + "        }//for\r\n"
                + "        System.out.printf( \"%%d\", sumgf ); = ");
        final Short[] arraygf = { null, null, null, null };
        for( int igf=0; igf<4; ){
            arraygf[igf] = (Short)( (short)( ++igf ));
        }//for
        int sumgf = 0;
        for( int igf=arraygf.length; --igf>=0; ){
            sumgf += arraygf[igf];
        }//for
        System.out.printf( "%d", sumgf );


        System.out.printf( "\n\n\n" );




        System.out.printf("long zkj = 1;\r\n"
                + "        for( int stillToDo=1000; --stillToDo>=0; ){\r\n"
                + "            zkj *= 1000L;\r\n"
                + "        }//for\r\n"
                + "        for( int stillToDo=1000; --stillToDo>=0; ){\r\n"
                + "            zkj /= 1000L;\r\n"
                + "        }//for\r\n"
                + "        System.out.printf( \"z=%%d\\n\", zkj ); = ");
        long zkj = 1;
        for( int stillToDo=1000; --stillToDo>=0; ){
            zkj *= 1000L;
        }//for
        for( int stillToDo=1000; --stillToDo>=0; ){
            zkj /= 1000L;
        }//for
        System.out.printf( "z=%d\n", zkj );

        System.out.printf( "\n\n\n" );




        System.out.printf("final BigInteger tausendlk = new BigInteger( \"1000\" );\r\n"
                + "        BigInteger zlk = new BigInteger( \"1\" );\r\n"
                + "        for( int stillToDo=1000; --stillToDo>=0; ){\r\n"
                + "            zlk = zlk.multiply( tausend );\r\n"
                + "        }//for\r\n"
                + "        for( int stillToDo=1000; --stillToDo>=0; ){\r\n"
                + "            zlk = zlk.divide( tausendlk );\r\n"
                + "        }//for\r\n"
                + "        System.out.printf( \"zlk=%%s\\n\", zlk ); = ");
        final BigInteger tausendlk = new BigInteger( "1000" );
        BigInteger zlk = new BigInteger( "1" );
        for( int stillToDo=1000; --stillToDo>=0; ){
            zlk = zlk.multiply( tausend );
        }//for
        for( int stillToDo=1000; --stillToDo>=0; ){
            zlk = zlk.divide( tausendlk );
        }//for
        System.out.printf( "zlk=%s\n", zlk );

        System.out.printf( "\n\n\n" );




        System.out.printf("----- SEITE 31 -----");
        System.out.printf("\n\n");
        



        System.out.printf("final Collection<String> c = new ArrayList<String>();\r\n"
                + "        c.add( \"a\" );\r\n"
                + "        c.add( \"b\" );\r\n"
                + "        c.add( \"c\" );\r\n"
                + "        c.add( \"d\" );\r\n"
                + "        c.add( \"e\" );\r\n"
                + "        final Iterator<String> ilk = c.iterator();\r\n"
                + "        while( ilk.hasNext() ){\r\n"
                + "            final String slk = ilk.next();\r\n"
                + "            System.out.printf( \"%%s \", slk );\r\n"
                + "        }//while = ");
        final Collection<String> c = new ArrayList<String>();
        c.add( "a" );
        c.add( "b" );
        c.add( "c" );
        c.add( "d" );
        c.add( "e" );
        final Iterator<String> ilk = c.iterator();
        while( ilk.hasNext() ){
            final String slk = ilk.next();
            System.out.printf( "%s ", slk );
        }//while

        System.out.printf( "\n\n\n" );



        System.out.printf("final Queue<String> qlk = new LinkedList<String>();\r\n"
                + "        qlk.offer( \"1\" );\r\n"
                + "        qlk.offer( \"2\" );\r\n"
                + "        qlk.offer( \"3\" );\r\n"
                + "        qlk.offer( \"4\" );\r\n"
                + "        qlk.offer( \"5\" );\r\n"
                + "        System.out.printf(\r\n"
                + "                \"%%s \",\r\n"
                + "                qlk.poll() + qlk.poll() + qlk.poll() + qlk.poll() + qlk.poll()\r\n"
                + "                ); = ");
        final Queue<String> qlk = new LinkedList<String>();
        qlk.offer( "1" );
        qlk.offer( "2" );
        qlk.offer( "3" );
        qlk.offer( "4" );
        qlk.offer( "5" );
        System.out.printf(
                "%s ",
                qlk.poll() + qlk.poll() + qlk.poll() + qlk.poll() + qlk.poll()
                );

        System.out.printf( "\n\n\n" );




        System.out.printf("----- SEITE 32 -----");
        System.out.printf("\n\n");
        
        

        System.out.printf("final Map<Character,Integer> mapiu = new TreeMap<Character,Integer>();\r\n"
                + "        mapiu.put( 'c', 1 );\r\n"
                + "        mapiu.put( 'b', 2 );\r\n"
                + "        mapiu.put( 'a', 3 );\r\n"
                + "        for ( final Character ciu : mapiu.keySet() ){\r\n"
                + "            System.out.printf( \"%%d \", mapiu.get( ciu ) );\r\n"
                + "        }//for\r\n"
                + "        mapiu.put( 'b', 4 );\r\n"
                + "        mapiu.put( 'd', 5 );\r\n"
                + "        for ( final Character ciu : mapiu.keySet() ){\r\n"
                + "            System.out.printf( \"%%d \", mapiu.get( ciu ) );\r\n"
                + "        }//for = ");
        final Map<Character,Integer> mapiu = new TreeMap<Character,Integer>();
        mapiu.put( 'c', 1 );
        mapiu.put( 'b', 2 );
        mapiu.put( 'a', 3 );
        for ( final Character ciu : mapiu.keySet() ){
            System.out.printf( "%d ", mapiu.get( ciu ) );
        }//for
        mapiu.put( 'b', 4 );
        mapiu.put( 'd', 5 );
        for ( final Character ciu : mapiu.keySet() ){
            System.out.printf( "%d ", mapiu.get( ciu ) );
        }//for

        System.out.printf( "\n\n\n" );


        
        
        System.out.printf("----- SEITE 33 -----");
        System.out.printf("\n\n");
        
        

        System.out.printf("for( int ing : new int[]{ 1, 2, 3, 4 } ) System.out.printf( \"%%x \", ing ); = ");
        for( int ing : new int[]{ 1, 2, 3, 4 } ) System.out.printf( "%x ", ing );


        System.out.printf("----- SEITE 34 -----");
        System.out.printf("\n\n");
        
        
        
        System.out.printf("final Set<String> zoong = new HashSet<String>();\r\n"
                + "        zoong.add( \"Elefant\" );\r\n"
                + "        zoong.add( \"Zebra\" );\r\n"
                + "        zoong.add( \"Affe\" );\r\n"
                + "        zoong.add( \"Zebra\" );\r\n"
                + "        zoong.add( \"Bär\" );\r\n"
                + "        int n1ng = zoong.size();\r\n"
                + "        boolean b1ng = zoong.contains(\"Affe\" );\r\n"
                + "        zoong.remove(\"Affe\" );\r\n"
                + "        int n2ng = zoong.size();\r\n"
                + "        boolean b2ng = zoong.contains(\"Affe\" );\r\n"
                + "        System.out.printf(\r\n"
                + "                \"%%d ; %%s ; %%d ; %%s\",\r\n"
                + "                n1ng, b1ng, n2ng, b2ng\r\n"
                + "                ); = ");
        final Set<String> zoong = new HashSet<String>();
        zoong.add( "Elefant" );
        zoong.add( "Zebra" );
        zoong.add( "Affe" );
        zoong.add( "Zebra" );
        zoong.add( "Bär" );
        int n1ng = zoong.size();
        boolean b1ng = zoong.contains("Affe" );
        zoong.remove("Affe" );
        int n2ng = zoong.size();
        boolean b2ng = zoong.contains("Affe" );
        System.out.printf(
                "%d ; %s ; %d ; %s",
                n1ng, b1ng, n2ng, b2ng
                );


        System.out.printf( "\n\n\n" );


        System.out.printf("final List<String> vmpo = new ArrayList<String>();\r\n"
                + "        vmpo.add( \"Gurke\" );\r\n"
                + "        vmpo.add( \"Paprika\" );\r\n"
                + "        vmpo.add( \"Tomate\" );\r\n"
                + "        vmpo.add( \"Zucchini\" );\r\n"
                + "        final List<String> cmpo = new ArrayList<String>();\r\n"
                + "        cmpo.add( \"rot\" );\r\n"
                + "        cmpo.add( \"gelb\" );\r\n"
                + "        cmpo.add( \"gruen\" );\r\n"
                + "        for( final String vpo : vmpo ){\r\n"
                + "            for( final String cpo : cmpo ){\r\n"
                + "                System.out.println( cpo + \"e \" + vpo );\r\n"
                + "            }//for\r\n"
                + "        }//for = ");
        final List<String> vmpo = new ArrayList<String>();
        vmpo.add( "Gurke" );
        vmpo.add( "Paprika" );
        vmpo.add( "Tomate" );
        vmpo.add( "Zucchini" );
        final List<String> cmpo = new ArrayList<String>();
        cmpo.add( "rot" );
        cmpo.add( "gelb" );
        cmpo.add( "gruen" );
        for( final String vpo : vmpo ){
            for( final String cpo : cmpo ){
                System.out.println( cpo + "e " + vpo );
            }//for
        }//for

        System.out.printf( "\n\n\n" );



        System.out.printf("----- SEITE 37 -----");
        System.out.printf("\n\n");
        
        
        
        System.out.printf("final Queue<Integer> queuepo = new LinkedList<Integer>();\r\n"
                + "        int npo=1;\r\n"
                + "        for ( int ipo=0; ipo<3; ipo++ ){ queuepo.add( npo++ ); }\r\n"
                + "        for ( int ipo=0; ipo<2; ipo++ ){ System.out.printf( \"%%d \", queuepo.remove() ); }\r\n"
                + "        for ( int ipo=0; ipo<2; ipo++ ){ queuepo.add( npo++ ); }\r\n"
                + "        for ( int ipo=0; ipo<3; ipo++ ){ System.out.printf( \"%%d \", queuepo.remove() ); } = ");
        final Queue<Integer> queuepo = new LinkedList<Integer>();
        int npo=1;
        for ( int ipo=0; ipo<3; ipo++ ){ queuepo.add( npo++ ); }
        for ( int ipo=0; ipo<2; ipo++ ){ System.out.printf( "%d ", queuepo.remove() ); }
        for ( int ipo=0; ipo<2; ipo++ ){ queuepo.add( npo++ ); }
        for ( int ipo=0; ipo<3; ipo++ ){ System.out.printf( "%d ", queuepo.remove() ); }


        System.out.printf( "\n\n\n" );


        
        
        System.out.printf("final Stack<Integer> stackqw = new Stack<Integer>();\r\n"
                + "        int nqw=1;\r\n"
                + "        for ( int iqw=0; iqw<3; iqw++ ){ stackqw.push( nqw++ ); }\r\n"
                + "        for ( int iqw=0; iqw<2; iqw++ ){ System.out.printf( \"%%d \", stackqw.pop() ); }\r\n"
                + "        for ( int iqw=0; iqw<2; iqw++ ){ stackqw.push( nqw++ ); }\r\n"
                + "        for ( int iqw=0; iqw<3; iqw++ ){ System.out.printf( \"%%d \", stackqw.pop() ); } = ");
        final Stack<Integer> stackqw = new Stack<Integer>();
        int nqw=1;
        for ( int iqw=0; iqw<3; iqw++ ){ stackqw.push( nqw++ ); }
        for ( int iqw=0; iqw<2; iqw++ ){ System.out.printf( "%d ", stackqw.pop() ); }
        for ( int iqw=0; iqw<2; iqw++ ){ stackqw.push( nqw++ ); }
        for ( int iqw=0; iqw<3; iqw++ ){ System.out.printf( "%d ", stackqw.pop() ); }

        System.out.printf( "\n\n\n" );

        


        System.out.printf("final Map<Character,Integer> mapmu = new TreeMap<Character,Integer>();\r\n"
                + "        mapmu.put( 'b', 1 );\r\n"
                + "        mapmu.put( 'c', 2 );\r\n"
                + "        mapmu.put( 'a', 3 );\r\n"
                + "        for ( final Character cmu : mapmu.keySet() ){\r\n"
                + "            System.out.printf( \"%%d \", mapmu.get( cmu ) );\r\n"
                + "        }//for\r\n"
                + "        mapmu.put( 'd', 4 );\r\n"
                + "        mapmu.put( 'b', 5 );\r\n"
                + "        for ( final Character cmu : mapmu.keySet() ){\r\n"
                + "            System.out.printf( \"%%d \", mapmu.get( cmu ) );\r\n"
                + "        }//for = ");
        final Map<Character,Integer> mapmu = new TreeMap<Character,Integer>();
        mapmu.put( 'b', 1 );
        mapmu.put( 'c', 2 );
        mapmu.put( 'a', 3 );
        for ( final Character cmu : mapmu.keySet() ){
            System.out.printf( "%d ", mapmu.get( cmu ) );
        }//for
        mapmu.put( 'd', 4 );
        mapmu.put( 'b', 5 );
        for ( final Character cmu : mapmu.keySet() ){
            System.out.printf( "%d ", mapmu.get( cmu ) );
        }//for

        System.out.printf( "\n\n\n" );




        System.out.printf("for( char cnz : new char[]{ 'q', 'x', 'p' } ) System.out.printf( \"%%c \", cnz ); = ");
        for( char cnz : new char[]{ 'q', 'x', 'p' } ) System.out.printf( "%c ", cnz );

    }//method
}//class
