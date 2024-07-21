package CodeFragmente;

public class CodeFragmente {

    public static void main(String[] args) {



        System.out.printf("----- SEITE 1 -----");

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



        final Stack<String> s = new Stack<String>();
        s.push( "a" );
        s.push( "b" );
        s.push( "c" );
        s.push( "d" );
        s.push( "e" );
        while( ! s.isEmpty() ){
            System.out.printf( "%s", s.pop() );
        }//whil
        
        
        System.out.printf( "\n\n\n");
        
        
        
        
        System.out.printf("----- SEITE 2 -----");

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
        for ( final String s : map.keySet() ){
            System.out.printf( "%c ", map.get( s ) );
        }//for

        
        System.out.printf( "\n\n\n" );
        
        
        for( char c : new char[]{'a', 'w', 'u' }) {
            System.out.printf( "%c ", c ); }
        
        
        System.out.printf( "\n\n\n" );




        System.out.printf("----- SEITE 6 -----");


        final List<Character> list = new ArrayList<Character>();
        list.add('l'); list.add('a'); list.add(',');
        list.add('l'); list.add('i'); list.add(',');
        list.add('l'); list.add('u'); list.add('.');
        final Iterator<Character> iter = list.iterator();
        while( iter.hasNext() ){
            final Character c = iter.next();
            System.out.printf( "%c", c );
        }//while



        System.out.printf( "\n\n\n" );





        final Integer[] ia = { 7, 3, 5, 2 };
        final List<Integer> list = Arrays.asList( ia );
        final Iterator<Integer> iter = list.iterator();
        while( iter.hasNext() ){
            final Integer i = iter.next();
            if( iter.hasNext() ) iter.next();
            System.out.printf( "%d ", i );
        }//while


        System.out.printf( "\n\n\n" );





        System.out.printf("----- SEITE 7 -----");

        final Stack<String> s = new Stack<String>();
        s.push( "x" );
        s.push( "p" );
        s.push( "o" );
        s.push( "q" );
        s.push( "x" );
        while( ! s.isEmpty() ){
            System.out.printf( "%s", s.pop() );
        }//while


        System.out.printf( "\n\n\n" );





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


        final Map<String,Character> map = new TreeMap<String,Character>();
        map.put( "Papaya", 'a' );
        map.put( "Ananas", 'b' );
        map.put( "Ananas", 'c' );
        map.put( "Mango", 'd' );
        map.put( "Orange", 'e' );
        map.put( "Mango", 'f' );
        map.put( "Orange", 'g' );
        map.put( "Mango", 'h' );
        map.put( "Papaya", 'o' ); // "Sprung", also 'o' statt 'i', damit Buschtaben leichter unterscheidbar
        map.put( "Zitrone", 'p' );
        map.put( "Orange", 'q' );
        System.out.printf( "%d : ", map.size() );
        for ( final String s : map.keySet() ){
            System.out.printf( "%c", map.get( s ) );
        }//for



        System.out.printf( "\n\n\n" );




        final Set<String> set = new TreeSet<String>();
        set.add( "v" ); set.add( "w" ); set.add( "x" );
        set.add( "w" ); set.add( "x" ); set.add( "y" );
        set.add( "x" ); set.add( "y" ); set.add( "z" );
        for( String s : set ) System.out.printf( "%s ", s );



        System.out.printf( "\n\n\n" );





        final Queue<String> queue = new LinkedList<String>();
        for( final String s : new String[]{ "Merkur","Venus","Mars","Venus","Pluto"
        }){
            queue.offer( s );
        }//for
        while( !queue.isEmpty() ){
            System.out.printf( "%s ", queue.poll() );
        }//while


        System.out.printf( "\n\n\n" );






        System.out.printf("----- SEITE 10 -----");

        final List<Character> list = new ArrayList<Character>();
        list.add('B'); list.add('l'); list.add('a'); list.add(',');
        list.add('b'); list.add('l'); list.add('a'); list.add(',');
        list.add('b'); list.add('l'); list.add('a'); list.add('.');
        final Iterator<Character> iter = list.iterator();
        while( iter.hasNext() ){
            final Character c = iter.next();
            System.out.printf( "%c", c );
        }//while


        System.out.printf( "\n\n\n" );





        final Stack<String> s = new Stack<String>();
        s.push( "x" );
        s.push( "p" );
        s.push( "q" );
        s.push( "x" );
        s.push( "o" );
        while( ! s.isEmpty() ){
            System.out.printf( "%s", s.pop() );
        }//while



        System.out.printf( "\n\n\n" );





        System.out.printf("----- SEITE 11 -----");


        final Map<String,Character> map = new TreeMap<String,Character>();
        map.put( "Yoda", 'Y' );
        map.put( "Rey", 'x' );
        map.put( "Yoda", 'o' );
        map.put( "Aayla", 'i' );
        map.put( "Jabba", 'o' );
        map.put( "Rey", 'k' );
        map.put( "Aayla", 'q' );
        map.put( "Luke", 's' );
        map.put( "Yoda", 'd' );
        map.put( "Aayla", 'K' );
        map.put( "Yoda", 'a' );
        System.out.printf( "%d : ", map.size() );
        for ( final String s : map.keySet() ){
            System.out.printf( "%c", map.get( s ) );
        }//for


        System.out.printf( "\n\n\n" );





        final Set<String> set = new TreeSet<String>();
        set.add( "a" ); set.add( "b" ); set.add( "c" );
        set.add( "b" ); set.add( "c" ); set.add( "d" );
        set.add( "c" ); set.add( "d" ); set.add( "e" );
        for( String s : set ) System.out.printf( "%s ", s );



        System.out.printf( "\n\n\n" );





        final Queue<String> queue = new LinkedList<String>();
        for( String s : new String[]{ "Tri", "tra", "trullala" }){
            queue.offer( s );
        }//for
        while( !queue.isEmpty() ){
            System.out.printf( "%s ", queue.poll() );
        }//while



        System.out.printf( "\n\n\n" );





        System.out.printf("----- SEITE 12 -----");


        (a) Vereinfachen Sie den Methoden-Rumpf:
            public boolean isStateOk(){
            if( false != checkState() ){
                return false;
            }else if( true != checkState() ){
                return true;
            }//if
            return false;
        }//method()


        System.out.printf( "\n\n\n" );





        (b) Vereinfachen Sie den Methoden-Rumpf:
            public int compute( int a, int b ){
            for( int i=0; i<b; i++ ){
                a+=3;
            }//for
            return a;
        }//method()


        System.out.printf( "\n\n\n" );





        (c) Der enum Fruit sei wie beschrieben gegeben. Vereinfachen Sie den Methoden-Rumpf:
            enum Fruit { APPLE, LEMON, ORANGE }
        ...
        public boolean testFruit( Fruit f1, Fruit f2 ){
            if( f1 == Fruit.ORANGE ){
                if( f2 == Fruit.APPLE || f2 == Fruit.LEMON ) return true;
                else if( f2 == Fruit.ORANGE ) return false;
            }else if( f1 == Fruit.APPLE ){
                if( f2 == Fruit.ORANGE ) return true;
                if( f2 == Fruit.LEMON ) return true;
                if( f2 == Fruit.APPLE ) return false;
            }else if( f1 == Fruit.LEMON ){
                if( f2 == Fruit.APPLE || f2 == Fruit.ORANGE ) return true;
                else if( f2 == Fruit.LEMON ) return false;
            }//if
            return false;
        }//method()


        System.out.printf( "\n\n\n" );





        System.out.printf("----- SEITE 13 -----");

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





        final Stack<String> s = new Stack<String>();
        s.push( "U" );
        s.push( "r" );
        s.push( "m" );
        s.push( "e" );
        s.push( "l" );
        System.out.printf(
                "%s ",
                s.pop() + s.pop() + s.pop() + s.pop() + s.pop()
                );


        System.out.printf( "\n\n\n" );





        System.out.printf("----- SEITE 14 -----");

        final Map<String,Integer> map = new TreeMap<String,Integer>();
        map.put( "Luke", 1 );
        map.put( "Yoda", 2 );
        map.put( "Rey", 3 );
        for ( final String s : map.keySet() ){
            System.out.printf( "%d ", map.get( s ) );
        }//for
        map.put( "Aayla", 4 );
        map.put( "Luminara", 5 );
        map.put( "Luke", 6 );
        for ( final String s : map.keySet() ){
            System.out.printf( "%d ", map.get( s ) );
        }//for


        System.out.printf( "\n\n\n" );





        final List<Integer> list = new ArrayList<Integer>();
        int s = 0;
        do{
            list.add( s );
            s = list.size();
        }while( s <= 3 );
        int i=s;
        while( 0<i ) System.out.printf( "%d ", list.get( --i ));


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




        System.out.printf("----- SEITE 15 -----");


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




        public int magic( int p ){
            int x = 0;
            int y = p;
            do{
                x++;
                --y;
            }while( x<y );
            return x;
        }//method()

        System.out.printf( "%d", magic( 4 ) );


        System.out.printf( "\n\n\n" );






        for( char c : new char[]{ 'q', 'x', 'p' } ) System.out.printf( "%c ", c );


        System.out.printf( "\n\n\n" );






        System.out.printf("----- SEITE 16 -----");


        public int magic( int p ){
            Map<Long,String> map = null;
            for( int stillToDo=p; --stillToDo>=0; ){
                map = new HashMap<Long,String>();
                Long k = null;
                do{
                    k = (long)( Long.MAX_VALUE * Math.random() );
                }while( map.containsKey(k) );
                map.put( k, new Long( k ).toString() );
            }//for
            return map.size();
        }//method()

        System.out.printf( "%d", magic( 4 ) );



        System.out.printf( "\n\n\n" );






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





        System.out.printf("----- SEITE 17 -----");

        final Short[] array = { null, null, null, null };
        for( int i=0; i<4; ){
            array[i] = (Short)( (short)( ++i ));
        }//for
        int sum = 0;
        for( int i=array.length; --i>=0; ){
            sum += array[i];
        }//for
        System.out.printf( "%d", sum );



        System.out.printf( "\n\n\n" );





        long z = 1;
        for( int stillToDo=1000; --stillToDo>=0; ){
            z *= 1000L;
        }//for
        for( int stillToDo=1000; --stillToDo>=0; ){
            z /= 1000L;
        }//for
        System.out.printf( "z=%d\n", z );



        System.out.printf( "\n\n\n" );





        final BigInteger tausend = new BigInteger( "1000" );
        BigInteger z = new BigInteger( "1" );
        for( int stillToDo=1000; --stillToDo>=0; ){
            z = z.multiply( tausend );
        }//for
        for( int stillToDo=1000; --stillToDo>=0; ){
            z = z.divide( tausend );
        }//for
        System.out.printf( "z=%s\n", z );



        System.out.printf( "\n\n\n" );





        System.out.printf("----- SEITE 18 -----");


        public boolean isUpperCaseLatinLetter( final char c ){
            switch( c ){
                case 'A': return true;
                case 'B': return true;
                case 'C':
                case 'D':
                case 'E': return true;
                case 'F':
                case 'G':
                case 'H':
                case 'I': return true;
                case 'J':
                case 'K':
                case 'L':
                case 'M': return true;
                case 'N':
                case 'O':
                case 'P':
                case 'Q': return true;
                case 'R':
                case 'S':
                case 'T':
                case 'U':
                case 'V': return true;
                case 'W': return true;
                case 'X':
                case 'Y':
                case 'Z': return true;
                case '?':
                default: return false;
            }//switch
        }//method()



        System.out.printf( "\n\n\n" );






        System.out.printf("----- SEITE 20 -----");

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





        final Stack<String> s = new Stack<String>();
        s.push( "U" );
        s.push( "r" );
        s.push( "m" );
        s.push( "e" );
        s.push( "l" );
        System.out.printf(
                "%s ",
                s.pop() + s.pop() + s.pop() + s.pop() + s.pop()
                );



        System.out.printf( "\n\n\n" );






        System.out.printf("----- SEITE 21 -----");

        final Map<String,Integer> map = new TreeMap<String,Integer>();
        map.put( "Luke", 1 );
        map.put( "Yoda", 2 );
        map.put( "Rey", 3 );
        for ( final String s : map.keySet() ){
            System.out.printf( "%d ", map.get( s ) );
        }//for
        map.put( "Aayla", 4 );
        map.put( "Luminara", 5 );
        map.put( "Luke", 6 );
        for ( final String s : map.keySet() ){
            System.out.printf( "%d ", map.get( s ) );
        }//for




        System.out.printf( "\n\n\n" );






        final List<Integer> list = new ArrayList<Integer>();
        int s = 0;
        do{
            list.add( s );
            s = list.size();
        }while( s <= 3 );
        int i=s;
        while( 0<i ) System.out.printf( "%d ", list.get( --i ));




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





        System.out.printf("----- SEITE 22 -----");

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





        public int magic( int p ){
            int x = 0;
            int y = p;
            do{
                x++;
                --y;
            }while( x<y );
            return x;
        }//method()

        System.out.printf( "%d", magic( 4 ) );




        System.out.printf( "\n\n\n" );





        System.out.printf("----- SEITE 23 -----");

        public int magic( int p ){
            Map<Long,String> map = null;
            for( int stillToDo=p; --stillToDo>=0; ){
                map = new HashMap<Long,String>();
                Long k = null;
                do{
                    k = (long)( Long.MAX_VALUE * Math.random() );
                }while( map.containsKey(k) );
                map.put( k, new Long( k ).toString() );
            }//for
            return map.size();
        }//method()
        ...
        System.out.printf( "%d", magic( 4 ) );




        System.out.printf( "\n\n\n" );





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





        System.out.printf("----- SEITE 24 -----");

        final Short[] array = { null, null, null, null };
        for( int i=0; i<4; ){
            array[i] = (Short)( (short)( ++i ));
        }//for
        int sum = 0;
        for( int i=array.length; --i>=0; ){
            sum += array[i];
        }//for
        System.out.printf( "%d", sum );


        System.out.printf( "\n\n\n" );





        long z = 1;
        for( int stillToDo=1000; --stillToDo>=0; ){
            z *= 1000L;
        }//for
        for( int stillToDo=1000; --stillToDo>=0; ){
            z /= 1000L;
        }//for
        System.out.printf( "z=%d\n", z );



        System.out.printf( "\n\n\n" );





        final BigInteger tausend = new BigInteger( "1000" );
        BigInteger z = new BigInteger( "1" );
        for( int stillToDo=1000; --stillToDo>=0; ){
            z = z.multiply( tausend );
        }//for
        for( int stillToDo=1000; --stillToDo>=0; ){
            z = z.divide( tausend );
        }//for
        System.out.printf( "z=%s\n", z );


        System.out.printf( "\n\n\n" );





        System.out.printf("----- SEITE 25 -----");
        final Collection<Character> coll = new ArrayList<Character>();
        coll.add( 'A' );
        coll.add( 'B' );
        coll.add( 'C' );
        coll.add( 'D' );
        coll.add( 'E' );
        final Iterator<Character> i = coll.iterator();
        while( i.hasNext() ){
            final char c = i.next();
            System.out.printf( "%c ", c );
        }//while



        System.out.printf( "\n\n\n" );







        final Stack<String> s = new Stack<String>();
        s.push( "1" );
        s.push( "2" );
        s.push( "3" );
        s.push( "4" );
        s.push( "5" );
        System.out.printf(
                "%s ",
                s.pop() + s.pop() + s.pop() + s.pop() + s.pop()
                );



        System.out.printf( "\n\n\n" );






        System.out.printf("----- SEITE 26 -----");

        final Map<String,Integer> map = new TreeMap<String,Integer>();
        map.put( "Luke", 1 );
        map.put( "Yoda", 2 );
        map.put( "Rey", 3 );
        for ( final String s : map.keySet() ){
            System.out.printf( "%d ", map.get( s ) );
        }//for
        map.put( "Aayla", 4 );
        map.put( "Yoda", 5 );
        map.put( "Luminara", 6 );
        for ( final String s : map.keySet() ){
            Syste



            System.out.printf( "\n\n\n" );





            final List<Integer> list = new ArrayList<Integer>();
            int s = 0;
            do{
                list.add( s );
                s = list.size();
            }while( s < 4 );
            int i=s;
            while( 0<i ) System.out.printf( "%d ", list.get( --i ));



            System.out.printf( "\n\n\n" );





            final List<Integer> list = new ArrayList<Integer>();
            list.add( 2 );
            list.add( 3 );
            list.add( 5 );
            list.add( 7 );
            final ListIterator<Integer> lIter = list.listIterator();
            while( lIter.hasNext() ) System.out.printf( "%d ", lIter.next());
            while( lIter.hasPrevious() ) System.out.printf( "%d ", lIter.previous());



            System.out.printf( "\n\n\n" );






            System.out.printf("----- SEITE 27 -----");

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





            public int magic( int p ){
                int x = 0;
                int y = p;
                do{
                    x++;
                    --y;
                }while( x<y );
                return x;
            }//method()
            ...
            System.out.printf( "%d", magic( 5 ) );




            System.out.printf( "\n\n\n" );





            for( char c : new char[]{ 'x', 'y', 'z' } ) System.out.printf( "%c ", c );



            System.out.printf( "\n\n\n" );







            System.out.printf("----- SEITE 28 -----");


            public int magic( int p ){
                Map<Long,String> map = null;
                for( int stillToDo=p; --stillToDo>=0; ){
                    map = new HashMap<Long,String>();
                    Long k = null;
                    do{
                        k = (long)( Long.MAX_VALUE * Math.random() );
                    }while( map.containsKey(k) );
                    map.put( k, new Long( k ).toString() );
                }//for
                return map.size();
            }//method()

            System.out.printf( "%d", magic( 4 ) );


            System.out.printf( "\n\n\n" );






            final List<String> vm = new ArrayList<String>();
            vm.add( "Zucchini" );
            vm.add( "Tomate" );
            vm.add( "Paprika" );
            vm.add( "Gurke" );
            final List<String> cm = new ArrayList<String>();
            cm.add( "gelb" );
            cm.add( "gruen" );
            cm.add( "rot" );
            for( final String v : vm ){
                for( final String c : cm ){
                    System.out.println( c + "e " + v );
                }//for
            }//for


            System.out.printf( "\n\n\n" );





            System.out.printf("----- SEITE 29 -----");

            final Short[] array = { null, null, null, null };
            for( int i=0; i<4; ){
                array[i] = (Short)( (short)( ++i ));
            }//for
            int sum = 0;
            for( int i=array.length; --i>=0; ){
                sum += array[i];
            }//for
            System.out.printf( "%d", sum );



            System.out.printf( "\n\n\n" );






            long z = 1;
            for( int stillToDo=1000; --stillToDo>=0; ){
                z *= 1000L;
            }//for
            for( int stillToDo=1000; --stillToDo>=0; ){
                z /= 1000L;
            }//for
            System.out.printf( "z=%d\n", z );



            System.out.printf( "\n\n\n" );





            final BigInteger tausend = new BigInteger( "1000" );
            BigInteger z = new BigInteger( "1" );
            for( int stillToDo=1000; --stillToDo>=0; ){
                z = z.multiply( tausend );
            }//for
            for( int stillToDo=1000; --stillToDo>=0; ){
                z = z.divide( tausend );
            }//for
            System.out.printf( "z=%s\n", z );


            System.out.printf( "\n\n\n" );





            System.out.printf("----- SEITE 31 -----");

            final Collection<String> c = new ArrayList<String>();
            c.add( "a" );
            c.add( "b" );
            c.add( "c" );
            c.add( "d" );
            c.add( "e" );
            final Iterator<String> i = c.iterator();
            while( i.hasNext() ){
                final String s = i.next();
                System.out.printf( "%s ", s );
            }//while



            System.out.printf( "\n\n\n" );





            final Queue<String> q = new LinkedList<String>();
            q.offer( "1" );
            q.offer( "2" );
            q.offer( "3" );
            q.offer( "4" );
            q.offer( "5" );
            System.out.printf(
                    "%s ",
                    q.poll() + q.poll() + q.poll() + q.poll() + q.poll()
                    );


            System.out.printf( "\n\n\n" );







            System.out.printf("----- SEITE 32 -----");


            final Map<Character,Integer> map = new TreeMap<Character,Integer>();
            map.put( 'c', 1 );
            map.put( 'b', 2 );
            map.put( 'a', 3 );
            for ( final Character c : map.keySet() ){
                System.out.printf( "%d ", map.get( c ) );
            }//for
            map.put( 'b', 4 );
            map.put( 'd', 5 );
            for ( final Character c : map.keySet() ){
                System.out.printf( "%d ", map.get( c ) );
            }//for


            System.out.printf( "\n\n\n" );





            public String magic(){
                final String a = "1";
                final int b = 2;
                final char c = 3;
                return c + b + a;
            }//method()
            ...
            System.out.printf( "%s", magic() );


            System.out.printf( "\n\n\n" );





            public int magic(){
                int x = 1;
                int y = x + 2;
                x = 2*x – y;
                return x + y;
            }//method()
            ...
            System.out.printf( "%d", magic() );



            System.out.printf( "\n\n\n" );






            System.out.printf("----- SEITE 33 -----");


            public int magic( int p ){
                int w = 0;
                for( int i=0; i<p; i++ ){
                    w = w + 2*i;
                }//for
                return w;
            }//method()

            System.out.printf( "%d", magic( 4 ) );


            System.out.printf( "\n\n\n" );







            public int magic( int p ){
                int a = 0;
                int b = 3;
                do{
                    a++;
                    --b;
                }while( a<b );
                return b;
            }//method()
            ...
            System.out.printf( "%d", magic( 4 ) );



            System.out.printf( "\n\n\n" );





            for( int i : new int[]{ 1, 2, 3, 4 } ) System.out.printf( "%x ", i );



            System.out.printf("----- SEITE 34 -----");

            final Set<String> zoo = new HashSet<String>();
            zoo.add( "Elefant" );
            zoo.add( "Zebra" );
            zoo.add( "Affe" );
            zoo.add( "Zebra" );
            zoo.add( "Bär" );
            int n1 = zoo.size();
            boolean b1 = zoo.contains("Affe" );
            zoo.remove("Affe" );
            int n2 = zoo.size();
            boolean b2 = zoo.contains("Affe" );
            System.out.printf(
                    "%d ; %s ; %d ; %s",
                    n1, b1, n2, b2
                    );


            System.out.printf( "\n\n\n" );







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






            System.out.printf("----- SEITE 37 -----");

            final Queue<Integer> queue = new LinkedList<Integer>();
            int n=1;
            for ( int i=0; i<3; i++ ){ queue.add( n++ ); }
            for ( int i=0; i<2; i++ ){ System.out.printf( "%d ", queue.remove() ); }
            for ( int i=0; i<2; i++ ){ queue.add( n++ ); }
            for ( int i=0; i<3; i++ ){ System.out.printf( "%d ", queue.remove() ); }



            System.out.printf( "\n\n\n" );






            final Stack<Integer> stack = new Stack<Integer>();
            int n=1;
            for ( int i=0; i<3; i++ ){ stack.push( n++ ); }
            for ( int i=0; i<2; i++ ){ System.out.printf( "%d ", stack.pop() ); }
            for ( int i=0; i<2; i++ ){ stack.push( n++ ); }
            for ( int i=0; i<3; i++ ){ System.out.printf( "%d ", stack.pop() ); }



            System.out.printf( "\n\n\n" );





            final Map<Character,Integer> map = new TreeMap<Character,Integer>();
            map.put( 'b', 1 );
            map.put( 'c', 2 );
            map.put( 'a', 3 );
            for ( final Character c : map.keySet() ){
                System.out.printf( "%d ", map.get( c ) );
            }//for
            map.put( 'd', 4 );
            map.put( 'b', 5 );
            for ( final Character c : map.keySet() ){
                System.out.printf( "%d ", map.get( c ) );
            }//for



            System.out.printf( "\n\n\n" );






            for( char c : new char[]{ 'q', 'x', 'p' } ) System.out.printf( "%c ", c );


            System.out.printf( "\n\n\n" );






        }//method

    }//class
