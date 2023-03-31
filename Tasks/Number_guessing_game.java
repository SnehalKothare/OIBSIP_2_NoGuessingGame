public class Number_guessing_game {
    public static void main(String[] args) {
        System.out.println("User guess the number between 1 to 100 : ");
        Game1 g = new Game1();
        boolean b = false;
        while (!b) {
            g.takeUserInput();
            b=g.iscorrectnumber();
        }
    }
}