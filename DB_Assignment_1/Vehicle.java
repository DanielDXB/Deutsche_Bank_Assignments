package Ex2;

public abstract class Vehicle implements Comparable {
    private String color;
    private boolean functional;

    public Vehicle() {
        this.color = "No Color";
        this.functional = false;
    }

    public Vehicle(String color, boolean functional) {
        this.color = color;
        this.functional = functional;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFunctional() {
        return functional;
    }

    public void setFunctional(boolean functional) {
        this.functional = functional;
    }

    public abstract int charge();

    public abstract int profit();

    public abstract void display();

    @Override
    public int compareTo(Object o) {
        return this.profit() - ((Vehicle) o).profit();
    }
}
