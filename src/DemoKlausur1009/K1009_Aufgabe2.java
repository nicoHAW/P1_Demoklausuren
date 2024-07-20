package DemoKlausur1009;

public class K1009_Aufgabe2 {

    public static void main(String[] args) {

        System.out.printf( "----- Aufgabe 2: a -----\n");
        Boolean boola = !((( true ^ false) || false ) && true );
        System.out.printf( "%s", boola );

        System.out.printf( "\n\n");

        System.out.printf( "----- Aufgabe 2: b -----\n");
        Boolean boolb = !(( true ^ false) != ( true != false )) ? null : true|false;
        System.out.printf( "%s", boolb );

        /*
         * ACHTUNG: Primitive Datentypen kann man nicht null zuweisen. Ausgabe null geht dennoch, da null nicht dereferenziert wird. 
         * 
         *  boolean booleana = null;
         *  byte bytea = null;
         *  char chara = null;
         *  short shorta = null;
         *  int inta = null;
         *  long longa = null;
         *  float floata = null;
         *  double doublea = null;
         */
        
        
        
        System.out.printf( "\n\n");
        System.out.printf( "----- Aufgabe 2: b TEST -----\n");

        //Zuweisung bei Wrapper-Klassen möglich. 

        Boolean booleana = null;
        Byte bytea = null;
        Character chara = null;
        Short shorta = null;
        Integer inta = null;
        Long longa = null;
        Float floata = null;
        Double doublea = null;
        String stringa = null;
        // Array[] arraya = new Array();

        System.out.println(bytea + " " + booleana  + " " + chara + " " + shorta + " " + inta + " " + longa + " " + floata + " " + doublea + " " + stringa);


        System.out.printf( "\n\n");
        System.out.printf( "----- Aufgabe 2: c -----\n");
        String s = "z" + 0;
        System.out.printf( "%s", s );

        System.out.printf( "\n\n");
        System.out.printf( "----- Aufgabe 2: d -----\n");
        Character c = (char)( 0 + 'z' );
        System.out.printf( "%c", c );

        System.out.printf( "\n\n");
        System.out.printf( "----- Aufgabe 2: e -----\n");
        int val = (short)(1) + (char)(1);
        System.out.printf( "%d", val );

        System.out.printf( "\n\n");
        System.out.printf( "----- Aufgabe 2: f -----\n");

        char f = (char)( 'z' - 2*('y'-'x') );
        System.out.printf( "%c", f );

        System.out.printf( "\n\n");

        System.out.printf( "----- Aufgabe 2: f TEST -----\n");
        char testf = ('y'-'w');
        System.out.printf( "%c", testf );

        System.out.printf( "\n\n");
        System.out.printf( "----- Aufgabe 2: g -----\n");
        byte valg = (byte)( 171717%17 < 17? 1D*1F : Float.NEGATIVE_INFINITY / Double.POSITIVE_INFINITY);
        System.out.printf( "%d", valg );

        // Modulo 17 = 0 - kann gar nicht größer als 17 sein. Deswegen hinterher Teil auch egal. 
        // ACHTUNG: 1D und 1F sind 1Double und 1 Float - kein Hex. 

        System.out.printf( "\n\n");
        System.out.printf( "----- Aufgabe 2: g-Test -----\n");
        //byte valg = (byte)( 171717%17 < 17? 1D*1F : Float.NEGATIVE_INFINITY / Double.POSITIVE_INFINITY);
        //System.out.printf( "%d", valg );

        byte valgTest = 171717%17;
        System.out.printf( "%d", valgTest );

        byte valgTest2 = (byte) (1D*1F);
        System.out.printf( "%d", valgTest2 );


        System.out.printf( "\n\n");
        System.out.printf( "----- Aufgabe 2: h -----\n");

        byte valh = (byte)( (0x7e & 0xbd &0xdb & 0xe7 ) ^ 0xc3 );
        System.out.printf( "%x", valh );

        /* 
         * Achtung Falle: 0x7e & 0xbd &0xdb & 0xe7 hebt sich auf. 
         * 
         * Bitwise Zuordnung: 
         * 0x7e =      0111 1110
         * 0xbd =    & 1011 1101
         * 0xdb =    & 1101 1011
         * 0xe7 =    & 1110 0111
         *----------------------
         *             0000 0000
         * 0xc3 =    ^ 1100 0011
         * ---------------------
         * Ergebnis:   1100 0011
         * 
         */

        System.out.printf( "\n\n");
        System.out.printf( "----- Aufgabe 2: i -----\n");
        long vali = ( Long.MAX_VALUE + Long.MIN_VALUE );

        if( vali < Long.MIN_VALUE ){ System.out.printf( "k" );
        } else if( vali > Long.MAX_VALUE ){ System.out.printf( "g" );
        } else{ System.out.printf( "d" );
        }

        /*
         * Long.MIN_VALUE = -9223372036854775808
         * Long.MAX_VALUE = 9223372036854775807
         * 
         * Variable = -1, daher k.
         */
        
        System.out.printf( "\n\n");
        System.out.printf( "----- Aufgabe 2: i TEST -----\n");
        
        System.out.println( Long.MIN_VALUE );
        System.out.println( Long.MAX_VALUE );
        System.out.println( Long.MAX_VALUE + Long.MIN_VALUE );
        
        
        System.out.printf( "\n\n");
        System.out.printf( "----- Aufgabe 2: j -----\n");


        System.out.printf( "\n\n");
        System.out.printf( "----- Aufgabe 2: k -----\n");


        System.out.printf( "\n\n");
        System.out.printf( "----- Aufgabe 2: l -----\n");


        System.out.printf( "\n\n");
        System.out.printf( "----- Aufgabe 2: m -----\n");



    }

}
