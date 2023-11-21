package ru.gb.oseminar.view;


import ru.gb.oseminar.data.Teacher;

import java.util.List;
import java.util.logging.Logger;

public class TeacherView implements UserView<Teacher> {
    //Реализация принципа ISP
    Logger logger = Logger.getLogger(TeacherView.class.getName());
    @Override
    public void sendOnConsole(List<Teacher> list) {
        for(Teacher user: list){
            logger.info(user.toString());
        }
    }
}
