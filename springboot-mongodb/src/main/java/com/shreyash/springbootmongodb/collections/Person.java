package com.shreyash.springbootmongodb.collections;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Builder
@Document(collation = "person")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Person {
    @Id
    private Long personId;
    private String firstName;
    private String lastName;
    private Integer age;
    private List<String> hobbies;
    private List<Address> addresses;
}
