package com.se459;

import static org.junit.Assert.assertEquals;

import com.se459.floor.FloorTile;
import com.se459.floor.interfaces.ISurfaces;

import org.junit.Test;

public class FloorTileTest {

    @Test
    public void testGetMethodsSuccess() {
        ISurfaces testTile = new FloorTile(1, "bare", true, false);
        String testType;
        int testCost;
        boolean testDirty1;
        boolean testDirty2;
        boolean testHasStation;

        testType = testTile.getSurfaceType();
        testCost = testTile.getSurfaceCost();
        testDirty1 = testTile.hasDirt();
        testHasStation = testTile.hasChargeStation();

        testTile.updateCleanStatus(false);
        testDirty2 = testTile.hasDirt();

        assertEquals("bare", testType);
        assertEquals(1, testCost);
        assertEquals(true, testDirty1);
        assertEquals(false, testHasStation);
        assertEquals(false, testDirty2);
    }
    
}