package dempStreams;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MainClass {
    public static void main(String[] args) {
        Student student1 = new Student(
                "Jayesh",
                20,
                new Address("1234"),
                Arrays.asList(new MobileNumber("1233"), new MobileNumber("1234")));

        Student student2 = new Student(
                "Khyati",
                20,
                new Address("1235"),
                Arrays.asList(new MobileNumber("1111"), new MobileNumber("3333"), new MobileNumber("1233")));

        Student student3 = new Student(
                "Jason",
                20,
                new Address("1236"),
                Arrays.asList(new MobileNumber("3333"), new MobileNumber("4444")));

        List<Student> students = Arrays.asList(student1, student2, student3);
        for(Student x: students)
        System.out.println(x);
        List<Student> results=students.stream().filter(x->x.getMobileNumbers().stream().anyMatch(p->p.getNumber().equalsIgnoreCase("3333"))).collect(Collectors.toList());
        for(Student re: results)

        System.out.println("\n"+re);
    }
}
