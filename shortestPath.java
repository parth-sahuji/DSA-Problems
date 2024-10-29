import java.util.Scanner;

public class shortestPath {
    public static float getshortestpath (String path) {
        int x=0 , y=0 ;
        for(int i=0;i<path.length();i++) {
            char dir = path.charAt(i);

            if(dir == 'N') {
                y++;
            }
            else if(dir == 'S') {
                y--;
            }
            else if(dir == 'W') {
                x--;
            }
            else if(dir == 'E') {
                x++;
            }
        }

        int Xsq = x*x , Ysq = y*y;

        return (float)Math.sqrt(Xsq + Ysq);
    }
    public static void main(String[] args) {
        System.out.println("HARIOM");

        Scanner sc = new Scanner(System.in);

        String path = sc.nextLine();

        sc.close();

        System.out.println(getshortestpath(path));
    }
}
