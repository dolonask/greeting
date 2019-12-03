package kg.megacom.greeting.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class Person {

    @NonNull
    private int id;
    @NonNull
    private String name;
    @NonNull
    private String phone;

    @NonNull
    private String address;

}
