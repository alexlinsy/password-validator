package ca.dal.csci3130.passwordvalidator;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.clearText;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;


@RunWith(AndroidJUnit4.class)
public class PasswordScreenTest {


    @Rule
    public ActivityTestRule<MainActivity> mActivityRule =
            new ActivityTestRule(MainActivity.class);

    @Test
    public void validButtonClick() {

        //Test a not strong password
        onView(withId(R.id.passwordText)).perform(typeText("lsy123456"));
        onView(withId(R.id.passwordText)).perform(closeSoftKeyboard());
        onView(withId(R.id.validateButton)).perform(click());
        onView(withId(R.id.resultTextView)).check(matches(withText("The password is not strong")));

        //Test a strong password
        onView(withId(R.id.passwordText)).perform(clearText(), typeText("Lsy123456."));
        onView(withId(R.id.passwordText)).perform(closeSoftKeyboard());
        onView(withId(R.id.validateButton)).perform(click());
        onView(withId(R.id.resultTextView)).check(matches(withText("The password is strong")));

    }
}


