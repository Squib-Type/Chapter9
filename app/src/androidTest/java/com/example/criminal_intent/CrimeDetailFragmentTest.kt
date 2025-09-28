package com.example.criminal_intent

import androidx.fragment.app.testing.FragmentScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.runners.AndroidJUnit4
import junit.framework.TestCase.assertTrue
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4::class)
class CrimeDetailFragmentTest {

    private lateinit var scenario: FragmentScenario<CrimeDetailFragment>

    @Before
    fun setUp() {

        scenario = FragmentScenario.launchInContainer(CrimeDetailFragment::class.java)

    }

    @After
    fun tearDown() {
        scenario.close()
    }

    @Test
    fun crimeSolvedIsUpdated() {
        onView(withId(R.id.crime_solved)).perform(click())
        scenario.onFragment { fragment ->
            assertTrue(fragment.crime.isSolved)

        }
    }
}