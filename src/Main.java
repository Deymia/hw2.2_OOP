public class Main {
    public static void main(String[] args) {
        Griffindor[] griffindor = {
                new Griffindor("Harry Potter", 95, 70, 91, 85, 98),
                new Griffindor("Hermiona Granger", 80, 80, 95, 95, 90),
                new Griffindor("Ron Weasley", 70, 65, 75, 87, 80)};

        Slytherin[] slytherin = {
                new Slytherin("Draco Malfoy", 90, 87, 95, 95, 70),
                new Slytherin("Gregory Goyle", 65, 50, 45, 45, 60),
                new Slytherin("Graham Montague", 78, 75, 65, 85, 88)};

        Hufflepuff[] hufflepuff = {
                new Hufflepuff("Zacharias Smith", 81, 69, 84, 30, 44),
                new Hufflepuff("Cedric Diggory", 86, 85, 94, 98, 94),
                new Hufflepuff("Justin Finch-Fletchley", 70, 62, 74, 73, 80)};

        Ravenclaw[] ravenclaw = {
                new Ravenclaw("Cho Chang", 76, 68, 84, 76, 87),
                new Ravenclaw("Padma Patil", 71, 66, 73, 69, 78),
                new Ravenclaw("Marcus Belby", 61, 52, 55, 59, 68)};

        PrintStudents printStudents = new PrintStudents();
        printStudents.printGriffindor(griffindor);
        printStudents.printSlytheryn(slytherin);
        printStudents.printHufflepuff(hufflepuff);
        printStudents.printRavenclaw(ravenclaw);


        griffindor[0].compareStudent(griffindor[1]);
        slytherin[1].compareStudent(slytherin[2]);
        ravenclaw[0].compareStudent(ravenclaw[2]);
        hufflepuff[0].compareStudent(hufflepuff[1]);

        griffindor[0].compareStudents(slytherin[0]);
    }
}