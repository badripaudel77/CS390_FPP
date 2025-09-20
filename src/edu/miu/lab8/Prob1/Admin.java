package edu.miu.lab8.Prob1;
import java.util.*;
public class Admin {
	public static HashMap<Key, Student> processStudents(List<Student> students) {
        HashMap<Key, Student> studentMap = new HashMap<>();
        if (students == null) return studentMap; // safe null list

        for (Student student : students) {
            if (student != null) {
                Key key = new Key(student.getFirstName(), student.getLastName());
                studentMap.put(key, student);
            }
        }
        return studentMap;
	}
}
