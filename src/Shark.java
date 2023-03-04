public class Shark extends Animal{

    private String name;

    public Shark(String name) {
        this.name = name;
    }

    public Shark() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void attack(){
        System.out.println("Shark is attacking ");
    }

    @Override
    public String toString() {
        return "Shark{" +
                "name='" + name + '\'' +
                '}';
    }
}
