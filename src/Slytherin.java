public class Slytherin extends Hogwarts{
    private int sly;
    private int ambition;
    private int determination;

    public Slytherin(String name, int magicPower, int transgressionDist, int sly, int ambition, int determination) {
        super(name, magicPower, transgressionDist);
        this.sly = sly;
        this.ambition = ambition;
        this.determination = determination;
    }
    public void compareStudent (Slytherin student){
        int firstStudent = student.getAmbition()+student.getSly()+student.getDetermination();
        int secondStudent = this.getAmbition()+this.getDetermination()+this.getSly();
        if (firstStudent != secondStudent) {
            if (firstStudent > secondStudent) System.out.println("First student is a better student than second");
            else System.out.println("Second student is a better student than first");
        } else System.out.println(" First and second students are equally good students");
    }

    public int getSly() {
        return sly;
    }

    public void setSly(int sly) {
        this.sly = sly;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }
}
