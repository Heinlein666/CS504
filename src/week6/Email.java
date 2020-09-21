package week6;

public class Email {

    private String emailStr;

    Email() {}

    Email(String str) {
        emailStr = str;
    }

    public String parseEmailName() {
        int pos = emailStr.indexOf('@');

        String name = emailStr.substring(0, pos);

        return name;
    }

    public String parseCompanyName() {
        int pos = emailStr.indexOf('@');
        int dot = emailStr.lastIndexOf('.');

        String company = emailStr.substring(pos + 1, dot);
        return company;
    }

    public String parseExtension() {
        int dot = emailStr.lastIndexOf('.');
        String ext = emailStr.substring(dot + 1, emailStr.length());
        return ext;
    }

}
