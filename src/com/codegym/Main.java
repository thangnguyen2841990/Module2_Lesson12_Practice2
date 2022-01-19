package com.codegym;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Student student1 = new Student("Thắng",31,"Hà Nội");
        Student student2 = new Student("Cường",21,"Thái Bình");
        Student student3 = new Student("Thủy", 30, "Nam Đinh");
        // HashMap
        Map<Integer,Student> studentMap = new HashMap<>();
        studentMap.put(1,student1);
        studentMap.put(2,student2);
        studentMap.put(3,student3);
        for (Map.Entry<Integer,Student> entry:studentMap.entrySet()) {
            System.out.println(entry.getKey()+". "+ entry.getValue());
        }
        System.out.println("HashSet");
        Set<Student> studentSet = new HashSet<Student>();
        studentSet.add(student1);
        studentSet.add(student2);
        studentSet.add(student3);
        for (Student student: studentSet) {
            System.out.println(student);
        }
    }
}
