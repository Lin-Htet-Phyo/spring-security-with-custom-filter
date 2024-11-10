package com.example.springsecuritymaster12102022.ds;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotBlank
    @Size(min = 2, max = 5, message = "Code length must be between 2 and 5.")
    @Pattern(regexp = "[A-za-z]*", message = "Code contains illegal character.")
    private String code;
    @NotBlank(message = "First name cannot be empty.")
    @Pattern(regexp = "[A-Za-z-]*", message = "First name contains illegal characters.")
    private String firstName;
    @NotBlank(message = "Last name cannot be empty.")
    @Pattern(regexp = "[A-Za-z-]*", message = "Last name contains illegal characters.")
    private String lastName;
    @NotBlank(message = "Address cannot be empty.")
    @Pattern(regexp = "[\\w .\\-/,]*", message = "Address contains illegal characters.")
    private String address;

    public Customer(String code, String firstName, String lastName, String address) {
        this.code = code;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }
}
