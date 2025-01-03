package bg.softuni.pathfinder.data.entities;

import bg.softuni.pathfinder.data.entities.enums.CategoryType;
import jakarta.persistence.*;

@Entity
@Table(name = "categories")
public class Category extends BaseEntity {


    @Enumerated(EnumType.STRING)
    private CategoryType name;

    @Column(columnDefinition = "TEXT")
     private String description;

    public Category() {
    }

    public CategoryType getName() {
        return name;
    }

    public void setName(CategoryType name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
