package kr.re.kitri.hello.controller.model;

/**
 * Created by danawacomputer on 2017-06-12.
 */
public class Amigo {
    private String amigoName;
    private String amigoNumber;
    private String amigoEmail;

    public String getAmigoName() {
        return amigoName;
    }

    public void setAmigoName(String amigoName) {
        this.amigoName = amigoName;
    }

    public String getAmigoNumber() {
        return amigoNumber;
    }

    public void setAmigoNumber(String amigoNumber) {
        this.amigoNumber = amigoNumber;
    }

    public String getAmigoEmail() {
        return amigoEmail;
    }

    public void setAmigoEmail(String amigoEmail) {
        this.amigoEmail = amigoEmail;
    }

    @Override
    public String toString() {
        return "Amigo{" +
                "amigoName='" + amigoName + '\'' +
                ", amigoNumber='" + amigoNumber + '\'' +
                ", amigo='" + amigoEmail + '\'' +
                '}';
    }
}
