package Aufgabe2;

public class Aufgabe2 {

    public static void main(String[] args) {

        System.out.printf( "----- Aufgabe 2: a -----\n");
        Boolean boola = !((( true ^ false) || false ) && true );
        System.out.printf( "%s", boola );

        System.out.printf( "\n\n");

        System.out.printf( "----- Aufgabe 2: b -----\n");
        Boolean boolb = !(( true ^ false) != ( true != false )) ? null : true|false;
        System.out.printf( "%s", boolb );

        /*
         * ACHTUNG: null zweisen geht in diesem Fall nicht. 
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
          
          System.out.printf( "----- Aufgabe 2: f TEST -----\n");
          System.out.printf( 'y' - 'x' );
          
          System.out.printf( "\n\n");
          System.out.printf( "----- Aufgabe 2: g -----\n");
          
          
          System.out.printf( "\n\n");
          System.out.printf( "----- Aufgabe 2: h -----\n");
          

          System.out.printf( "\n\n");
          System.out.printf( "----- Aufgabe 2: i -----\n");
          
          
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
