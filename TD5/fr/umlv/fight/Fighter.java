package fr.umlv.fight;

import java.util.Random;

/**
 * @desc TD5 - Fighter
 * @author Nicolas SENECAL
 */
public class Fighter extends Robot {

  private Random randomGenerator;

  public Fighter(String name, int seed) {
    super(name);
    this.randomGenerator = new Random(seed);

  }

  @Override
  public boolean rollDice() {
    return randomGenerator.nextBoolean();
  }

  @Override
  public String toString() {
    return "Fighter " + this.name();
  }
}
