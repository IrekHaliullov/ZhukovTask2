package main.java.entity;

public class Predator extends Creature {

    private Integer attackPower;

    public Predator(Integer attackPower, Integer speed, Integer health) {
        this.attackPower = attackPower;
        super.setSpeed(speed);
        super.setHealth(health);
    }

    public Predator() {
    }

    @Override
    public void makeMove() {

    }

    public void attack() {

    }

    @Override
    public String getImage() {
        return EntityImage.PREDATOR.getShortName();
    }
}
