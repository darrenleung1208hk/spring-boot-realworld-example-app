package io.darren.realworldexampleapp.article;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "articles")
public class Article {
    @Id
    @GeneratedValue
    private Integer id;

    @Basic(optional = false)
    private String slug;

    @Basic(optional = false)
    private String title;

    @Basic(optional = false)
    private String description;

    @Basic(optional = false)
    private String body;

    //  TODO: should create new model/table for this one?
//    @Column(name = "tag_list")
//    private String[] tagList;

    @Column(name = "favorites_count")
    private Integer favoritesCount = 0;

//    @Basic(optional = false)
//    @Column(name = "created_at", insertable = false, updatable = false)
//    @Temporal(TemporalType.TIMESTAMP)
//    private Date createdAt;
//
//    @Basic(optional = false)
//    @Column(name = "updated_at", insertable = true, updatable = true)
//    @Temporal(TemporalType.TIMESTAMP)
//    private Date updatedAt;

    public Article(Integer id, String slug, String title, String description, String body, String[] tagList, Integer favoritesCount) {
        this.id = id;
        this.slug = slug;
        this.title = title;
        this.description = description;
        this.body = body;
//        this.tagList = tagList;
        this.favoritesCount = favoritesCount;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

//    public String[] getTagList() {
//        return tagList;
//    }
//
//    public void setTagList(String[] tagList) {
//        this.tagList = tagList;
//    }

    public Integer getFavoritesCount() {
        return favoritesCount;
    }

    public void setFavoritesCount(Integer favoritesCount) {
        this.favoritesCount = favoritesCount;
    }

//    public Date getCreatedAt() {
//        return createdAt;
//    }
//
//    public void setCreatedAt(Date createdAt) {
//        this.createdAt = createdAt;
//    }
//
//    public Date getUpdatedAt() {
//        return updatedAt;
//    }
//
//    public void setUpdatedAt(Date updatedAt) {
//        this.updatedAt = updatedAt;
//    }

    public String toString() {
        return String.format("User [id=%s, title=%s]", id, title);
    }
}