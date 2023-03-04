public class Turtle extends Animal{
    private String name;

    public Turtle(String name) {
        this.name = name;
    }

    public Turtle(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void swim(){
        System.out.println("Turtle is swimming ");
    }

    @Override
    public String toString() {
        return "Turtle{" +
                "name='" + name + '\'' +
                '}';
    }
}
