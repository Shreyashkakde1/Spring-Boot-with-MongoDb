package com.shreyash.springbootmongodb.collections;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Address {
    private String address1;
    private String address2;
    private String address3;
    private String city;

}
