import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        It it = new It();
        it.setName("Рекс");
        it.setPoroda("Немецкая овчарка");
        it.setJashy(3);
        it.setTusu("Кара-Сары ");
        System.out.println("Итимдин аты " + it.getName());
        System.out.println("Итим " + it.getJashy() + " жашта");
        System.out.println("Итимдин тусу " + it.getTusu());
        System.out.println("Породасы " + it.getPoroda());
        it.it();
        System.out.println("----------------------");

        Scanner scanner = new Scanner(System.in);
        Myshyk myshyk = new Myshyk();
        myshyk.setName("Tom");
        System.out.println("Мышыкыныздын жашы канчада");
        myshyk.setAge(scanner.nextInt());
        System.out.println("Салмагы ");
        myshyk.setWeight(scanner.nextDouble());
        myshyk.checkup();
        System.out.println("------------------------");

        Fish fish = new Fish();
        fish.setAnimal("Суу жаныбары");
        fish.setName("Кит");
        fish.setLifeTime(50);
        fish.setAge(150);
        System.out.println(fish.getAnimal());
        System.out.println("Аты " + fish.getName());
        System.out.println("Жашоо мооноту " + fish.getLifeTime());
        System.out.println("Салмагы " + fish.getAge());
        System.out.println("--------------------------");

        Scanner sc = new Scanner(System.in);
        Parrot parrot = new Parrot();
        System.out.println("Учонун бирин тандап жазыныз   Africa    America   Australia ");
        parrot.setWhere(sc.nextLine());
        parrot.setColor("Ак-кара-сары-кызыл");
        parrot.setAge(3);
        parrot.setTalents("Сайраганды билет");
        System.out.println(parrot.getColor());
        System.out.println(parrot.getAge());
        System.out.println(parrot.getTalents());

    }
}