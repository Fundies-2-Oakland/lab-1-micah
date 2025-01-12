public class Main {
    public static void main(String[] args){
    Vector3D vector = new Vector3D(1.0,2.0,3.0);

        System.out.println(vector.getX());
        System.out.println(vector.getY());
    }

    public static class Vector3D{
        double x,y,z;
        public Vector3D(double x, double y, double z){
            this.x = x;
            this.y = y;
            this.z = z;

        }
        public double getX(){
            return x;
        }
        public double getY(){
            return y;
        }
        public double getZ(){
            return z;
        }
    }
}
