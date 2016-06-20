package Homework6.Exercise5;


public abstract class MusicalInstrument {

    protected String name;

    public String getName() {
        return name;
    }

    public void setNameinstrument(String instrument) {
        this.name = instrument;
    }

    public MusicalInstrument(String name) {
        this.name = name;
    }

    public void price() {
        System.out.println(name + ": MUSIC");
    }

    @Override
    public String toString() {
        return name;
    }
}