public class Principal extends Person {
    private int experience;

    public Principal(String name, int age, int experience) {
        super(name, age);
        this.experience = experience;
    }

    @Override
    public String toString() {
        return super.toString() + ", Experience: " + experience + " years";
    }
}
