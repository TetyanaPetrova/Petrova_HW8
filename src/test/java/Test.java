import org.testng.Assert;

public class Test {

    @Test
    public void testMethod(){
        int[][] array={{2,2,2},{2,2,2},{2,2,2}};

        for (int i = 0; i < array.length; i++) {
            int a = 0;
            for (int j = 0; j < array[i].length; j++) {
                a = a + array[i][j];
            }
            Assert.assertEquals(a,6);
        }
    }
}
