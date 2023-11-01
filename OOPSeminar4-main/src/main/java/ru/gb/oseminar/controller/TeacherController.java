package ru.gb.oseminar.controller;

import ru.gb.oseminar.data.Teacher;
import ru.gb.oseminar.service.TeacherService;
import ru.gb.oseminar.view.TeacherView;

import java.time.LocalDate;

public class TeacherController implements UserController<Teacher> {
    private final TeacherService dataService = new TeacherService();
    private final TeacherView teacherView = new TeacherView();

    public TeacherService getDataService() {
        return dataService;
    }

    @Override
    public void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        dataService.create(firstName, secondName, patronymic, dateOfBirth);
        teacherView.sendOnConsole(dataService.getAll());
    }
}
