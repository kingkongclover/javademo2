package main;


public class Hedgehog {
    private String name;
    private int age;
    private String puhe;

    public Hedgehog() {
        name = "Pikseli";
        age = 5;
    }

    public Hedgehog(String nameParameter, int ageParameter) {
        name = nameParameter;
        age = ageParameter;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public void speak(String puheParametri) {
        if(puheParametri.isBlank()){
            System.out.println("Olen " + name + " ja ikäni on " + age + " vuotta, mutta antaisitko silti syötteen?");
        } else {
        puhe = puheParametri;
        System.out.println(name + ": " + puhe);
        }
    }

    public void juokse() {
        System.out.println(name + " juoksee kovaa vauhtia!");
    }
}
