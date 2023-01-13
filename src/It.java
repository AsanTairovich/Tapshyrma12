public class It {
    private String name;
    private String poroda;

    public String getPoroda() {
        return poroda;
    }

    public void setPoroda(String poroda) {
        this.poroda = poroda;
    }

    private int jashy;
   private String tusu;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getJashy() {
        return jashy;
    }

    public void setJashy(int jashy) {
        this.jashy = jashy;
    }

    public String getTusu() {
        return tusu;
    }

    public void setTusu(String tusu) {
        this.tusu = tusu;
    }

    public void it(){
        if (jashy <= 2){
            System.out.println("Менин итим буйрук аткарганды уйроно элек");
        } else if (jashy > 2 && jashy <= 6 ) {
            System.out.println("Менин итим бардык буйруктарынызды аткара алат");
        }
        else {
            System.out.println("Менде андай итим жок");
        }
    }
}
