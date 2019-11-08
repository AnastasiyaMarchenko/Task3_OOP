import java.util.Scanner;

public class Woman extends Human {


    public Woman(String name, String surname, float height, float weight) {
        super(false, name, surname, height, weight);
    }

    @Override
    public Human relationship(Human human) {
        if (gender == human.gender) {
            return null;
        }
        if (speak(human) == true && sustainSociety(human) == true && spendTimeTogether(human) == true) {
            return giveBirth(human);
        } else {
            return null;
        }
    }

    public Human giveBirth (Human human){

        Scanner n = new Scanner(System.in);
        System.out.println("Input child name");
        String name = n.next();

        if (Math.random() < 0.5) {
            return new Woman(name, human.surname,this.height+0.1f*(human.height-this.height),this.weight+0.1f*(human.weight-this.weight));
        } else {
            return new Man(name,human.surname,height+0.1f*(this.height-height),weight+0.1f*(this.weight-weight));
        }
    }
}
