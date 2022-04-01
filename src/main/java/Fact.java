import com.fasterxml.jackson.annotation.JsonProperty;

public class Fact {

    @JsonProperty("id")
    private String id;
    @JsonProperty("text")
    private String text;
    @JsonProperty("type")
    private String type;
    @JsonProperty("user")
    private String user;
    @JsonProperty("upvotes")
    private int upvotes;

    public int getUpvotes() {
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

    public String getId() {
        return id;
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
