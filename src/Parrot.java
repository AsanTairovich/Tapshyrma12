import java.util.Objects;

public class Parrot {
    private String where;
    private String color;
    int age ;
    String talents;

    public String getWhere() {
        return where;
    }

    public void setWhere(String where) {
        this.where = where;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTalents() {
        return talents;
    }

    public void setTalents(String talents) {
        this.talents = talents;
    }
    public void bird (){
        if (where.equals( "Africa")){
            System.out.println(where +" Ал жакта учуучу жана учпоочу Тоту куштар барю.");
        } else if (where.equals("America")) {
            System.out.println(where + " Тоту куштардын коп турлору бар.");
        } else if (where.equals("Australia")) {
            System.out.println(where + " Ал жакта Жырткыч Тоту куштарды кездештирууго болот");

        }
    }
}
