package kr.re.kitri.hello.model;

/**
 * Created by danawacomputer on 2017-06-16.
 */
public class Post {

    private int postSeq;
    private String title;
    private String content;
    private String writeDate;
    private String memberSeq;


    public Post(int postSeq, String title, String content, String writeDate, String memberSeq) {
        this.postSeq = postSeq;
        this.title = title;
        this.content = content;
        this.writeDate = writeDate;
        this.memberSeq = memberSeq;
    }

    public Post() {}

    public int getPostSeq() {
        return postSeq;
    }

    public void setPostSeq(int postSeq) {
        this.postSeq = postSeq;
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

    public String getWriteDate() {
        return writeDate;
    }

    public void setWriteDate(String writeDate) {
        this.writeDate = writeDate;
    }

    public String getMemberSeq() {
        return memberSeq;
    }

    public void setMemberSeq(String memberSeq) {
        this.memberSeq = memberSeq;
    }

    @Override
    public String toString() {
        return "Post{" +
                "postSeq=" + postSeq +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", writeDate='" + writeDate + '\'' +
                ", memberSeq='" + memberSeq + '\'' +
                '}';
    }
}
