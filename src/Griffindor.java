public class Griffindor extends Hogwarts{
    private int nobility;
    private int honor;
    private int bravery;

    public Griffindor (String name, int magicPower, int transgressionDist, int nobility, int honor, int bravery){
        super(name, magicPower, transgressionDist);
        this.nobility = nobility;
        this.bravery = bravery;
        this.honor = honor;
    }

    public void compareStudent (Griffindor student){
        int firstStudent = student.getBravery()+student.getHonor()+student.getNobility();
        int secondStudent = this.getBravery()+this.getNobility()+this.getHonor();
        if (firstStudent != secondStudent) {
            if (firstStudent > secondStudent) System.out.println("First student is a better student than second");
            else System.out.println("Second student is a better student than first");
        } else System.out.println(" First and second students are equally good students");
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }
}
