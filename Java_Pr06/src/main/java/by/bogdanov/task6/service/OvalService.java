package by.bogdanov.task6.service;

import by.bogdanov.task6.entity.Oval;
import by.bogdanov.task6.entity.Point;

public interface OvalService {
    public double getArea(Oval oval);
    public double getPerimeter(Oval oval);
    public boolean isOval(Oval oval);
    public boolean isCircle(Oval oval);

}
