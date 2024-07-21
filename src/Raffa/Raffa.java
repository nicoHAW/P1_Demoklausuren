package Raffa;

public class Raffa {
    
    public static void main(String[] args) {

    System.out.printf("byte valg = (byte)( 414141%%41 < 41) ? 1F*1D : Float.NEGATIVE_INFINITY / Double.POSITIVE_INFINITY = "); 
    byte valg = (byte)( 414141%41 < 41  //kann gar nicht 41 sein, daher auf jeden fall kleiner
            ? 1F*1D                     //1F = 1Float, 1D = 1Double, 1*1 = 1
            : Float.NEGATIVE_INFINITY / Double.POSITIVE_INFINITY 
            );
    System.out.printf("%d", valg );
    System.out.println("\n\nErklärung: 1F = 1Float, 1D = 1Double, 1*1 = 1");
    
    
    
    
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
            + "         * 0x87 =    ^ 1000 0111  ^ = XOR-Verknüpfung\r\n"
            + "         * ---------------------\r\n"
            + "         * Ergebnis:   1000 0111");
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
     * 0x87 =    ^ 1000 0111
     * ---------------------
     * Ergebnis:   1000 0111
     * 
     */
    
    
    System.out.printf("\n\n\n"); 
    
    
    
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
    
    
    System.out.printf("int fa = Character.MAX_VALUE | 0xFF000000 | 0x00FF0000;  = "); 
    int fa = Character.MAX_VALUE | 0xFF000000 | 0x00FF0000;
    System.out.printf( "%d", fa );

    System.out.printf( "\n\n\n"); 
    
    
    System.out.printf("int gc = ( 1 << 16 ) - Character.MAX_VALUE;  = "); 
    int gc = ( 1 << 16 ) - Character.MAX_VALUE;
    System.out.printf( "%d", gc );

    System.out.printf("\n\nErklärung");
    
    System.out.printf("\n Character.MAX_VALUE = %d", (int)Character.MAX_VALUE);
    System.out.printf("\n Character.MAX_VALUE als Bit = %s", Integer.toBinaryString(Character.MAX_VALUE));
    System.out.printf("\n Character.MAX_VALUE als Hex = 0x%X ", (int) Character.MAX_VALUE);
    
    System.out.printf("\n\n 1 << 16 = %d", (int)Character.MAX_VALUE);
    System.out.printf("\n 1 << 16 als Bit = %s", Integer.toBinaryString(1 << 16));
    System.out.printf("\n 1 << 16 als Hex = 0x%X", (int)(1 << 16));
    
    
    
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
    
    
    }
    
}
