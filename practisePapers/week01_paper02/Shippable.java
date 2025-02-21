package practisePapers.week01_paper02;

public interface Shippable <T> {
    //<T> this is called formal type parameter

    void ship(T t);
}
