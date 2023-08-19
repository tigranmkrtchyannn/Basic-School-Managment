package school.managment.system;

/**
 * This class is responsible for keeping track
 * of teacher's name, id, sallary.
 *
 */
public class Teacher {
    private  int id;
    private  String name;
    private int sallary;
    private int sallaryEarned;

    /**
     * Create new Teacher object.
     * @param id id of the teacher.
     * @param name name of the tecaher.
     * @param sallary sallary of the teacher.
     *
     */
    public Teacher(int id,String name, int sallary){
        this.id = id;
        this.name = name;
        this.sallary = sallary;
        this.sallaryEarned=0;

    }

    /**
     *
     * @return id of the teacher.
     */
     public int getId(){
        return this.id;
     }

    /**
     *
     * @return name of te teacher.
     */
    public  String getName(){
        return this.name;
    }

    /**
     *
     * @return sallaery of the teacher.
     */
    public int getSallary() {
        return this.sallary;

    }

        public void setSallary (int sallary){
            this.sallary = sallary;
        }

    /**
     * Add tpo sallary.
     * Remove total money earned to the school.
     * @param sallary
     */


    public void reciveSallary(int sallary){
this.sallaryEarned+=sallary;
School.updateTotalMoneySpent(sallary);
        }

    }
