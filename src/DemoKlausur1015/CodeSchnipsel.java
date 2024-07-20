package DemoKlausur1015;

public class CodeSchnipsel {

    public static void main(String[] args) {

        //c
        String s = "a" + 3;
        System.out.printf( "%s", s );
        
        System.out.printf( "\n\n");        
        
        //c
        Character c = (char)( 3 + 'a' );
        System.out.printf( "%c", c );
        
        Character cc = (char)( 3 + 'a' );
        System.out.printf( " / %s", cc ); //als string auch Buchstabe. Als %d geht nicht.
        
        
        System.out.printf( "\n\n");        

        int val = (short)(2) + (char)(3);
        System.out.printf( "%d", val );

        int vald= (short)(2) + (char)(3);
        System.out.printf( " / %s", val ); // Zahl als String
        
        int valdd = (short)(2) + (char)(3);
        System.out.printf( " / %c", val ); // als Char wird ?Zeichen ausgegeben.
        
        System.out.printf( "\n\n");        
        
        char f = (char)( 'e' - 2*('c'-'a') );
        System.out.printf( "%c", f );
        
        
        
        byte valg = (byte)( 414141%41 < 41
                ? 1F*1D
                : Float.NEGATIVE_INFINITY / Double.POSITIVE_INFINITY
                );
               System.out.printf( "%d", valg );
        
        
        
    }//main
}//class
