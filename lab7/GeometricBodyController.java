package lab7;

import java.lang.reflect.Array;

public class GeometricBodyController {

    public void biggestVolume(GeometricBodyInterface[] geometricBodies){
        float tmp = 0;
        for(int i = 0; i < geometricBodies.length; i++){
            if(tmp < geometricBodies[i].getVolume()){
               tmp = geometricBodies[i].getVolume();
            }
        }
        System.out.println("The biggest volume is " + tmp);
    }

    public void biggestSurface(GeometricBodyInterface[] geometricBodies){
        float tmp = 0;
        for(int i = 0; i < geometricBodies.length; i++){
            if(tmp < geometricBodies[i].getSurface()){
                tmp = geometricBodies[i].getSurface();
            }
        }
        System.out.println("The biggest surface is " + tmp);
    }
}
