package task1.dbmanager;

import java.util.Objects;

public class News {

    private Long id;
    private String title;
    private String content;
    private String author;
    private String category; //sport, culture или cinema

    private int categoryNumber;

    public News() {}
    public News(Long id, String title, String content, String author, String category,int categoryNumber) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.author = author;
        this.category = category;
        this.categoryNumber=categoryNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getCategoryNumber() {
        return categoryNumber;
    }

    public void setCategoryNumber(int categoryNumber) {
        this.categoryNumber = categoryNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        News news = (News) o;
        return Objects.equals(id, news.id) && Objects.equals(title, news.title) && Objects.equals(content, news.content) && Objects.equals(author, news.author) && Objects.equals(category, news.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, content, author, category);
    }
}
