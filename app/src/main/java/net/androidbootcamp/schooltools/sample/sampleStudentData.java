package net.androidbootcamp.schooltools.sample;

import net.androidbootcamp.schooltools.model.Students;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class sampleStudentData {
    public static List<Students> studentsList;
    public static Map<String, Students> studentsMap;

    static {
        studentsList = new ArrayList<>();
        studentsMap = new HashMap<>();


    }

}

