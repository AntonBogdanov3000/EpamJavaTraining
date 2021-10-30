package by.bogdanov.task7.bean;

import java.util.ArrayList;

public class Composite implements Component{

    private final ArrayList<Component> components = new ArrayList<>();

    public int getSize(){
        return components.size();
    }

    @Override
    public String collect() {
    StringBuilder stringBuild = new StringBuilder();
    for (Component child : components){
        stringBuild.append(child.collect());
    }
    return stringBuild.toString();
    }
    @Override
    public void add(Component component) {
        components.add(component);
    }

    @Override
    public void remove(Component component) {
    }

    @Override
    public Object getChild(int index) {
        return components.get(index);
    }
}
