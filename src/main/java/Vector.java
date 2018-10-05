import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Vector {
    List<Double> elements;

    /**
     *
     * @param a
     * @param b
     */
    public Vector(double a, double b) {
        //Create the two row vector
        // |  a  |
        // |  b  |
        this.elements = new ArrayList<>(Arrays.asList(a,b));
    }

    /**
     *
     * @param elements
     */
    public Vector(List<Double> elements) {
        //Create the two row vector
        // |  a  |
        // |  b  |
        this.elements = new ArrayList<>(elements);
    }

    /**
     *
     * @return
     */
    public double x(){
        return elements.get(0);
    }

    /**
     *
     * @return
     */
    public double y(){
        return elements.get(1);
    }

    /**
     *
     * @return
     */
    public String toString(){
        return "| " + String.format("%.1f", this.elements.get(0)) +" |\n"
                + "| " + String.format("%.1f", this.elements.get(1)) + " |";
    }

    public double magSquared(){
        return this.x()*this.x()+this.y()*this.y();
    }
}
