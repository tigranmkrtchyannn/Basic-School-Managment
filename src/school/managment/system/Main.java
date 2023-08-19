package school.managment.system;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){

        Teacher teacher1 = new Teacher(1,"Liza",50_000);
        Teacher teacher2 = new Teacher(2,"Ann",75_000);
        Teacher teacher3 = new Teacher(3,"Lily",35_000);
        Teacher teacher4 = new Teacher(4,"Jane",65_000);

        List<Teacher> teachers =  new ArrayList<>();
        teachers.add(teacher1);
        teachers.add(teacher2);
        teachers.add(teacher3);
        teachers.add(teacher4);

        Student student1 = new Student(1,"Karen",10);
        Student student2 = new Student(2,"john",8);
        Student student3 = new Student(3,"Anna",9);
        Student student4 = new Student(4,"Poxos",7);

         List<Student> students = new ArrayList<>();
         students.add(student1);
         students.add(student2);
         students.add(student3);
         students.add(student4);


        School mySchool = new School(teachers,students);

        student2.updateFeesPaid(5000);
          student1.updateFeesPaid(4500);
        System.out.println("School has earned " + mySchool.getTotalMoneyEarned());

      teacher1.reciveSallary(teacher1.getSallary());
        System.out.println("School has spent for sallary to "+teacher1.getName()+ " and now has " + mySchool.getTotalMoneyEarned() );
        System.out.println(student1.toString());
    }
}
