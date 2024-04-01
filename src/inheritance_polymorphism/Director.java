package inheritance_polymorphism;

public final class Director extends Manager {
    private double bonus;
    private float sharePercentage;
    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public float getSharePercentage() {
        return sharePercentage;
    }

    public void setSharePercentage(float sharePercentage) {
        this.sharePercentage = sharePercentage;
    }

    public static void main(String[] args) {

    }
}
