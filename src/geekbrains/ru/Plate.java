package geekbrains.ru;

public class Plate {
    public int food;

    public Plate(int food)
    {
        this.food = food;
    }

    public void decreaseFood(int val, Cat cat)
    {
        if(this.food >= val )
        {
            this.food -= val;
            cat.setFull(true);
        }

    }

    public void increaseFood(int val)
    {
        if(val > 0)
        {
            this.food += val;
        }
    }

    public void info()
    {
        System.out.println("Plate has " + food + " left");
    }
}
