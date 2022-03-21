package oop;

import lombok.*;

@Data
@RequiredArgsConstructor
@With
public class Location {

    @NonNull
    private final String name;

    @NonNull
    private final String latitude;

    @NonNull
    private final String longitude;

    @Getter(lazy = true)
    private final double[] averagePosition = calculatePosition();

    private double[] calculatePosition(){
        System.out.println("Calculating....");
        double[] result = new double[1000000];
        for (int i = 0; i < result.length; i++) {
            result[i] = Math.asin(i);
        }
        return result;
    }

}
