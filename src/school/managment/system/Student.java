package school.managment.system;

public class Student {
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    /**
     * To create the student by initalization.
     * Fees for every student is $30,0000.
     * Fees pay initialy is 0.
     * @param id id for the student is unique.
     * @param name name of the student.
     * @param grade grade of the student.
     */
    public Student(int id,String name,int grade){
        this.feesTotal = 30000;
        this.feesPaid = 0;
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    /**
     * used to update the student's grade
     * @param grade new grade of the student
     */
    public void setGrade(int grade){
        this.grade =  grade;
}

    /**
     * keep adding the fees to feesPaid Field.
     * Add the fees to the fees paid.
     * the school is goinf recive the fonds.
     * @param fees the fees that the student pays.
     */
    public void updateFeesPaid(int fees){

        this.feesPaid = fees+feesPaid;
        School.updatdeTotalMoneyEarned(feesPaid);
}

    /**
     *
     * @return  id of the student.
     * */
    public int getId() {
        return id;
    }

    /**
     *
     * @return name of the student.
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return grade of the Student
     */
    public int getGrade() {
        return grade;
    }

    /**
     *
     * @return fees Paid of the student.
      */
    public int getFeesPaid() {
        return feesPaid;
    }

    /**
     *
     * @return Fees Total of the student.
     */
    public int getFeesTotal() {
        return feesTotal;
    }

    /**
     *
     * @return the remaining fees.
     */
    public int getRemainingFees(){
        return feesTotal - feesPaid;
}

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                ", feesPaid=" + feesPaid +
                ", feesTotal=" + feesTotal +
                '}';
    }
}
