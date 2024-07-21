package CodeFragmente;
import java.util.*;

public class FragmentMethoden {


    //WAS MACHT DIESE METHODE?
    public int magicE( int x ) {
        Map<Long,String> map = null;

        for( int stillToDo=x; --stillToDo>0; ){
            map = new HashMap<Long,String>();
            Long someValue = 1L * ( x % stillToDo) +1;

            do{
                someValue++;
            } while( map.containsKey( someValue ));

            map.put( someValue, someValue.toString() );
        }//for


        System.out.printf( "%d", magicE( 17 ));

        return map.size();

    }//method()

    
    //MAGIC 2
    //    System.out.printf( "%d", magic( 4 ) );

    public int magicT( int p ){
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
    
    
    
    
    

    //Vereinfachen Sie den Methoden-Rumpf:

    //CHECK STATE
    public boolean isStateOk(){
        if( false != checkState() ){
            return false;
        }else if( true != checkState() ){
            return true;
        }//if
        return false;
    }//method()

    public boolean checkState(){
        return true;
    }


    //COMPUTE
    public int compute( int a, int b ){
        for( int i=0; i<b; i++ ){
            a+=3;
        }//for
        return a;
    }//method()

    
    
    //TESTFRUIT

    //        (c) Der enum Fruit sei wie beschrieben gegeben. Vereinfachen Sie den Methoden-Rumpf:
    enum Fruit { APPLE, LEMON, ORANGE }
    
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


    //MAGIC
    // System.out.printf( "%d", magic( 4 ) );
    
    public int magic( int p ){
        int x = 0;
        int y = p;
        do{
            x++;
            --y;
        }while( x<y );
        return x;
    }//method()

    
    //magic
    
//System.out.printf( "%s", magicre() );
    public String magicre(){
        final String a = "1";
        final int b = 2;
        final char c = 3;
        return c + b + a;
    }//method()

    
    //MEHR MAGIC
    
    public int magiczt( int p ){
        int w = 0;
        for( int i=0; i<p; i++ ){
            w = w + 2*i;
        }//for
        return w;
    }//method()

  //  System.out.printf( "%d", magiczt( 4 ) );

// MEHR MAGIC

    //System.out.printf( "%d", magicew( 4 ) );
    
    public int magicew( int p ){
        int a = 0;
        int b = 3;
        do{
            a++;
            --b;
        }while( a<b );
        return b;
    }//method()




    
    
    
    //SWITCHCASE
    
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
    
    
    
    


}//magicE
