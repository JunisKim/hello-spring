package kr.re.kitri.hello.controller.model;

/**
 * Created by danawacomputer on 2017-06-12.
 */
public class Article {
    private String articleId;
    private String title;
    private String name;
    private String content;

    public String getArticleId() {
        return articleId;
    }

    public void setArticleId(String articleId) {
        this.articleId = articleId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Article{" +
                "articleId='" + articleId + '\'' +
                ", title='" + title + '\'' +
                ", name='" + name + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
