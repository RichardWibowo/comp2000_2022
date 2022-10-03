import java.awt.image.BufferedImage;

import actor_temp.Actor;

public class Bird extends Actor implements actorBehaviour{
  public Bird(Cell loc, BufferedImage img, String desc, Player player) {
    super(loc, img, desc, player, 2);
    strat = new EscapeMove();
  }

  @Override
  public void controlAble() {
    // TODO Auto-generated method stub
    
  }
}
