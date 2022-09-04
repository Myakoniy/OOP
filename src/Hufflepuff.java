public class Hufflepuff extends Hogwarts {

    private int diligence;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String name, int magic, int transgression, int diligence, int loyalty, int honesty) {
        super(name, magic, transgression);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
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

    private int ability() {
        return diligence + loyalty + honesty;
    }

    public void compareHufflepuff(Hufflepuff hufflepuff) {
        int ability1 = ability();
        int ability2 = hufflepuff.ability();
        if (ability1 > ability2) {
            System.out.printf("Пуффиндуец %s лучше, чем пуффиндуец %s: %d VS %d%n", getName(), hufflepuff.getName(), ability1, ability2);
        } else if (ability2 > ability1) {
            System.out.printf("Пуффиндуец %s лучше, чем пуффиндуец %s: %d VS %d%n", hufflepuff.getName(), getName(), ability1, ability2);
        }
        else {
            System.out.printf("Пуффиндуец %s такой же, как пуффиндуец %s: %d VS %d%n", hufflepuff.getName(), getName(), ability1, ability2);
        }
    }

    @Override
    public String toString() {
        return String.format("%s; благородство: %d; честь: %d; храбрость: %d", super.toString(), diligence, loyalty, honesty);
    }
}
