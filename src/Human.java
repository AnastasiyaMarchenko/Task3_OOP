import java.util.Random;

public abstract class Human {

    boolean gender;
    String name;
    String surname;
    float height;
    float weight;


    public Human(boolean gender, String name, String surname, float height, float weight) {
        this.gender = gender;
        this.name = name;
        this.surname = surname;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Human{" +
                "gender=" + gender +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }

    public boolean speak (Human human) {
        if (gender == true && human.gender == true) {
            return Math.random()< 0.5;
        } else {
            return true;
        }
    }

    public boolean sustainSociety (Human human){
        if (gender == false && human.gender == true || gender ==true && human.gender == false){
            return Math.random()<0.7;
        } else if (gender == false && human.gender == false) {
            return Math.random()< 0.05;
        } else {
            return Math.random() < 0.056;
        }
    }

    public boolean spendTimeTogether (Human human){
      float r =  (height*100)/human.height;
      float b = 100 - r;
        if (b < 10) {
            return Math.random() < 0.95;
        }  else{
            return Math.random() < 0.85;
        }
    }

    public abstract Human relationship (Human human);

}

