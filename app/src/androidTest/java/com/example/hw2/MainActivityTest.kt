package com.example.hw2

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.doesNotExist
import androidx.test.espresso.matcher.ViewMatchers.withText
import org.junit.Rule
import android.content.pm.ActivityInfo
import androidx.test.core.app.ActivityScenario

import androidx.test.espresso.matcher.ViewMatchers.withId
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun socialAccount_shouldNotExist() {
        onView(withText("kao_905")).check(doesNotExist())
        @Test
        fun image_is_not_displayed_in_landscape() {
            val scenario = ActivityScenario.launch(MainActivity::class.java)

            scenario.onActivity { activity ->
                activity.requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE
            }

            onView(withId(R.id.profileImage)).check(doesNotExist())
        }
    }
}