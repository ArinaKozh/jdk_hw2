import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Developer> developers = new ArrayList<>();

        developers.add(new FrontEnder());
        developers.add(new BackEnder());
        developers.add(new FullStack());
        developers.add(new FrontEnder());

        for (int i = 0; i < developers.size(); i++) {
            if (developers.get(i) instanceof FrontEnder) {
                (developers.get(i)).developGUI();
            }
        }
    }
}