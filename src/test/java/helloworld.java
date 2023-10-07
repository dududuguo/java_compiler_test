import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class helloworld {

    private int inputA;
    private int inputB;
    private int[] swappedValues;

    public helloworld(int inputA, int inputB) {
        this.inputA = inputA;
        this.inputB = inputB;
        swappedValues = new int[]{inputA, inputB};
        H h = new H();
        h.swap(swappedValues);
    }

    @Parameterized.Parameters
    public static List<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {1, 2},
                {2, 3},
                {3, 4}
        });
    }

    @Test
    public void testSwap() {
        assertEquals(inputA, swappedValues[1]);
        assertEquals(inputB, swappedValues[0]);

    }
}

class H {
    public void swap(int[] values) {
        int temp = values[0];
        values[0] = values[1];
        values[1] = temp;
    }
}
