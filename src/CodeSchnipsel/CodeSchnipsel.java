package CodeSchnipsel;

public class CodeSchnipsel {

    public static void main(String[] args) {

        System.out.printf( "----- PDF: 01_P1_01_CodeSchnipsel.pdf -----\n\n\n");
        
        System.out.printf( "----- Seite 1 -----\n\n");
        
        System.out.printf( "String s = \"a\" + 3 = "); 
        String s = "a" + 3;
        System.out.printf( "%s", s );  //String a + 3 = a3

        System.out.printf( "\n\n\n");        

        
        System.out.printf("Character c = (char)( 3 + 'a' ) = "); 
        Character c = (char)( 3 + 'a' );
        System.out.printf( "%c", c ); //Char wie Zahlen a + 3(c) = d

        
        System.out.printf("\n\nWie Ausgaben zuvor, aber statt Ausgabe \\c (char) mit \\s(String)  = "); 
        Character cc = (char)( 3 + 'a' );
        System.out.printf( "%s", cc ); //als string auch Buchstabe. Als %d geht nicht.

        
        System.out.printf("\n\nWie Ausgaben zuvor, aber statt Ausgabe \\c (char) mit \\d(String)  = "); 
        Character ccb = (char)( 3 + 'a' );
        System.out.printf( "VERURSACHT ERROR" ); //als string auch Buchstabe. Als %d geht nicht.

        System.out.printf( "\n\n\n");        
      
        
        System.out.printf("int val = (short)(2) + (char)(3)  = "); 
        int val = (short)(2) + (char)(3);
        System.out.printf("Ausgabe als d: %d", val );
        
        System.out.printf("\n\n");   

        
        System.out.printf("Wie zuvor aber Ausgabe als String = "); 
        int vald= (short)(2) + (char)(3);
        System.out.printf("String: %s", val ); // Zahl als String

        System.out.printf("\n\n");   

        
        System.out.printf("Wie zuvor aber Ausgabe als Char = "); 
        int valdd = (short)(2) + (char)(3);
        System.out.printf("Char: %c", val ); // als Char wird ?Zeichen ausgegeben.

        System.out.printf( "\n\n\n");        
        
       
        
        
        System.out.printf(" char f = (char)( 'e' - 2*('c'-'a') ); = "); 
        char f = (char)( 'e' - 2*('c'-'a') );
        System.out.printf("%c", f ); //Ausgabe a

        System.out.printf("\n\n"); 
        
        
        System.out.printf("Wie zuvor aber Ausgabe als String = "); 
        char ffb = (char)( 'e' - 2*('c'-'a') ); /* e = 5 ; c = 3 ; a = 1 ; b = 2 ; d = 4
                                                 * c-a = b ; 2*b = d , e-d = 1
                                                 */
        System.out.printf("%s", ffb ); //auch als String Ausgabe a

        System.out.printf("\n\nErklärung: e = 5 ; c = 3 ; a = 1 ; b = 2 ; d = 4\r\n"
                        + "             c-a = b ; 2*b = d , e-d = 1 ");  
        System.out.printf( "\n\n\n");  
        
        System.out.printf("Wie oben aber Ausgabe als Decimal = "); 
        char ffbb = (char)( 'e' - 2*('c'-'a') ); /* e = 5 ; c = 3 ; a = 1 ; b = 2 ; d = 4
                                                 * c-a = b ; 2*b = d , e-d = 1
                                                 */
   //     System.out.printf("%d", ffbb ); //Ausgaben als d verursacht Error
        System.out.printf("ERROR");
        
        
        
        System.out.printf("\n\n\n"); 

        
        
        
        System.out.println("byte valg = (byte)( 414141%41 < 41) ? 1F*1D : Float.NEGATIVE_INFINITY / Double.POSITIVE_INFINITY = "); 
        byte valg = (byte)( 414141%41 < 41  //kann gar nicht 41 sein, daher auf jeden fall kleiner
                ? 1F*1D                     //1F = 1Float, 1D = 1Double, 1*1 = 1
                : Float.NEGATIVE_INFINITY / Double.POSITIVE_INFINITY 
                );
        System.out.printf("%d", valg );
        System.out.println("Erklärung: 1F = 1Float, 1D = 1Double, 1*1 = 1");
        
        
        
        
        System.out.printf("\n\n\n");   

        System.out.printf(" byte vala = (byte)( (0x7e & 0xbd &0xdb & 0xe7 ) ^ 0x87 ) = "); 
        byte vala = (byte)( (0x7e & 0xbd &0xdb & 0xe7 ) ^ 0x87 );
        System.out.printf("%x", vala );

        System.out.printf("\nAchtung Falle: 0x7e & 0xbd &0xdb & 0xe7 hebt sich auf. \r\n"
                + "         * \r\n"
                + "         * Bitwise Zuordnung: \r\n"
                + "         * 0x7e =      0111 1110\r\n"
                + "         * 0xbd =    & 1011 1101  & = AND-Verknüpfung\r\n"
                + "         * 0xdb =    & 1101 1011 & = AND-Verknüpfung\r\n"
                + "         * 0xe7 =    & 1110 0111  & = AND-Verknüpfung\r\n"
                + "         *----------------------\r\n"
                + "         *             0000 0000\r\n"
                + "         * 0xc3 =    ^ 1100 0011  ^ = XOR-Verknüpfung\r\n"
                + "         * ---------------------\r\n"
                + "         * Ergebnis:   1100 0011");
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
        
        
        System.out.printf("\n\n\n");   

        System.out.printf( " long valb = ( Long.MAX_VALUE + Long.MIN_VALUE );\n"
                + "        if( valb < Long.MIN_VALUE ){ System.out.printf( \"s\" )\n"
                + "        }else if( valb > Long.MAX_VALUE ){ System.out.printf( \"g\" );\n"
                + "        }else{ System.out.printf( \"e\" );\r\n"
                + "        } = "); 
        long valb = ( Long.MAX_VALUE + Long.MIN_VALUE ); //valb = 1 
        if( valb < Long.MIN_VALUE ){ System.out.printf( "s" );
        }else if( valb > Long.MAX_VALUE ){ System.out.printf( "g" );
        }else{ System.out.printf( "e" );
        }

        System.out.println("\n\nErklärung");
        System.out.println("Long.MAX_VALUE = " + Long.MAX_VALUE); 
        System.out.println("Long.MIN_VALUE = " + Long.MIN_VALUE);
        System.out.println("valb = " + valb);
       
        System.out.printf( "\n\n\n");  

        
        
        System.out.printf( "----- Seite 2 -----\n\n");
        
        
        System.out.printf("long valc = (Long.MIN_VALUE >>> 63) - (Long.MIN_VALUE >> 63); = "); 
        long valc = (Long.MIN_VALUE >>> 63) - (Long.MIN_VALUE >> 63);
        System.out.printf( "%d", valc );

        System.out.println("\n\nErklärung");
        System.out.println("Long.MIN_VALUE = " + Long.MIN_VALUE); 
        System.out.println("Long.MIN_VALUE >>> 63 = " + (Long.MIN_VALUE >>> 63));
        System.out.println("Long.MIN_VALUE = " + Long.MIN_VALUE); 
        System.out.println("Long.MIN_VALUE >> 63 = " + (Long.MIN_VALUE >> 63));
        System.out.println("1-(-1) = valc");
        System.out.println("valc = " + valc);
        
        System.out.printf( "\n\n\n");   

        
        System.out.printf( " int valf = 1*2*3/*4*5*/+6; = "); 
        int valf = 1*2*3/*4*5*/+6;
        System.out.printf( "%d", valf );

        System.out.printf( "\n\n\n");   
        
        
        System.out.printf( " long vale = (Float.NEGATIVE_INFINITY < Float.POSITIVE_INFINITY) ? -1 : +1; = "); 
        long vale = (Float.NEGATIVE_INFINITY < Float.POSITIVE_INFINITY) ? -1 : +1;
        System.out.printf( "%d", vale );

        System.out.printf( "\n\n\n");   
        
        
        System.out.printf( " int valh = 6>>>5 > 4 ? 3 >> 2 : 1 >>> 0; = "); 
        int valh = 6>>>5 > 4 ? 3 >> 2 : 1 >>> 0;
        System.out.printf( "%d", valh );

        System.out.printf("\n\nErklärung\n");
        System.out.printf("\n 6>>>5 = " + (6>>>5));
        System.out.printf("\n 6 als Bit = %4s", Integer.toBinaryString(6));
        System.out.printf("\n 6>>>5 6 als Bit = %4s",  Integer.toBinaryString(6>>>5));
        System.out.printf("\n 6>>>5 = " + (6>>>5));
        System.out.printf("\n\n 3 >> 2 = " + (3));
        System.out.printf("\n 3 als Bit = %4s",  Integer.toBinaryString(3));
        System.out.printf("\n 3 >> 2 als Bit = %4s",  Integer.toBinaryString(3 >> 2));
        System.out.printf("\n 3 >> 2 = " + (3 >> 2));
        System.out.printf("\n 1 >>> 0 = " + (1));
        System.out.printf("\n 1 als Bi = %4s",  Integer.toBinaryString(1));
        System.out.printf("\n 1 >>> 0 als Bit = %4s",  Integer.toBinaryString(1 >>> 0));
        System.out.printf("\n 1 >>> 0 = " + (1 >>> 0));
        
        
        System.out.printf( "\n\n\n");      
        

        System.out.println( "Byte b = (byte)( Byte.MIN_VALUE < Character.MIN_VALUE ? 0%1 : 1%0 ) = "); 
        Byte b = (byte)( Byte.MIN_VALUE < Character.MIN_VALUE ? 0%1 : 1%0 );
        System.out.printf( "%s", b );
        
        System.out.printf("\n\nErklärung\n");
        System.out.printf("Byte.MIN_VALUEe = " + Byte.MIN_VALUE);
        System.out.printf("Character.MIN_VALUE" + Character.MIN_VALUE);
        System.out.printf("0 Modulo 1 = 0:1 = 0 R0");
        
        
        
        System.out.printf( "\n\n\n");   
        

        
        System.out.printf( " int vali = 1<<2 != 2>>1 ? 1<<2 : 2>>>1; = "); 
        int vali = 1<<2 != 2>>1 ? 1<<2 : 2>>>1;
        System.out.printf( "%d", vali );
        
        
        System.out.printf("\n\nErklärung\n");
        System.out.printf("\n 1<<2 = " + (1<<2));
        System.out.printf("\n 1 als Bit = %4s", Integer.toBinaryString(1));
        System.out.printf("\n 1<<2 als Bit = %4s",  Integer.toBinaryString(1<<2));
        
        System.out.printf("\n\n 2>>1 = " + (2>>1));
        System.out.printf("\n 1 als Bit = %4s", Integer.toBinaryString(1));
        System.out.printf("\n 2>>1 als Bit = %4s",  Integer.toBinaryString(1<<2));
        
        System.out.printf("\n\n 2>>>1 = " + (2>>>1));
        System.out.printf("\n 2>>>1 als Bit = %4s",  Integer.toBinaryString(2>>>1));
        System.out.printf("\n\n (-2)>>>1 = " + (-2>>>1));
        System.out.printf("\n -2 als Bit = %4s",  Integer.toBinaryString(-2));
        System.out.printf("\n (-2)>>>1 als Bit = %4s",  Integer.toBinaryString(-2>>>1));
        
        
        System.out.printf( "\n\n\n");
        
        
        System.out.printf( "----- Seite 3 -----\n\n");
        
        System.out.printf( "Boolean a = !((( true && false) ^ false ) || true ) = "); 
        Boolean a = !((( true && false) ^ false ) || true );
        System.out.printf( "%s", a );

        System.out.printf( "\n\n\n");  
        

        System.out.printf( "Boolean bb = ( !( true ^ true )) || ( 42/0 < Long.MAX_VALUE );  = "); 
        Boolean bb = ( !( true ^ true )) || ( 42/0 < Long.MAX_VALUE );
        System.out.printf( "%s", bb );

        System.out.printf( "\n\n\n");   
        

        
        
        System.out.println(" Byte ccc = (byte)( Byte.MIN_VALUE < Character.MIN_VALUE ? 0 % 1 : 1 % 0 ) = "); 
        Byte ccc = (byte)( Byte.MIN_VALUE < Character.MIN_VALUE ? 0%1 : 1%0 );
        System.out.printf( "%s", ccc );
        
        System.out.printf("\n\nErklärung");
        System.out.printf("\nByte.MIN_VALUE = ", Byte.MIN_VALUE);
        System.out.printf("\nCharacter.MIN_VALUEE = ", Character.MIN_VALUE);

        System.out.printf( "\n\n\n");  
        
        
        

        System.out.printf("Character d = (char)( 3 + 'n' );  = "); 
        Character d = (char)( 3 + 'n' );
        System.out.printf( "%c", d );

        System.out.printf( "\n\n\n");        
        
        

        
        System.out.printf("String e = \"n\" + 2;  = "); 
        String e = "n" + 2;
        System.out.printf( "%s", e );

        System.out.printf( "\n\n\n"); 
        

        
        
        System.out.printf( "int ff = (byte)(1) + (char)(2);  = "); 
        int ff = (byte)(1) + (char)(2);
        System.out.printf( "%d", ff );

        System.out.printf( "\n\n\n"); 
        
        System.out.printf( "----- Seite 4 -----\n\n");
        
        
        System.out.printf( " int g = 1*2*3/*4*5*/-6;  = "); 
        int g = 1*2*3/*4*5*/-6;
        System.out.printf( "%d", g );

        System.out.printf( "\n\n\n");  
        

        
        System.out.printf("int h = 1<<2 != 2>>1 ? 1<<2 : 2>>>1;  = "); 
        int h = 1<<2 != 2>>1 ? 1<<2 : 2>>>1;
        System.out.printf( "%d", h );

        System.out.printf( "\n\n\n");  
        

        
        System.out.printf(" long i = (Float.NEGATIVE_INFINITY < Float.POSITIVE_INFINITY) ? -1 : +1; = "); 
        long i = (Float.NEGATIVE_INFINITY < Float.POSITIVE_INFINITY) ? -1 : +1;
        System.out.printf( "%d", i );

        System.out.printf( "\n\n\n");  
        
        
        System.out.printf("\n\nErklärung");
        System.out.printf("\nFloat.NEGATIVE_INFINITY = ", Float.NEGATIVE_INFINITY);
        System.out.printf("\nCharacter.MIN_VALUEE = ", Character.MIN_VALUE);

        System.out.printf( "\n\n\n");  
        
        
        
        
        System.out.printf("float j = (float)( (3/2)*(4/3)*(8/4) );  = "); 
        float jrill = (float)( (3/2)*(4/3)*(8/4) );
        System.out.printf( "%.2f", jrill );

        System.out.printf( "\n\n\n"); 
        

        
        System.out.printf("Void jj = null; = "); 
        Void jj = null;
        System.out.print( jj );

        System.out.printf( "\n\n\n"); 
        
        
        System.out.printf( "----- Seite 5 -----\n\n");
        

        System.out.printf("Boolean aa = (( !true ^ !!true ) || true ) ^ false;  = "); 
        Boolean aa = (( !true ^ !!true ) || true ) ^ false;
        System.out.printf( "%s", aa );

        System.out.printf( "\n\n\n");
        
        

        System.out.printf("Boolean bbb = (( false != true ) == ( false ^ true )) || false = "); 
        Boolean bbb = (( false != true ) == ( false ^ true )) || false;
        System.out.printf( "%s", bbb );

        System.out.printf( "\n\n\n"); 
        

        
        System.out.println("Byte cccc = (byte)( Short.MIN_VALUE < Character.MIN_VALUE ? 7%-3 : -6%4 )= "); 
        Byte cccc = (byte)( Short.MIN_VALUE < Character.MIN_VALUE ? 7%-3 : -6%4 );
        System.out.printf( "%s", cccc );

        System.out.printf( "\n\n\n"); 
        

        
        System.out.printf("Character dd = (char)( (short)(-2) + 'e' - (char)(1) )  = "); 
        Character dd = (char)( (short)(-2) + 'e' - (char)(1) );
        System.out.printf( "%c", dd );

        System.out.printf( "\n\n\n"); 
        

        
        System.out.printf("String ea = \"p\" + 1;  = "); 
        String ea = "p" + 1;
        System.out.printf( "%s", ea );

        System.out.printf( "\n\n\n"); 
        
        System.out.printf( "----- Seite 6 -----\n\n");
        
        
        System.out.printf("int fa = Character.MAX_VALUE | 0xFF000000 | 0x00FF0000;  = "); 
        int fa = Character.MAX_VALUE | 0xFF000000 | 0x00FF0000;
        System.out.printf( "%d", fa );

        System.out.printf( "\n\n\n"); 
        
        

        
        System.out.printf("int ga = 2*3/*6*5*4*/-8; = "); 
        int ga = 2*3/*6*5*4*/-8;
        System.out.printf( "%d", ga );


        System.out.printf( "\n\n\n"); 
        
        
        
        
        System.out.println(" int ha = (int)( 424242%42 >= 42\r\n"
                + "                ? 1F*1D\r\n"
                + "                 : (char)( 'e' - 'c' + Character.MIN_VALUE )\r\n"
                + "                );  = "); 
        int ha = (int)( 424242%42 >= 42
                ? 1F*1D
                 : (char)( 'e' - 'c' + Character.MIN_VALUE )
                ); 
        System.out.printf( "%d", ha );

        System.out.printf( "\n\n\n"); 
        
        
        
        
        System.out.printf("double ia = (double)( (17/11)*(7/5)*(3/2) ) + 0.23F;  = "); 
        double ia = (double)( (17/11)*(7/5)*(3/2) ) + 0.23F;
        System.out.printf( "%.2f", ia );
        
        System.out.println("\n\nTest -> D direkt hinter den Zahlen");
        
        System.out.printf("double ia = (double)( (17D/11D)*(7D/5D)*(3D/2D) ) + 0.23F;  = "); //Mit D hinter den Zahlen werden sie direkt zu Double
        double iq = ( (17D/11D)*(7D/5D)*(3D/2D) ) + 0.23F;
        System.out.printf( "%.2f", iq );

        System.out.printf( "\n\n\n"); 

        
        
        
        System.out.println("Void jb = null = ");
        Void jb = null;
        System.out.print( jb );

        System.out.printf( "\n\n\n"); 

        
        System.out.printf( "----- Seite 7 -----\n\n");
        
        System.out.printf("Boolean ab = ( !( !( true != false ) && false ) || true );  = "); 
        Boolean ab = ( !( !( true != false ) && false ) || true );
        System.out.printf( "%s", ab );

        System.out.printf( "\n\n\n"); 
        

        
        
        System.out.printf("Boolean bc = ( !( true != true ) || ( 42/0 < Long.MAX_VALUE ));  = "); 
        Boolean bc = ( !( true != true ) || ( 42/0 < Long.MAX_VALUE ));
        System.out.printf( "%s", bc );

        System.out.printf( "\n\n\n"); 

        

        
        System.out.println("Byte cb = (byte)( Byte.MIN_VALUE < Character.MIN_VALUE ? 0%1 : 1%0 );  = "); 
        Byte cb = (byte)( Byte.MIN_VALUE < Character.MIN_VALUE ? 0%1 : 1%0 );
        System.out.printf( "%s", cb );


        System.out.printf( "\n\n\n"); 
        

        
        
        System.out.printf("Character dc = (char)( (short)(-1) + 'x' - (char)(0) );  = "); 
        Character dc = (char)( (short)(-1) + 'x' - (char)(0) );
        System.out.printf( "%c", dc );


        System.out.printf( "\n\n\n"); 

        

        
        System.out.printf("String ec = \"x\" + 2;  = "); 
        String ec = "x" + 2;
        System.out.printf( "%s", ec );

        System.out.printf( "\n\n\n"); 

        

        
        System.out.printf("int fc = (byte)(5) + (char)(7) + (short)(-2);  = "); 
        int fc = (byte)(5) + (char)(7) + (short)(-2);
        System.out.printf( "%d", fc );

        System.out.printf( "\n\n\n"); 

        
        System.out.printf( "----- Seite 8 -----\n\n");

        
        System.out.printf("int gc = ( 1 << 16 ) - Character.MAX_VALUE;  = "); 
        int gc = ( 1 << 16 ) - Character.MAX_VALUE;
        System.out.printf( "%d", gc );

        System.out.printf("\n\nErklärung");
        
        System.out.printf("\n Character.MAX_VALUE = %d", (int)Character.MAX_VALUE);
        System.out.printf("\n Character.MAX_VALUE als Bit = %s", Integer.toBinaryString(Character.MAX_VALUE));
        System.out.printf("\n Character.MAX_VALUE als Hex = 0x%X ", (int) Character.MAX_VALUE);
        
        System.out.printf("\n\n 1 << 16 = %d", (1 << 16));
        System.out.printf("\n 1 << 16 als Bit = %s", Integer.toBinaryString(1 << 16));
        System.out.printf("\n 1 << 16 als Hex = 0x%X", (int)(1 << 16));
        
        
        
        System.out.printf( "\n\n\n"); 
        
        
        

        
        System.out.printf("long hc = (Float.NEGATIVE_INFINITY == Float.POSITIVE_INFINITY) ? -1 : +1;  = "); 
        long hc = (Float.NEGATIVE_INFINITY == Float.POSITIVE_INFINITY) ? -1 : +1;
        System.out.printf( "%d", hc );

        System.out.printf("\n\nErklärung");
        System.out.printf("\n Float.NEGATIVE_INFINITY = %f", Float.NEGATIVE_INFINITY);
        System.out.printf("\n Float.NEGATIVE_INFINITY = %f", Float.POSITIVE_INFINITY);
        
        
        System.out.printf( "\n\n\n"); 

        

        
        System.out.printf("double ic = (double)( (13/7)*(7/5)*(5/3) ) + 0.5F;  = "); 
        double ic = (double)( (13/7)*(7/5)*(5/3) ) + 0.5F;
        System.out.printf( "%.2f", ic );

        System.out.printf( "\n\n\n"); 

        

        
        System.out.printf("Void jc = null;  = "); 
        Void jc = null;
        System.out.print( jc );

        System.out.printf( "\n\n\n"); 

        
        System.out.printf( "----- Seite 9 -----\n\n");
        
        System.out.printf("String sc = \"a\" + 3; = "); 
        String sc = "a" + 3;
        System.out.printf( "%s", sc );

        System.out.printf( "\n\n\n"); 

        

        
        System.out.printf("Character cf = (char)( 2 + 'x' );  = "); 
        Character cf = (char)( 2 + 'x' );
        System.out.printf( "%c", cf );

        System.out.printf( "\n\n\n"); 

        

        
        System.out.printf("int valp = (short)(2) + (char)(3);  = "); 
        int valp = (short)(2) + (char)(3);
        System.out.printf( "%d", valp );

        System.out.printf( "\n\n\n"); 

        

        
        System.out.printf("char cff = (char)( 'h' - 2*('d'-'b') );  = "); 
        char cff = (char)( 'h' - 2*('d'-'b') );
        System.out.printf( "%c", cff );
        
        System.out.printf( "\n\n\n"); 

        

        
        System.out.println("byte valz = (byte)( 414141 % 41 < 41\r\n"
                + "                ? 1F*1D\r\n"
                + "                        : Float.NEGATIVE_INFINITY / Double.POSITIVE_INFINITY\r\n"
                + "                );  = "); 
        byte valz = (byte)( 414141 % 41 < 41
                ? 1F*1D
                        : Float.NEGATIVE_INFINITY / Double.POSITIVE_INFINITY
                );
        System.out.printf( "%d", valz );

        System.out.printf( "\n\n\n"); 

        

        
        System.out.printf("byte valnn = (byte)( (0x7e & 0xbd &0xdb & 0xe7 ) ^ 0x87 );  = "); 
        byte valnn = (byte)( (0x7e & 0xbd &0xdb & 0xe7 ) ^ 0x87 );
        System.out.printf( "%x", valnn );

        System.out.printf( "\n\n\n"); 

        

        
        System.out.printf("long valhr = ( Long.MAX_VALUE + Long.MIN_VALUE );\r\n"
                + "        if( valhr < Long.MIN_VALUE ){ System.out.printf( \"s\" );\r\n"
                + "        }else if( valhr > Long.MAX_VALUE ){ System.out.printf( \"g\" );\r\n"
                + "        }else{ System.out.printf( \"e\" );\r\n"
                + "        }  = "); 
        long valhr = ( Long.MAX_VALUE + Long.MIN_VALUE );
        if( valhr < Long.MIN_VALUE ){ System.out.printf( "s" );
        }else if( valhr > Long.MAX_VALUE ){ System.out.printf( "g" );
        }else{ System.out.printf( "e" );
        }
        
        System.out.printf( "\n\nErklärung:"); 
        
        System.out.printf( "\n\nvalhr = %d", valhr);
        System.out.printf( "\nLong.MAX_VALUE = %d", Long.MAX_VALUE); 
        System.out.printf( "\nLong.MIN_VALUE = %d", Long.MIN_VALUE); 


        System.out.printf( "\n\n\n"); 

        System.out.printf( "----- Seite 10 -----\n\n");

        
        System.out.printf("long valgt = (Long.MIN_VALUE >>> 63) - (Long.MIN_VALUE >> 63);  = "); 
        long valgt = (Long.MIN_VALUE >>> 63) - (Long.MIN_VALUE >> 63);
        System.out.printf( "%d", valgt );

        System.out.printf( "\n\nErklärung:"); 
        
        System.out.printf( "\nLong.MIN_VALUE = %d", Long.MIN_VALUE); 
        System.out.printf( "\nLong.MIN_VALUE >>> 63 = %d", Long.MIN_VALUE >>> 63);
        System.out.printf( "\nLong.MIN_VALUE >>> 63 = %s", Long.toBinaryString(Long.MIN_VALUE >>> 63));
        System.out.printf( "\n\nLong.MIN_VALUE = %d", Long.MIN_VALUE); 
        System.out.printf( "\nLong.MIN_VALUE >> 63 = %d", Long.MIN_VALUE >> 63);
        System.out.printf( "\nLong.MIN_VALUE >> 63 = %s", Long.toBinaryString(Long.MIN_VALUE >> 63));

        
        System.out.printf( "\n\n\n"); 

        

        
        System.out.printf("int valwfe = 1*2*3/*4*5*/+6;  = "); 
        int valwfe = 1*2*3/*4*5*/+6;
        System.out.printf( "%d", valwfe );

        System.out.printf( "\n\n\n"); 
        


        System.out.printf("long vagtel = (Float.NEGATIVE_INFINITY < Float.POSITIVE_INFINITY) ? -1 : +1 = "); 
        long vagtel = (Float.NEGATIVE_INFINITY < Float.POSITIVE_INFINITY) ? -1 : +1;
        System.out.printf( "%d", vagtel );
        System.out.printf( "\n\n\n"); 
        
        
        
        System.out.printf("int valdede = 6>>>5 > 4 ? 3 >> 2 : 1 >>> 0; = ");
        int valdede = 6>>>5 > 4 ? 3 >> 2 : 1 >>> 0;
        System.out.printf( "%d", valdede );
        System.out.printf( "\n\n\n"); 
        
        
        
        
        System.out.printf("Byte brz = (byte)( Byte.MIN_VALUE < Character.MIN_VALUE ? 0%%1 : 1%%0 ) = ");
        Byte brz = (byte)( Byte.MIN_VALUE < Character.MIN_VALUE ? 0%1 : 1%0 );
        System.out.printf( "%s", brz );
        System.out.printf( "\n\n\n"); 
        
        
        
        
        System.out.printf("int val = 1<<2 != 2>>1 ? 1<<2 : 2>>>1; = ");
        int valrtz = 1<<2 != 2>>1 ? 1<<2 : 2>>>1;
        System.out.printf( "%d", valrtz );
        System.out.printf( "\n\n\n"); 
        
        
        
        
        System.out.printf( "----- Seite 11 -----\n\n");

        
        
        System.out.printf("Boolean bool = !((( true ^ false) || false ) && true ) = ");
        Boolean bool = !((( true ^ false) || false ) && true );
        System.out.printf( "%s", bool );
        System.out.printf( "\n\n\n");

        
        
        System.out.printf("Boolean bool34 = (( false || false) == ( false ^ false )) = ");
        
        Boolean bool34 = (( false || false) == ( false ^ false ));
        System.out.printf( "%s", bool34 );
        System.out.printf( "\n\n\n");
        
        
        
        System.out.printf("String svf = \"abcd\" + 1234; = ");
        
        String svf = "abcd" + 1234;
        System.out.printf( "%s", svf );
        System.out.printf( "\n\n\n");

        
        
        System.out.printf( "haracter cvf = (char)( 5 + 'L' ); = ");
        
        Character cvf = (char)( 5 + 'L' );
        System.out.printf( "%c", cvf );
        
        System.out.printf( "\n\nErklärung", cvf );
        System.out.printf( "L: char = %c | int = %d ", (char)'L', (int)'L');
        System.out.printf( "l: char = %c | int = %d ", (char)'l', (int)'l');
        
        System.out.printf( "\n\n\n");
         

        
        
        System.out.printf( "int valdf = (char)( (byte)(1) + (short)(1) + 1L ); = ");
        
        int valdf = (char)( (byte)(1) + (short)(1) + 1L );
        System.out.printf( "%d", valdf );
        System.out.printf( "\n\n\n");

        
        
        System.out.printf( "----- Seite 12 -----\n\n");

        
        
        System.out.println( "char chz = (char)( 'e' + 2*('b'-'a') ); = ");
        
        char chz = (char)( 'e' + 2*('b'-'a') );
        System.out.printf( "%c", chz );
        System.out.printf( "\n\n\n");

        
        
        System.out.printf( "int valju = (byte)( 131313 %% 13 < 0\r\n"
                + "        ? 1D * 1F\r\n"
                + "        : 1d + 1f + 01 + 0x1 + 0b1\r\n"
                + "        ); = ");
        
        int valju = (byte)( 131313 % 13 < 0
        ? 1D * 1F
        : 1d + 1f + 01 + 0x1 + 0b1
        );
        System.out.printf( "%d", valju );
        
        System.out.printf( "\n\nErklärung" );
        System.out.printf( "\n131313 %% 13 = %d ; also: %b ", (131313 % 13), (131313 % 13 < 0));
        System.out.printf( "\n 1d (double) = %f; 1f (float) = %f; 01 (int) = %d; 0x1 (hex) = %x; 0b1 (binär) = %d;", 1d, 1f, 01, 0x1, 0b1);
        
        System.out.printf( "\n\n\n");

        
        
        System.out.printf( "byte valnb = (byte)( Character.MIN_VALUE * Long.MAX_VALUE ); = ");
        
        byte valnb = (byte)( Character.MIN_VALUE * Long.MAX_VALUE );
        System.out.printf( "%x", valnb );
        System.out.printf( "\n\n\n");

        
        
        System.out.printf( "int valmkj = (int)( ( 2 * (3/1) * (float)( 3/2 ))); = ");
        
        int valmkj = (int)( ( 2 * (3/1) * (float)( 3/2 )));
        System.out.printf( "%d", valmkj );
        System.out.printf( "\n\n\n");

        
        
        System.out.printf( "long valsw = (Float.NEGATIVE_INFINITY < Float.POSITIVE_INFINITY) ? -1 : +1; = ");
        
        long valsw = (Float.NEGATIVE_INFINITY < Float.POSITIVE_INFINITY) ? -1 : +1;
        System.out.printf( "%d", valsw );
        System.out.printf( "\n\n\n");

        System.out.printf( "----- Seite 13 -----\n\n");

        
        
        System.out.printf( " int valde = 1*2*3/*4*5*/+6; = ");
        
        int valde = 1*2*3/*4*5*/+6;
        System.out.printf( "%d", valde );
        System.out.printf( "\n\n\n");

        
        
        System.out.println( "Byte bon = (byte)( Byte.MIN_VALUE < Character.MIN_VALUE ? 0%1 : 1%0 ) = ");
        
        Byte bon = (byte)( Byte.MIN_VALUE < Character.MIN_VALUE ? 0%1 : 1%0 );
        System.out.printf( "%s", bon );
        System.out.printf( "\n\n\n");

        
        
        System.out.printf( "Void von = null; = ");
        
        Void von = null;
        System.out.print( von );
        System.out.printf( "\n\n\n");

        System.out.printf( "----- Seite 14 -----\n\n");

        
        
        System.out.printf( "Boolean boolon = !((( true ^ false) || false ) && true ); = ");
        Boolean boolon = !((( true ^ false) || false ) && true );
        System.out.printf( "%s", boolon );
        System.out.printf( "\n\n\n");

        
        
        System.out.printf( " Boolean boolom = !(( true ^ false) != ( true != false )) ? null : true|false; = ");
        Boolean boolom = !(( true ^ false) != ( true != false )) ? null : true|false;
        System.out.printf( "%s", boolom ); 
        System.out.printf( "\n\n\n");

        
        
        System.out.printf( "String ser = \"z\" + 0; = ");
        String ser = "z" + 0;
        System.out.printf( "%s", ser );
        System.out.printf( "\n\n\n");

        
        
        System.out.println( "Character cer = (char)( 0 + 'z' ); = ");
        Character cer = (char)( 0 + 'z' );
        System.out.printf( "%c", cer );
        System.out.printf( "\n\n\n");

        
        
        System.out.printf( "int valer = (short)(1) + (char)(1); = ");
        int valer = (short)(1) + (char)(1);
        System.out.printf( "%d", valer );
        System.out.printf( "\n\n\n");

        
        
        System.out.println( "char cwe = (char)( 'z' - 2*('y'-'x') ); = ");
        
        char cwe = (char)( 'z' - 2*('y'-'x') );
        System.out.printf( "%c", cwe );
        System.out.printf( "\n\n\n");

        System.out.printf( "----- Seite 15 -----\n\n");

        
        
        System.out.println( "byte valwe = (byte)( 171717%17 < 17\r\n"
                + "        ? 1D*1F\r\n"
                + "        : Float.NEGATIVE_INFINITY / Double.POSITIVE_INFINITY\r\n"
                + "        ); = ");
        
        byte valwe = (byte)( 171717%17 < 17
        ? 1D*1F
        : Float.NEGATIVE_INFINITY / Double.POSITIVE_INFINITY
        );
        System.out.printf( "%d", valwe );
        System.out.printf( "\n\n\n");

        
        
        System.out.printf( "byte valqw = (byte)( (0x7e & 0xbd &0xdb & 0xe7 ) ^ 0xc3 ); = ");
        
        byte valqw = (byte)( (0x7e & 0xbd &0xdb & 0xe7 ) ^ 0xc3 );
        System.out.printf( "%x", valqw );
        System.out.printf( "\n\n\n");

        
        
        System.out.printf( "long valgh = ( Long.MAX_VALUE + Long.MIN_VALUE );\r\n"
                + "        if( valgh < Long.MIN_VALUE ){ System.out.printf( \"k\" ); \r\n"
                + "        }else if( valgh > Long.MAX_VALUE ){ System.out.printf( \"g\" ); \r\n"
                + "        }else{ System.out.printf( \"d\" ); = ");
        
        long valgh = ( Long.MAX_VALUE + Long.MIN_VALUE );
        if( valgh < Long.MIN_VALUE ){ System.out.printf( "k" ); 
        }else if( valgh > Long.MAX_VALUE ){ System.out.printf( "g" ); 
        }else{ System.out.printf( "d" ); 
        } 
        System.out.printf( "\n\n\n");
        
        
        System.out.printf( "long valjn = (Long.MIN_VALUE >>> 63) - (Long.MIN_VALUE >> 63); = ");
        
        long valjn = (Long.MIN_VALUE >>> 63) - (Long.MIN_VALUE >> 63);
        System.out.printf( "%d", valjn ); 
        System.out.printf( "\n\n\n");
        
        
        
        System.out.printf( "int valnj = 6>>>5 > 4 ? 3 >> 2 : 1 >>> 0; = ");
        
        int valnj = 6>>>5 > 4 ? 3 >> 2 : 1 >>> 0;
        System.out.printf( "%d", valnj ); 
        System.out.printf( "\n\n\n");

        
        
        System.out.println("Byte brt = (byte)( Byte.MIN_VALUE < Character.MIN_VALUE ? 0%1 : 1%0 ); = ");
        
        Byte brt = (byte)( Byte.MIN_VALUE < Character.MIN_VALUE ? 0%1 : 1%0 );
        System.out.printf( "%s", brt );
        System.out.printf( "\n\n\n");

        
        
        System.out.printf("int valrt = 1<<2 != 2>>1 ? 1<<2 : 2>>>1 = ");
        
        int valrt = 1<<2 != 2>>1 ? 1<<2 : 2>>>1;
        System.out.printf( "%d", valrt ); 
        System.out.printf( "\n\n\n");
        
        
        
        System.out.printf( "----- Seite 16 -----\n\n");

        System.out.printf( "Boolean a = !(-4>-5) ? (!true^!!true)||true : null; = ");
        Boolean abd = !(-4>-5) ? (!true^!!true)||true : null;
        System.out.printf( "%s", abd );
        System.out.printf( "\n\n\n");
        
        System.out.printf( "\nErklärung");
        System.out.printf( "\nBoolean ist Wrapper-Klasse und kann 'null' annehmen");
        
        
        
        System.out.printf( "byte b = 98765%%43 == 47 ? (byte)(1D*1.0/(1-1L)) : (byte)(0/11); = ");
        byte drill = 98765%43 == 47 ? (byte)(1D*1.0/(1-1L)) : (byte)(0/11);
        System.out.printf( "%d", drill );
        
                
        int fdrill = 98765%43 == 47 ? (int)(1D*1.0/(1-1L)) : (int)(0/11);
        System.out.printf( "%d", fdrill );
        
        System.out.printf( "\n\n\n");
        
        

        
        System.out.printf( "byte c = (byte)((0x81|0x42|0x24|0x18)^0x3c); = ");
        byte cgh = (byte)((0x81|0x42|0x24|0x18)^0x3c);
        System.out.printf( "%x", cgh );
        System.out.printf( "\n\n\n");
        
        System.out.printf( "\nErklärung");
        System.out.printf("\n 0x81 | 0x42 | 0x24 | 0x18 ) ^ 0x3c"
                + "         * \r\n"
                + "         * Bitwise Zuordnung: \r\n"
                + "         * 0x81 =      1000 0001\r\n"
                + "         * 0x42 =    | 0100 0010  | = OR-Verknüpfung\r\n"
                + "         * 0x24 =    | 0010 0100  | = OR-Verknüpfung\r\n"
                + "         * 0x18 =    | 0001 1000  | = OR-Verknüpfung\r\n"
                + "         *----------------------\r\n"
                + "         *             1111 1111\r\n"
                + "         * 0x3c =    ^ 0011 1100  ^ = XOR-Verknüpfung\r\n"
                + "         * ---------------------\r\n"
                + "         * Ergebnis:   1100 0011");

        
        
        
        System.out.printf( "int d = (Character.MAX_VALUE - Character.MIN_VALUE) >>> 15 ; = ");
        int djh = (Character.MAX_VALUE - Character.MIN_VALUE) >>> 15 ;
        System.out.printf( "%d", djh );
        System.out.printf( "\n\n\n");

        
        
        
        System.out.printf( "int e = Short.MIN_VALUE >> 17; = ");
        int ejh = Short.MIN_VALUE >> 17;
        System.out.printf( "%d", ejh );
        
        System.out.printf( "\nErklärung");
        System.out.printf( "\r\n"
                + ">> (vorzeichenbehaftet): Führt bei negativen Zahlen zu führenden Einsen, bei positiven Zahlen zu führenden Nullen.\r\n"
                + ">>> (vorzeichenlos): Führt immer zu führenden Nullen, unabhängig vom Vorzeichen.");
        System.out.printf( "\n\nBEISPIELE");
        System.out.printf( "\n\6 >> 5:\r\n"
                + "Binär: 0000 0110 >> 5 = 0000 0000 (0)\r\n"
                + "3 >> 2:\r\n"
                + "Binär: 0000 0011 >> 2 = 0000 0000 (0)\r\n"
                + "-6 >> 5:\r\n"
                + "Binär: 1111 1010 >> 5 = 1111 1111 (-1)\r\n"
                + "-3 >> 2:\r\n"
                + "Binär: 1111 1101 >> 2 = 1111 1111 (-1)");
        System.out.printf( "\n\n\n");

        
        
        
        System.out.printf( "----- Seite 17 -----\n\n");

        System.out.printf( "boolean a = (false == !false) ? (!false^!!false)&&false : true!=!true; = ");
        boolean ajh = (false == !false) ? (!false^!!false)&&false : true!=!true; 
        System.out.printf( "%b", ajh );
        System.out.printf( "\n\n\n");

        
        
        
        System.out.printf( "byte b = 1 - ( 1*1 - 1/1 )/*0*/*13; = ");
        byte ber = 1 - ( 1*1 - 1/1 )/*0*/*13;
        System.out.printf( "%b", ber );
        System.out.printf( "\n\n\n");

        
        
        
        System.out.printf( "char c = 'a'<'z' ? 'b'+1 : 'y'-1; = ");
        char cert = 'a'<'z' ? 'b'+1 : 'y'-1;
        System.out.printf( "%b", cert );
        System.out.printf( "\n\n\n");

        
        
        
        System.out.printf( "Byte dB = 4; Short dS = (short)((byte)3); Integer dI = (int)((byte)3); Long dL = (long)((char)3); Float dF = (float)3.0; Double dD = 3.0; byte d = (byte)((byte)(dB * (byte)(dS + dI + dL)) / (byte)(dF + dD));= ");
        Byte dB = 4; 
        Short dS = (short)((byte)3); 
        Integer dI = (int)((byte)3); 
        Long dL = (long)((char)3); 
        Float dF = (float)3.0; 
        Double dD = 3.0; 
        byte der = (byte)((byte)(dB * (byte)(dS + dI + dL)) / (byte)(dF + dD));
        System.out.printf( "%b", der );
        System.out.printf( "\n\n\n");

        
        
        
        System.out.printf( "short e = 1 > 0?8 >> 2:42 >>> 13-7; = ");
        short were = 1 > 0?8 >> 2:42 >>> 13-7;
        System.out.printf( "%b", were );
        System.out.printf( "\n\n\n");

        System.out.printf( "----- Seite 18 -----\n\n");

        
        
        
        System.out.printf( "String f = \"A\" + \"b\" + 'c' + 1; = ");
        String fere = "A" + "b" + 'c' + 1;
        System.out.printf( "%b", fere );
        System.out.printf( "\n\n\n");

        
        
        
        System.out.printf( "int g = (Double.NEGATIVE_INFINITY > Float.POSITIVE_INFINITY) ? (1-1)/(2>>2) : (2<<2)/(1+1);= ");
        int gere = (Double.NEGATIVE_INFINITY > Float.POSITIVE_INFINITY) ? (1-1)/(2>>2) 
         : (2<<2)/(1+1); 
        System.out.printf( "%b", gere );
        System.out.printf( "\n\n\n");

        System.out.printf( "double h = (byte)((( 0xA5 | 0x5A ) & 0x18 ) ^ 0x32 ); = ");
        double here = (byte)((( 0xA5 | 0x5A ) & 0x18 ) ^ 0x32 );
        System.out.printf( "%b", here );
        System.out.printf( "\n\n\n");

        
        
       /* 
        System.out.printf( "Integer i = (long)((Long.MAX_VALUE ^ Long.MIN_VALUE) * Character.MIN_VALUE); = ");
        Integer iere = (long)((Long.MAX_VALUE ^ Long.MIN_VALUE) * Character.MIN_VALUE);
        System.out.printf( "%b", iere );
        System.out.printf( "\n\n\n");
        */
        
        
        
        System.out.printf( "Void j = null; = ");
        Void jere = null; 
        System.out.printf( "%b", jere );
        System.out.printf( "\n\n\n");

        
        
        
        System.out.printf( "----- Seite 19 -----\n\n");

        System.out.printf( "float f = ((1.0/3.0)*3.0)>10.0 ? Float.NaN*Float.NEGATIVE_INFINITY : 1f; = ");
        float fsere = ((1.0/3.0)*3.0)>10.0 ? Float.NaN*Float.NEGATIVE_INFINITY : 1f;
        System.out.printf( "%.2f", fsere ); 
        System.out.printf( "\n\n\n");

        
        
        
        System.out.printf( "Byte g = (byte)( (Long.MAX_VALUE ^ Long.MIN_VALUE) * Character.MIN_VALUE ); = ");
        Byte grill = (byte)( (Long.MAX_VALUE ^ Long.MIN_VALUE) * Character.MIN_VALUE );
        System.out.printf( "%s", grill );
        System.out.printf( "\n\n\n");

        
        
        
        System.out.printf( "char h = (char)( 'a' + 2*('y'-'w') ); = ");
        char hrill = (char)( 'a' + 2*('y'-'w') );
        System.out.printf( "%c", hrill );
        System.out.printf( "\n\n\n");

        
        
        
        System.out.printf( "float i = (float)( (3/2)*(4/3)*(8/4) ); = ");
        float irill = (float)( (3/2)*(4/3)*(8/4) );
        System.out.printf( "%.2f", irill ); 
        System.out.printf( "\n\n\n");

        
        
        
        System.out.printf( "Void j = null; = ");
        Void jrule = null;
        System.out.print( jrule ); 
        System.out.printf( "\n\n\n");

        System.out.printf( "----- Seite 20 -----\n\n");

        System.out.printf( "for ( char a=Character.MAX_VALUE; a++ > Character.MIN_VALUE; ) System.out.printf( \"%%d \", (long)a ); = ");
        for ( char arule =Character.MAX_VALUE; arule++ > Character.MIN_VALUE; ) 
         System.out.printf( "%d ", (long)arule ); 
        System.out.printf( "\n\n\n");

        
        
        
        System.out.printf( "for ( int b : new int[]{ 16, 32, 48, 64 } ) System.out.printf( \"%%x \", b ); = ");
        for ( int brule : new int[]{ 16, 32, 48, 64 } ) System.out.printf( "%x ", brule ); 
        System.out.printf( "\n\n\n");

        
        
        
        System.out.printf( "byte c=0x11; do System.out.printf( \"%%d \", c ); while( --c>0xab ); = ");
        byte crule=0x11; 
        do System.out.printf( "%d ", crule ); while( --crule>0xab );
        
        
        System.out.printf( "long dreal = 4;\r\n"
                + "        do { System.out.printf( \"%%d \", dreal ); } while( dreal-- - --dreal > 1<<2 ); = ");
        long dreal = 4;
        do { System.out.printf( "%d ", dreal ); } while( dreal-- - --dreal > 1<<2 );
        
        
         
        
    }//main
}//class
