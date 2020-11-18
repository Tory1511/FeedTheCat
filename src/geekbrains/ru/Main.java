package geekbrains.ru;

public class Main {

    public static void main(String[] args) {

        Plate plate = new Plate(12);

        Cat[] cats;
        cats = new Cat[3];

        cats[0] = new Cat("Weesley", 4);
        cats[1] = new Cat("Boris", 10);
        cats[2] = new Cat("Lapkin", 2);

        plate.info();

        for (int i = 0; i < cats.length; i++)
        {
            cats[i].eat(plate);
            if (cats[i].getFull())
            {
                System.out.println(cats[i].name + " is full");
            }
            else
            {
                System.out.println(cats[i].name + " is hungry");
            }
            plate.info();

        }

        plate.increaseFood(70);

        plate.info();


    }
}
