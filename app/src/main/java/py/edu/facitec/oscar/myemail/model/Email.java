package py.edu.facitec.oscar.myemail.model;

public class Email {
    private String subject;
    private String sender;
    private String message;
    private String color;

    public Email(String subject, String sender, String message) {
        this.subject = subject;
        this.sender = sender;
        this.message = message;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
