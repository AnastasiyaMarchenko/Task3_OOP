import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Human h1 = createHuman();
        Human h2 = createHuman();
        Human child = testOnСompatibility(h1,h2);
        if(child  == null) {
            System.out.println("Divorce ");
        }else {
            System.out.println(child.toString());
        }

    }

    public static Human createHuman (){

        Scanner scanner  = new Scanner(System.in);
        System.out.println("Input gender true for man, and false for woman");
        boolean gender = scanner.nextBoolean();
        System.out.println("Input name ");
        String name = scanner.next();
        System.out.println("Input surname ");
        String surname = scanner.next();
        System.out.println("Input height ");
        Float height = scanner.nextFloat();
        System.out.println("Input weight ");
        Float weight = scanner.nextFloat();

        if (gender == true){
            return new Man(name,surname,height,weight);
        } else {
            return new Woman(name,surname,height,weight);
        }
    }

    public static Human testOnСompatibility (Human h1, Human h2){
        return h1.relationship(h2);
    }
}

/*
 
Необходимо написать консольное приложение, в котором сначала нужно ввести значения свойств, для двух экземпляров людей
(женщины и мужчины в произвольном порядке, возможны варианты ЖЖ, МЖ, ЖМ и ММ).
Затем программа должна провести тест на совместимость и дать прогноз на результат отношений двух данных экземпляров. Алгоритм следующий:
1. Метод “тест на совместимость” принимает два экземпляра людей и должен возвратить экземпляр человека или null.
2. Вызвать метод “иметь отношения” первого экземпляра человека с аргументом - второй экземпляр.
3. Полученный результат вернуть как результат работы метода “тест на совместимость”.

*/