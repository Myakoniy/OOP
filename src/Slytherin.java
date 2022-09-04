public class Slytherin extends Hogwarts{

    private int determination;
    private int ambition;
    private int thirstForPower;
    private int cunning;
    private int ingenuity;

    public Slytherin(String name, int magic, int transgression,
                     int determination, int ambition, int thirstForPower,
                     int cunning, int ingenuity) {
        super(name, magic, transgression);
        this.determination = determination;
        this.ambition = ambition;
        this.thirstForPower = thirstForPower;
        this.cunning = cunning;
        this.ingenuity = ingenuity;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    public void setThirstForPower(int thirstForPower) {
        this.thirstForPower = thirstForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getIngenuity() {
        return ingenuity;
    }

    public void setIngenuity(int ingenuity) {
        this.ingenuity = ingenuity;
    }

    public int ability() {
        return ingenuity + ambition + thirstForPower + cunning + determination;
    }

    public void compareSlytherin(Slytherin slytherin) {
        int ability1 = ability();
        int ability2 = slytherin.ability();
        if (ability1 > ability2) {
            System.out.printf("Слизеринец %s лучше, чем слизеринец %s: %d VS %d%n", getName(), slytherin.getName(), ability1, ability2);
        } else if (ability2 > ability1) {
            System.out.printf("Слизеринец %s лучше, чем слизеринец %s: %d VS %d%n", slytherin.getName(), getName(), ability1, ability2);
        }
        else {
            System.out.printf("Слизеринец %s такой же, как слизеринец %s: %d VS %d%n", slytherin.getName(), getName(), ability1, ability2);
        }
    }

    @Override
    public String toString() {
        return String.format("%s; благородство: %d; честь: %d; храбрость: %d", super.toString(), determination, ambition, thirstForPower, cunning, ingenuity);
    }

}