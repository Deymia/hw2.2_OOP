public class Hufflepuff extends  Hogwarts{
    private int diligence;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String name, int magicPower, int transgressionDist, int diligence, int loyalty, int honesty) {
        super(name, magicPower, transgressionDist);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public void compareStudent (Hufflepuff student){
        int firstStudent = student.getDiligence()+student.getHonesty()+student.getLoyalty();
        int secondStudent = this.getDiligence()+this.getLoyalty()+this.getHonesty();
        if (firstStudent != secondStudent) {
            if (firstStudent > secondStudent) System.out.println("First student is a better student than second");
            else System.out.println("Second student is a better student than first");
        } else System.out.println(" First and second students are equally good students");
    }

    public int getDiligence() {
        return diligence;
    }

    public void setDiligence(int diligence) {
        this.diligence = diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }
}
