public class Ravenclaw extends Hogwarts{
    private int smart;
    private int wise;
    private int creative;

    public Ravenclaw(String name, int magicPower, int transgressionDist, int smart, int wise, int creative) {
        super(name, magicPower, transgressionDist);
        this.smart = smart;
        this.wise = wise;
        this.creative = creative;
    }

    public void compareStudent (Ravenclaw student){
        int firstStudent = student.getCreative()+student.getSmart()+student.getWise();
        int secondStudent = this.getCreative()+this.getWise()+this.getSmart();
        if (firstStudent != secondStudent) {
            if (firstStudent > secondStudent) System.out.println("First student is a better student than second");
            else System.out.println("Second student is a better student than first");
        } else System.out.println(" First and second students are equally good students");
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public int getCreative() {
        return creative;
    }

    public void setCreative(int creative) {
        this.creative = creative;
    }
}
