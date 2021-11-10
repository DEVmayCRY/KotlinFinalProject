package service

import junit.framework.Assert.assertEquals
import org.junit.Test



internal class CourseServiceTest
{
    @Test

    fun showSummaryTest ()
    {
        var Sum = CourseService()

        assertEquals(null, Sum.getCourse("INTRO-CS-666"))
        //assertEquals(null, Sum.getCourse("INTRO-CS-4"))
    }

}