package com.saran.espressodemo;

import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;

/**
 * Created by Saran on 12/10/16.
 */

@RunWith(AndroidJUnit4.class)
public class MainActivityTest {
    @Rule public final ActivityTestRule<MainActivity> main = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void shouldBeAbleToLaunchMainScreen(){
        onView(ViewMatchers.withText("Hello World!")).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }

    @Test
    public void shouldBeAbleToClickFab(){
        onView(ViewMatchers.withId(R.id.fab)).perform(ViewActions.click());
    }

    @Test
    public void verifyButtonClick(){
        onView(ViewMatchers.withId(R.id.editText)).perform(ViewActions.click());
        onView(ViewMatchers.withId(R.id.editText)).perform(ViewActions.typeText("Testing"));
        onView(ViewMatchers.withId(R.id.button)).perform(ViewActions.click());
        onView(ViewMatchers.withId(R.id.textView3)).check(ViewAssertions.matches(ViewMatchers.withText("Testing")));
    }
}
