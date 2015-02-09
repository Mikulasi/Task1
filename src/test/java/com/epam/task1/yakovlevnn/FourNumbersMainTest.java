package com.epam.task1.yakovlevnn;

import org.junit.Assert;
import org.junit.Test;

public class FourNumbersMainTest extends FourNumbersMain {

//    @Test
//    public void testMain() {
//        FourNumberLogic fnl = new FourNumberLogic();
//        Assert.assertEquals("[4,5,6,3] have to be equals ",true,fnl.fourNumberLogic(new int[]{4,5,6,3}));
//        Assert.assertEquals("[3,-3,6,-6] have to be equals",true, fnl.fourNumberLogic(new int[]{3, -3, 6, -6}));
//        Assert.assertEquals("[0,0,0,0] have to be equals",true,fnl.fourNumberLogic(new int[]{0,0,0,0}));
//        Assert.assertEquals("[0,0,0,0] have to be equals",true,fnl.fourNumberLogic(new int[]{Integer.MAX_VALUE - 1,0,0,2147483647 - 1}));
//        Assert.assertNotEquals("[4,5,6,2] have not to be equals",true,fnl.fourNumberLogic(new int[]{4,5,6,2}));
//    }

    @Test
    public void testInt(){
        FourNumberLogic fnl = new FourNumberLogic();
        Assert.assertEquals(true,fnl.fourNumberLogic(4563));
        Assert.assertEquals(true,fnl.fourNumberLogic(2314));
        Assert.assertEquals(true,fnl.fourNumberLogic(8255));
        Assert.assertFalse(fnl.fourNumberLogic(4562));
    }
}