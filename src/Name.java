import org.jointheleague.graphical.robot.Robot;

public class Name {
public static void main(String[] args) {
Robot bot = new Robot();
bot.penDown();
bot.setSpeed(10);
bot.move(200);
bot.turn(180);
bot.move(100);
bot.turn(-45);
bot.move(140);
bot.turn(180);
bot.move(140);
bot.turn(90);
bot.move(140);

}
}
