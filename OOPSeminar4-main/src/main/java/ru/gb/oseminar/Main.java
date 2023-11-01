package ru.gb.oseminar;

import ru.gb.oseminar.controller.StudentController;
import ru.gb.oseminar.controller.TeacherController;
import ru.gb.oseminar.data.Student;
import ru.gb.oseminar.data.StudentGroup;
import ru.gb.oseminar.data.Teacher;
import ru.gb.oseminar.service.StudentService;
import ru.gb.oseminar.service.TeacherService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public  static void main (String[] args){
        StudentController studentController = new StudentController();
        TeacherController teacherController = new TeacherController();
        StudentService studentService = new StudentService();
        TeacherService teacherService = new TeacherService();
        studentController.create("Andrei", "Andreev", "Andreevich", LocalDate.of(2000, 2, 17));
        studentController.create("Ivan", "Ivanov", "Ivanovich", LocalDate.of(2001, 5, 11));
        studentController.create("Petr", "Petrov", "Petrovich", LocalDate.of(1999, 12, 20));
        studentController.create("Andrei", "Petrov", "Ivanovich", LocalDate.of(2000, 2, 9));
        studentController.create("Petr", "Ivanov", "Andreevich", LocalDate.of(2000, 11, 25));
        studentController.create("Ivan", "Andreev", "Petrovich", LocalDate.of(2002, 9, 17));
        studentController.create("Petr", "Ivanov", "Petrovich", LocalDate.of(2003, 2, 1));
        teacherController.create("Alex", "Alexeev", "Alexeevich", LocalDate.of(1968,7,16));
        teacherController.create("Alex", "Alexeev", "Petrovich", LocalDate.of(1968,3,18));
        studentController.createStudentGroup(teacherController.getDataService().getAll(), studentController.getDataService().getAll());


//        StudentGroup studentGroup1 = new StudentGroup(teacher1,studentList1);
//        StudentGroup studentGroup2 = new StudentGroup(teacher2,studentList2);
    }
}
