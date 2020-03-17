package fr.umlv.fight;

import java.util.Objects;

/**
 * @desc TD5 - Robot
 * @author Nicolas SENECAL
 */
public class Robot {

  private String name;
  private int life;

  public Robot(String name) {
    this.name = Objects.requireNonNull(name, "Name can not be null");
    this.life = 10;
  }

  public void fire(Robot target) throws Exception {
    if (!this.rollDice()) {
      System.out.println(this + " à raté sa cible.");
      return;
    }
    
    if (target.isDead()) {
      throw new Exception("On ne tire pas sur un robot mort ! - Code de déontologie des robots art.58-6");
    }
    target.life -= 2;
    System.out.println(target + " a été touché par le " + this + " !");
  }

  public boolean isDead() {
    return this.life <= 0;
  }

  public boolean rollDice() {
    return true;
  }

  @Override
  public String toString() {
    return "Robot " + this.name;
  }

  public String name() {
    return this.name;
  }

  public int life() {
    return this.life;
  }
}
