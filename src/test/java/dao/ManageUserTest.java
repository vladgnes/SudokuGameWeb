package dao;

import static org.junit.Assert.*;
import org.junit.Test;

public class ManageUserTest {

    @Test
    public void manageUserLoginTest() {
        assertEquals("Vlad",new ManageUser().login("Vlad","Hnes").getUsername());
    }

    @Test
    public void manageUserRegistryTet(){
        assertEquals(false, new ManageUser().registry("Vlad","Hnes", "Vlad"));
    }

}
