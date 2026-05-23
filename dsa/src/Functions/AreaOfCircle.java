package Functions;

public class AreaOfCircle {
    float PI = 3.14f;

    public float areaOfCircle(int radius){
        return PI*radius*radius;
    }

    void main(){
        float area = areaOfCircle(4);
        System.out.println(area);
    }
}
