package lab2;

public class Box {
    float height, width, depth;

    Box() {
        this.height = 1;
        this.width = 1;
        this.depth = 1;
    }

    Box(float a) {
        this.height = a;
        this.width = a;
        this.depth = a;
    }

    Box(float a, float b, float c) {
        this.height = a;
        this.width = b;
        this.depth = c;
    }

    float getVolume() {
        return height * width * depth;
    }

    float getSurfaceArea() {
        return 2 * (height * width + height * depth + width * depth);
    }
}
