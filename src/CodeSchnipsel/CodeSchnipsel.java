package CodeSchnipsel;

public class CodeSchnipsel {

    public static void main(String[] args) {



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
        

        
        System.out.printf("float j = (float)( (3/2)*(4/3)*(8/4) );  = "); 
        float j = (float)( (3/2)*(4/3)*(8/4) );
        System.out.printf( "%.2f", j );

        System.out.printf( "\n\n\n"); 
        

        
        System.out.printf("Void jj = null; = "); 
        Void jj = null;
        System.out.print( jj );

        System.out.printf( "\n\n\n"); 
        
        

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

        


        
        System.out.printf("int gc = ( 1 << 16 ) - Character.MAX_VALUE;  = "); 
        int gc = ( 1 << 16 ) - Character.MAX_VALUE;
        System.out.printf( "%d", gc );


        System.out.printf( "\n\n\n"); 

        

        
        System.out.printf("long hc = (Float.NEGATIVE_INFINITY == Float.POSITIVE_INFINITY) ? -1 : +1;  = "); 
        long hc = (Float.NEGATIVE_INFINITY == Float.POSITIVE_INFINITY) ? -1 : +1;
        System.out.printf( "%d", hc );

        System.out.printf( "\n\n\n"); 

        

        
        System.out.printf("double ic = (double)( (13/7)*(7/5)*(5/3) ) + 0.5F;  = "); 
        double ic = (double)( (13/7)*(7/5)*(5/3) ) + 0.5F;
        System.out.printf( "%.2f", ic );

        System.out.printf( "\n\n\n"); 

        

        
        System.out.printf("Void jc = null;  = "); 
        Void jc = null;
        System.out.print( jc );

        System.out.printf( "\n\n\n"); 

        

        
        System.out.printf("String sc = \"a\" + 3;  = "); 
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

        System.out.printf( "\n\n\n"); 

        

        
        System.out.printf("long valgt = (Long.MIN_VALUE >>> 63) - (Long.MIN_VALUE >> 63);  = "); 
        long valgt = (Long.MIN_VALUE >>> 63) - (Long.MIN_VALUE >> 63);
        System.out.printf( "%d", valgt );

        System.out.printf( "\n\n\n"); 

        

        
        System.out.printf("int valwfe = 1*2*3/*4*5*/+6;  = "); 
        int valwfe = 1*2*3/*4*5*/+6;
        System.out.printf( "%d", valwfe );

        System.out.printf( "\n\n\n"); 
        


        System.out.printf("long vagtel = (Float.NEGATIVE_INFINITY < Float.POSITIVE_INFINITY) ? -1 : +1 = "); 
        long vagtel = (Float.NEGATIVE_INFINITY < Float.POSITIVE_INFINITY) ? -1 : +1;
        System.out.printf( "%d", vagtel );

    }//main
}//class
