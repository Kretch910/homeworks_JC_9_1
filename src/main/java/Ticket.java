public class Ticket {

    private String id;
    private String text;
    private String type;
    private String user;
    private String upvotes;

    public String getId() {
        return id;
    }

    public String getUpvotes() {
        return upvotes;
    }

    public String getUser() {
        return user;
    }

    public String getType() {
        return type;
    }

    public String getText() {
        return text;
    }

    public void setUpvotes(String upvotes) {
        this.upvotes = upvotes;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("id: ");
        sb.append(id);
        sb.append("\n");
        sb.append("text: ");
        sb.append("'" + text + "'");
        sb.append("\n");
        sb.append("type: ");
        sb.append("'" + type + "'");
        sb.append("\n");
        sb.append("user: ");
        sb.append("'" + user + "'");
        sb.append("\n");
        sb.append("upvotes: ");
        sb.append(upvotes);

        return sb.toString();
    }
}
