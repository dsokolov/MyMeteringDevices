package me.ilich.mymeteringdevices.ui;

import android.support.test.InstrumentationRegistry;
import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.test.ActivityInstrumentationTestCase2;

import org.junit.Before;

import me.ilich.mymeteringdevices.R;

public class ActivityTestCase extends ActivityInstrumentationTestCase2<MainActivity> {

    private MainActivity mActivity;

    public ActivityTestCase() {
        super(MainActivity.class);
    }

    @Before
    public void setUp() throws Exception {
        super.setUp();
        injectInstrumentation(InstrumentationRegistry.getInstrumentation());
        mActivity = getActivity();
    }

    public void testA() {
        Espresso.onView(ViewMatchers.withId(R.id.version)).perform(ViewActions.click());
    }

}
