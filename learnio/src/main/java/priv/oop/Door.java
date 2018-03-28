package priv.oop;


public interface Door {
    default void open() {
        System.out.println("open door");
    }
}
