import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Exercise1 {

    @Test
    public void suma2numeros(){
        assertEquals(4, 2+2);
    }
	/** OK **/
    public void multiplica3numeros(int a, int b, int c){
        return (a * b * c);
    }

    @Test
    public void multiplica3numeros(){
        assertEquals(120, multiplica3numeros(3, 4, 10));
    }


}
