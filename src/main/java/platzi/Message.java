package platzi;

public class Message {

    private final long size;
    private final String message;

    public Message(String message) {
        this.size = message.length();
        this.message = message;
    }

    public long getSize() {
        return size;
    }

    public String getMessage() {
        return message;
    }
}
