package geekbrains.ru;

public class Cat {
    public String name;
    private int appetite;

    private boolean isFull;

    public Cat(String name, int appetite)
    {
        this.name = name;
        this.appetite = appetite;
        this.isFull = false;
    }

    public void eat(Plate plate)
    {
        plate.decreaseFood(appetite, this);
    }

    public void setFull(boolean isFull)
    {
        this.isFull = isFull;
    }

    public boolean getFull()
    {
        return this.isFull;
    }

}
