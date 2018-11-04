package dto;

import lombok.Data;

@Data
public class AddressDto {

    private String street;

    private String number;

    private String zipcode;

    private String city;
}
