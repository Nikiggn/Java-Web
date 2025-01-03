package bg.softuni.pathfinder.web.dto;

import bg.softuni.pathfinder.data.entities.enums.Level;
import com.google.gson.annotations.Expose;
import jakarta.validation.constraints.*;

public class UserRegisterDTO {

    @NotBlank
    @Size(min = 2)
    private String username;


    @Size(min = 5)
    private String fullName;

    @Email
    private String email;

    private Level level;

    @Min(0)
    @Max(90)
    private Integer age;

    @Size(min = 5)
    private String password;


    private String confirmPassword;

    public UserRegisterDTO() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }
}
