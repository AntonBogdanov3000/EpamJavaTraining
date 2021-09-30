package by.bogdanov.task6.entity;

public class Point {

        private double x;
        private double y;

        public Point(double x, double y){
            this.x = x;
            this.y = y;
        }
        public double getX(){
            return x;
        }
        public double getY(){
            return y;
        }
        public String toString(){
            return this.x + "-" + this.y;
        }
        @Override
        public boolean equals(Object o){
            if(this == o) return true;
            if(o == null) return false;
            if(getClass() != o.getClass()) return false;

            Point point = (Point) o;
            if (x != point.x) return false;
            if (y != point.y) return false;

            return true;
        }
    }

