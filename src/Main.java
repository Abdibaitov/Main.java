import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Shark[] sharks = new Shark[5];
        Turtle[] turtles = new Turtle[5];
        Eagle[] eagles = new Eagle[5];

        Animal[] animals ={
                new Shark("Sharrk"),
                new Shark("Sharrk"),
                new Shark("Shark"),
                new Shark("Sharvdfk"),
                new Shark("Shak"),
                new Eagle("Eagle"),
                new Eagle("Eagle"),
                new Eagle("Eagle"),
                new Eagle("Eagle"),
                new Eagle("Eagle"),
                new Turtle("Tur"),
                new Turtle("Tue"),
                new Turtle("Turt"),
                new Turtle("Turtle"),
                new Turtle("T"),


        };
        int t = 0;
        int e = 0;
        int s = 0;
        for(Animal animal: animals){
            if(animal instanceof Turtle){
                ((Turtle)animal).swim();
                turtles[t] = (Turtle) animal;
                t++;

            }
            else if(animal.getClass().getName().equals("Shark")){
                ((Shark)animal).attack();
                sharks[s] = (Shark) animal;
                s++;
            }
            else if(animal instanceof Eagle){
                ((Eagle)animal).fly();
                eagles[e] = (Eagle) animal;
                e++;
            }
        }
        System.out.println(Arrays.toString(sharks));
        System.out.println(Arrays.toString(turtles));
        System.out.println(Arrays.toString(eagles));

    }
}
