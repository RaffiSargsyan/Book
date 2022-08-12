package models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Registration {

    private String name;
    private String surname;
    private int age;
    private String login;
    private String password;


}
