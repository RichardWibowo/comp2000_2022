import java.awt.image.BufferedImage;

public class Bird extends actorBot {
  public Bird(Cell loc, BufferedImage img, String desc, Player player) {
    super(loc, img, desc, player, 2);
    strat = new EscapeMove();
  }
}
