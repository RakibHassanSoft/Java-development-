package First10;

public class Player {
    String name;
    int score;

    Player(String n, int s) {
        name = n;
        score = s;
    }

    void updateScore(int value) {
        score += value;
    }

    void display() {
        System.out.println(name + "'s Score: " + score);
    }

    public static void main(String[] args) {
        Player p = new Player("Rakib", 10);
        p.updateScore(5);
        p.display();
    }
}
