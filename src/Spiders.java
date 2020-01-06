public class Spiders extends CreepyCrawlies {
    public boolean eightLegs;
    public boolean noWings;

    public Spiders(int age, String color, double weight, boolean endangered, boolean sleeping, boolean eightLegs, boolean noWings) {
        super(age, color, weight, false, sleeping, true, true);
        this.eightLegs = eightLegs;
        this.noWings = noWings;
    }


    public void setEightLegs(boolean eightLegs) {
        this.eightLegs = eightLegs;
    }

    public void setNoWings(boolean noWings) {
        this.noWings = noWings;
    }

    public boolean isEightLegs() {
        return eightLegs;
    }

    public boolean isNoWings() {
        return noWings;
    }



    @Override
    public String sleep() {
        return super.sleep();
    }

    public String eat() {
        return "Flies";
    }

    public String move() {
        return "https://www.youtube.com/watch?v=fZQXmfAfJoU";
    }

    public String doSomething() {
        return "browse the web";
    }
}
