import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;


class SumTest {

  @Test
  public void returnSum() throws Exception{
    List<Integer> testList = new ArrayList<>();
    testList.add(5);
    testList.add(10);
    Sum sum = new Sum();
    assertEquals(15, sum.returnSum(testList));
    assertTrue(15 == sum.returnSum(testList));
  }

}