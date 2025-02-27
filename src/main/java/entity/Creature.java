package main.java.entity;

public abstract class Creature extends Entity {
    private Integer speed;
    private Integer health;
    public abstract void makeMove();

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    public Integer getHealth() {
        return health;
    }

    public void setHealth(Integer health) {
        this.health = health;
    }
}
