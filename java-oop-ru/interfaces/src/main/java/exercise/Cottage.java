package exercise;

// BEGIN
public class Cottage implements Home{
    private double area;
    private int floorCount;
    public Cottage(double area, int floorCount){
        this.area = area;
        this.floorCount = floorCount;
    }

    @Override
    public double getArea() {
        return area;
    }

    @Override
    public int compareTo(Home other) {
        if(getArea() < other.getArea()){
            return -1;
        }else if(getArea() == other.getArea()){
            return 0;
        }else{
            return 1;
        }
    }

    @Override
    public String toString() {
        return floorCount + " этажный коттедж площадью " + area + " метров";
    }

}
// END
