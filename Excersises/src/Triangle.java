 class TriangleArea {
    int side1;
    int side2;
    int side3;

    TriangleArea(int side1, int side2, int side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public int Area(){
        return (side1+side2+side3);
    }
}

public class Triangle{
    public static void main(String[] args) {
        TriangleArea area = new TriangleArea(3,4,5);
        System.out.println(area.Area());
    }
}
