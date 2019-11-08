public class Man extends Human {


    public Man(String name, String surname, float height, float weight) {
        super(true, name, surname, height, weight);
    }

    @Override
    public Human relationship(Human human) {
        if (gender == human.gender) {
            return null;
        }
        if (speak(human) == true && sustainSociety(human) == true && spendTimeTogether(human) == true) {
            return ((Woman) human).giveBirth(this);
        } else {
            return null;
        }
    }
}
