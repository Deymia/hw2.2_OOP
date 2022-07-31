public class PrintStudents {

    public void printGriffindor (Griffindor[] griffindor){
        for (int i = 0; i < griffindor.length; i++) {
            Griffindor Griffindor = griffindor [i];
            if (Griffindor.getName()!= null) {
                System.out.println("Name: " + Griffindor.getName() +
                        "; Magic Power: " + Griffindor.getMagicPower() +
                        "; Transgression Distance: " + Griffindor.getTransgressionDist() +
                        "; Nobility: " + Griffindor.getNobility() +
                        "; Honor: " + Griffindor.getHonor() +
                        "; Bravery: " + Griffindor.getBravery());
            } else System.out.println("Error");

        }
    }

    public void printSlytheryn (Slytherin[] slytherin){
        for (int i = 0; i < slytherin.length; i++) {
            Slytherin Slytherin = slytherin [i];
            if (Slytherin.getName()!= null) {
                System.out.println("Name: " + Slytherin.getName() +
                        "; Magic Power: " + Slytherin.getMagicPower() +
                        "; Transgression Distance: " + Slytherin.getTransgressionDist() +
                        "; Ambition: " + Slytherin.getAmbition() +
                        "; Determination: " + Slytherin.getDetermination() +
                        "; Sly: " + Slytherin.getSly());
            } else System.out.println("Error");

        }

    }

    public void printHufflepuff (Hufflepuff[] hufflepuff){
        for (int i = 0; i < hufflepuff.length; i++) {
            Hufflepuff Hufflepuff = hufflepuff[i];
            if (Hufflepuff.getName()!= null) {
                System.out.println("Name: " + Hufflepuff.getName() +
                        "; Magic Power: " + Hufflepuff.getMagicPower() +
                        "; Transgression Distance: " + Hufflepuff.getTransgressionDist() +
                        "; Diligence: " + Hufflepuff.getDiligence() +
                        "; Honesty: " + Hufflepuff.getHonesty() +
                        "; Loyalty: " + Hufflepuff.getLoyalty());
            } else System.out.println("Error");

        }

    }

    public void printRavenclaw (Ravenclaw[] ravenclaw){
        for (int i = 0; i < ravenclaw.length; i++) {
            Ravenclaw Ravenclaw = ravenclaw[i];
            if (Ravenclaw.getName()!= null) {
                System.out.println("Name: " + Ravenclaw.getName() +
                        "; Magic Power: " + Ravenclaw.getMagicPower() +
                        "; Transgression Distance: " + Ravenclaw.getTransgressionDist() +
                        "; Creative: " + Ravenclaw.getCreative() +
                        "; Smart: " + Ravenclaw.getSmart() +
                        "; Wise: " + Ravenclaw.getWise());
            } else System.out.println("Error");

        }

    }
    }

