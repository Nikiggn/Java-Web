package bg.softuni.pathfinder.service.dto;

import com.google.gson.annotations.Expose;

public class RouteShortInfoDTO {
    @Expose
    private long id;

    @Expose
    private String name;

    @Expose
    private String description;

    @Expose
    private String imageUrl;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
