package by.bogdanov.task7.bean;

public class Leaf implements Component {

    private char symbol;

    public Leaf(char symbol){
        this.symbol = symbol;
    }
    @Override
    public String collect() {
        return String.valueOf(symbol);
    }

    @Override
    public void add(Component component) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void remove(Component component) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Object getChild(int index) {
        return null;
    }
}
