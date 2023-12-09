public interface FrontAction {
    void front();
    default void coffee() {
        System.out.println("Drink");
    };
}