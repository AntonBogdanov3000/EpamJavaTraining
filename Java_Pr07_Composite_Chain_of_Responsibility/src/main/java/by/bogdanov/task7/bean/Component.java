package by.bogdanov.task7.bean;

public interface Component {
    String collect();
    void add(Component component);
    void remove(Component component);
    Object getChild(int index);
}
