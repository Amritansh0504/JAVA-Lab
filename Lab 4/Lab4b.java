import java.util.Scanner;

class Plate {
    int length;
    int width;

    Plate(int l, int w) {
        length = l;
        width = w;
        System.out.println("Plate Created - Length: " + length + ", Width: " + width);
    }
}

class Box extends Plate {
    int height;

    Box(int l, int w, int h) {
        super(l, w);
        height = h;
        System.out.println("Box Created - Length: " + length + ", Width: " + width + ", Height: " + height);
    }
}

class WoodBox extends Box {
    int thickness;

    WoodBox(int l, int w, int h, int t) {
        super(l, w, h);
        thickness = t;
        System.out.println("WoodBox Created - Length: " + length + ", Width: " + width + ", Height: " + height + ", Thickness: " + thickness);
    }
}

public class Lab4b{
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        int length = sc.nextInt();
        System.out.print("Enter width: ");
        int width = sc.nextInt();
        System.out.print("Enter height: ");
        int height = sc.nextInt();
        System.out.print("Enter thickness: ");
        int thickness = sc.nextInt();

        WoodBox woodBox = new WoodBox(length, width, height, thickness);

        sc.close();
    }
}
