package net.callas1900.tataku;

import junit.framework.Assert;

import net.callas1900.tataku.pocket.PocketManager;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

import static org.junit.Assert.*;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class, sdk = 19)
public class BasicTest {
    // As a user
    // I want to connect Pocket.
    // so that I realize all future.
    @Test
    public void mainTest() throws Exception {
        PocketManager manager = new PocketManager();
        Assert.assertTrue(manager.testConnection());
    }
}