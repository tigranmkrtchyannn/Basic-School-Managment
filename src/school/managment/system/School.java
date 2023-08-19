package school.managment.system;

import java.util.List;

public class School {
    private List<Teacher> teachers;
    private List<Student> students;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;

    /**
     * new school object is created.
     *  @param teachers list of the teachers in the school.
     * @param students list of the students in the school.
     */
    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned = 0;
        totalMoneySpent = 0;

    }

    /**
     *
     * @return the list of the tachers in the school.
     */
    public List<Teacher> getTeachers() {
        return teachers;
    }

    /**
     * add the teacher to the school.
     * @param teacher the teacher to be added.
     */
    public void setTeachers(Teacher teacher) {
      teachers.add(teacher);
    }

    /**
     *
     * @return the list of the Students in the school.
     */
    public List<Student> getStudents() {
        return students;
    }

    /**
     * Adding the students int the school.
     * @param student the student to be  add.
     */
    public void setStudents(Student student) {
        students.add(student);
    }

    /**
     * @return the total manrey earned by the school.
     */
    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    /**
     * Adds the totsl money earned by the school.
     * @param MoneyEarned  money that is supposed to be added.
     */
    public static  void updatdeTotalMoneyEarned(int MoneyEarned) {
        totalMoneyEarned = totalMoneyEarned+MoneyEarned;

    }

    /**
     *
     * @return the total money spent by the school.
     *
     */
    public static int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    /**
     * update the money that is spent by the school which
     * is the sallary gives by the school to its teachetrs.
     * @param MoneySpent the money to spent by the school.
     */
    public static  void updateTotalMoneySpent(int MoneySpent) {

        totalMoneySpent -= MoneySpent;
    }
}
