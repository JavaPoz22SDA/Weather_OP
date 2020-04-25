package pl.sda.Weather_OP;

public class Request {
    private String type;
    private String query;
    public Request(){}

    public Request(String type, String query){
        this.type = type;
        this.query = query;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
