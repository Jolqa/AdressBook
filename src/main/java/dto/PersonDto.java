package dto;//wyswietlanie po str fronntu, płaska str, nie jest to mapowanie 1 do 1

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class UserDto {

    private Long id;

    @NotBlank
    private String firstName;

    @NotBlank
    private String lastName;

    @NotBlank
    private String position;

    @NotBlank
    private String businessEmail;

    private String privateEmail;

    private String privatePhone;

    private String businessPhone;

    @NotBlank
    private AddressDto addressDto;

    //lista kontaktow

}
