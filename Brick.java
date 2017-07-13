public class Brick {
    int x, y, z;

    public Brick(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int Entrance(Brick obj, int hole_diameter) {
        if (hole_diameter >= Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2))) {
            return 3;
        } else if (hole_diameter >= Math.sqrt(Math.pow(x, 2) + Math.pow(z, 2))) {
            return 2;
        } else if (hole_diameter >= Math.sqrt(Math.pow(y, 2) + Math.pow(z, 2))) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Brick MyBrick = new Brick(250, 120, 65);
        int hole_diameter = 270;
        System.out.println("For brick with sides: " + " x=" + MyBrick.x + " y=" + MyBrick.y + " z=" + MyBrick.z);
        System.out.println("and hole with a diameter of: " + hole_diameter);
        System.out.println("number of occurrences: " + MyBrick.Entrance(MyBrick, hole_diameter));
    }
}

