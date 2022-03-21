package oop;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.With;

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


}
