package exercise;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

// BEGIN
@Getter
@AllArgsConstructor
public class Circle{
    @Getter(AccessLevel.NONE)
    private Point point;
    private int radius;

    public double getSquare() throws NegativeRadiusException {
        if(radius < 0){
            throw new NegativeRadiusException("");
        }
        return Math.PI * radius * radius;
    }
}
// END
