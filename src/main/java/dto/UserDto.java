package dto;//wyswietlanie po str fronntu, ołaska str, nie jest to mapowanie 1do 1

import lombok.Data;

@Data
public class UserDto {

    private Long id;

    private String firstName;
    private String lastName;
    private String position;
    private String businessEmail;
    private String privateEmail;
    private String privatePhone;
    private String businessPhone;
    private AddressDto addressDto;
    //lista kontaktow

}
