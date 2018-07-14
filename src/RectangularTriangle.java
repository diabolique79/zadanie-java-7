import static java.lang.Math.*;
public class RectangularTriangle {

    private boolean isRightTriangle;

    public boolean isRightTriangle(Triangle triangle) {

        return isRightTriangle = pow(triangle.getSideA(), 2) + pow(triangle.getSideB(), 2) == pow(triangle.getSideC(), 2);
    }


}
