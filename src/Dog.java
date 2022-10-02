import java.awt.image.BufferedImage;

public class Dog extends actorBot {
  public Dog(Cell loc, BufferedImage img, String desc, Player player) {
    super(loc, img, desc, player, 1);
    strat = new ChaseMove();
  }
}
