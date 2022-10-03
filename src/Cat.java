import java.awt.image.BufferedImage;

public class Cat extends Actor implements actorBehaviour{
  public Cat(Cell loc, BufferedImage img, String desc, Player player) {
    super(loc, img, desc, player, 3);
  }

  @Override
  public void controlAble() {
    // TODO Auto-generated method stub
    
  }
}
