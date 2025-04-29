public class Superviser extends Person {
    private int  experience ;

    public Superviser(String name,int experience){
        super( name );
        this.experience=experience;
    }


    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getExperience() {
        return experience;
    }

    public String toString() {
        return "Supervisor: " + name + ", Experience: " + experience + " years";
    }

}
