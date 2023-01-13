public class Myshyk {
    private String name;
    private int age;
    private double weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void checkup() {
        if (age == 1 && weight >= 0.100 && weight <= 1.000) {
            System.out.println(name + " " + age + " жашта. Cалмагы " + weight + "г");
        } else if (age > 1 && age <= 3 && weight > 1.000 && weight < 4.000) {
            System.out.println(name + " " + age + " жашта. Cалмагы " + weight + "г");
        } else if (age > 3 && age <= 15 && weight >= 4.000 && weight < 15.000) {
            System.out.println(name + " " + age + " жашта. Cалмагы " + weight + "г");
        } else {
            System.out.println("Жер жузундо андай мышык жок.\n Жашына жараша салмак бериниз");
        }
    }
}
