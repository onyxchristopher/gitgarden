import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class DistributorTest {

    @Test(timeout = 50)
    public void TestgetUser_name() {
        Distributor temp = new Distributor("temp_name", "temp_address", null);
        assertEquals("temp_name", temp.getUser_name());
    }

    @Test(timeout = 50)
    public void TestgetUser_address() {
        Distributor temp = new Distributor("temp_name", "temp_address", null);
        assertEquals("temp_address", temp.getUser_address());
    }

    @Test(timeout = 50)
    public void TestgetRequests() {
        Distributor temp = new Distributor("temp_name", "temp_address", null);
        assertNull(temp.getRequests());

    }
}