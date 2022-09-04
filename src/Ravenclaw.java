public class Ravenclaw extends Hogwarts{

    private int creativity;
    private int wisdom;
    private int wit;
    private int cleverness;

    public Ravenclaw(String name, int magic, int transgression, int creativity, int wisdom, int wit, int cleverness) {
        super(name, magic, transgression);
        this.creativity = creativity;
        this.wisdom = wisdom;
        this.wit = wit;
        this.cleverness = cleverness;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCleverness() {
        return cleverness;
    }

    public void setCleverness(int cleverness) {
        this.cleverness = cleverness;
    }

    public int ability() {
        return creativity + wisdom + wit + cleverness;
    }

    public void compareRavenclaw(Ravenclaw ravenclaw) {
        int ability1 = ability();
        int ability2 = ravenclaw.ability();
        if (ability1 > ability2) {
            System.out.printf("Когтевранец %s лучше, чем когтевранец %s: %d VS %d%n", getName(), ravenclaw.getName(), ability1, ability2);
        } else if (ability2 > ability1) {
            System.out.printf("Когтевранец %s лучше, чем когтевранец %s: %d VS %d%n", ravenclaw.getName(), getName(), ability1, ability2);
        }
        else {
            System.out.printf("Когтевранец %s такой же, как когтевранец %s: %d VS %d%n", ravenclaw.getName(), getName(), ability1, ability2);
        }
    }

    @Override
    public String toString() {
        return String.format("%s; благородство: %d; честь: %d; храбрость: %d", super.toString(), creativity, wisdom, wit, cleverness);
    }

}
