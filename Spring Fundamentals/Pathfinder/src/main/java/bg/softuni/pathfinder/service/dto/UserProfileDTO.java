package bg.softuni.pathfinder.service.dto;

import bg.softuni.pathfinder.data.entities.enums.Level;
import jakarta.validation.constraints.NotBlank;

public class UserProfileDTO {
    @NotBlank
    private String username;

    @NotBlank
    private String fullName;

    @NotBlank
    private Integer age;

    @NotBlank
    private Level level;

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



    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
