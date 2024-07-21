package CodeSchnipsel;
import java.util.*;

public class magicE {
       
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
        
}//magicE
