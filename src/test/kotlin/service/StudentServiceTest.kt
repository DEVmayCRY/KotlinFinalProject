package service

import model.Student
import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals

internal class StudentServiceTest {

    @Test

    fun findStudentTest() {

        val findStudent = StudentService()

        val estudante = Student("39203", "Mateus", "maluco.teste@teste", null)

        findStudent.subscribeStudent(estudante)

        assertNotEquals(null, findStudent.findStudent("4002"))
    }

}