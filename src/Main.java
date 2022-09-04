import java.util.Random;

public class Main {

    private static final Random RANDOM = new Random();
    public static void main(String[] args) {

        Gryffindor harry = generateGryffindor("Гарри Поттер");
        Slytherin draco = generateSlytherin("Драко Малфой");
        Gryffindor germiona = generateGryffindor("Гермиона");
        Hufflepuff malkolm = generateHufflepuff("Малькольм Прис");
        Ravenclaw orla = generateRavenclaw("Орла Свирк");

        harry.print();
        draco.print();
        germiona.print();
        malkolm.print();
        orla.print();

        harry.compareHogwarts(orla);
        germiona.compareGryffindor(harry);
        orla.compareHogwarts(malkolm);
    }

    private static Gryffindor generateGryffindor(String name) {
        return new Gryffindor(
                name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
        );
    }

    private static Hufflepuff generateHufflepuff(String name) {
        return new Hufflepuff(
                name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
        );
    }

    private static Ravenclaw generateRavenclaw(String name) {
        return new Ravenclaw(
                name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
        );
    }

    private static Slytherin generateSlytherin(String name) {
        return new Slytherin(
                name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
        );
    }
}