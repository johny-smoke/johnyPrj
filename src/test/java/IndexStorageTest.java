import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IndexStorageTest {

    @Test
    public void testIndxGet(){
        IndexStorage indxs = new IndexStorage(5);
        int actGet = indxs.get(3);
        int expGet = -3;
        Assertions.assertEquals(expGet, actGet);
    }

    @Test
    public void testIndxReverse(){
        IndexStorage indxs = new IndexStorage(5);
        int[] actIndxReverse = indxs.reverse();
        int[] expIndxReverse = new int[]{4,-3,2,-1,0};
        for (int i = 0; i < indxs.size(); i++){
            Assertions.assertEquals(expIndxReverse[i], actIndxReverse[i]);
        }
    }

    @Test
    public void testArrayGet(){
        IndexStorage array = new ArrayIndexStorage(new int[] {0,1,2,3,4,5,6,7,8,9});
        int actGet = array.get(7);
        int expGet = 7;
        Assertions.assertEquals(expGet, actGet);
    }

    @Test
    public void testArrayReverse(){
        IndexStorage array = new ArrayIndexStorage(new int[] {0,1,2,3,4,5,6,7,8,9});
        int[] actArrayReverse = array.reverse();
        int[] expArrayReverse = new int[]{9,8,7,6,5,4,3,2,1,0};
        for (int i = 0; i < array.size(); i++) {
            Assertions.assertEquals(expArrayReverse[i], actArrayReverse[i]);
        }
    }

}
