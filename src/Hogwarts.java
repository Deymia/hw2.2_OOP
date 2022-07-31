public class Hogwarts {
    private String name;
    private int magicPower;
    private int transgressionDist;

    public Hogwarts(String name, int magicPower, int transgressionDist) {
        this.name = name;
        this.magicPower = magicPower;
        this.transgressionDist = transgressionDist;
    }

    public void compareStudents (Hogwarts student){

            int firstStudent = student.getMagicPower()+student.getTransgressionDist();
            int secondStudent = this.getMagicPower()+this.getTransgressionDist();
            if (firstStudent != secondStudent) {
                if (firstStudent > secondStudent) System.out.println("First student is a better student than second");
                else System.out.println("Second student is a better student than first");
            } else System.out.println(" First and second students are equally good students");
        }


    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public int getTransgressionDist() {
        return transgressionDist;
    }

    public void setTransgressionDist(int transgressionDist) {
        this.transgressionDist = transgressionDist;
    }
}
