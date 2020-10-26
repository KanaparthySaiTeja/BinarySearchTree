
import org.junit.Test;
import org.junit.Assert;

public class BSTTest {
    @Test
    public void givenNodes_shouldReturnBST() {
        BinaryST bst = new BinaryST();
        bst.add(51);

        bst.add(32);
        bst.add(75);
        int size = bst.getSize();
        Assert.assertEquals(3,size);
    }


}