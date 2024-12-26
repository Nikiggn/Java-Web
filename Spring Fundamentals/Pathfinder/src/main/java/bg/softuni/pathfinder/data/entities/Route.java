package bg.softuni.pathfinder.data.entities;

import bg.softuni.pathfinder.data.entities.enums.Level;
import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "routes")
public class Route extends BaseEntity {

    @Column(name = "gpx_coordinates", columnDefinition = "LONGTEXT")
    private String gpxCoordinates;

    @Column(columnDefinition = "TEXT")
    private String description;

    @Enumerated(EnumType.STRING)
    private Level level;

    @Column(unique = true)
    private String name;

    @ManyToOne(optional = false)
    private User author;

    @Column(name = "video_url")
    private String videoUrl;

    @OneToMany (targetEntity = Comment.class, mappedBy = "route")
    private Set<Comment> comments;

    @OneToMany( targetEntity = Picture.class, mappedBy = "route")
    private Set<Picture> pictures;

    @ManyToMany
    private Set<Category> categories;

    public Route() {
        comments = new HashSet<>();
        pictures = new HashSet<>();
        categories = new HashSet<>();
    }

    public String getGpxCoordinates() {
        return gpxCoordinates;
    }

    public void setGpxCoordinates(String gpxCoordinates) {
        this.gpxCoordinates = gpxCoordinates;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public Set<Comment> getComments() {
        return comments;
    }

    public void setComments(Set<Comment> comments) {
        this.comments = comments;
    }

    public Set<Picture> getPictures() {
        return pictures;
    }

    public void setPictures(Set<Picture> pictures) {
        this.pictures = pictures;
    }

    public Set<Category> getCategories() {
        return categories;
    }

    public void setCategories(Set<Category> categories) {
        this.categories = categories;
    }
}
