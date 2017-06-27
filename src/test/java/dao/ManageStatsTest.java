package dao;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManageStatsTest {

    @Test
    public void setWinTest() {
        ManageStats manageStats = new ManageStats();
        manageStats.setWins(1);
    }

    @Test
    public void setCountTest() {
        ManageStats manageStats = new ManageStats();
        manageStats.setCount(1);
    }

    @Test
    public void setAvgTimeTest() {
        ManageStats manageStats = new ManageStats();
        manageStats.setAvgTime(1);
    }

    @Test
    public void setAvgStepTimeTest() {
        ManageStats manageStats = new ManageStats();
        manageStats.setAvgStepTime(1);
    }

    @Test
    public void setUsernameTest() {
        ManageStats manageStats = new ManageStats();
        manageStats.setUsername("sd");
    }

    @Test
    public void getWinTest() {
        assertEquals(1, new ManageStats().getWins("Vlad"));
    }

    @Test
    public void getCountTest() {
        assertEquals(1, new ManageStats().getCount("Vlad"));
    }

    @Test
    public void getAvgTimeTest() {
        assertEquals(1, new ManageStats().getAvgTime("Vlad"));
    }

    @Test
    public void getAvgStepTimeTest() {
        assertEquals(1, new ManageStats().getAvgStepTime("Vlad"));
    }







}
