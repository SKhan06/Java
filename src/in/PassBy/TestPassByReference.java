package in.PassBy;

public class TestPassByReference {
    public static void main(String[] args) {
        Point first = new Point(4,7);
        System.out.println("First: "+first);
        move(first);
        System.out.println("First: "+first);

    }
    public  static void  move(Point p){
        p.x++;
        p.y++;
        System.out.println(p);
    }
    public static class Point{
        int x;
        int y;

        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder("Point{");
            sb.append("x=").append(x);
            sb.append(", y=").append(y);
            sb.append('}');
            return sb.toString();
        }

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

}
