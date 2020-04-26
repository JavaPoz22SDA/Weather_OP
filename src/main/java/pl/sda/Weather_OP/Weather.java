package pl.sda.Weather_OP;

public class Weather {

   // private Double  temperature;
   // private String city;
    private Request request;
    private Location location;
    private Current current;

    public Weather(){}

    public Weather( Request request, Location location, Current current) {
        this.current=current;
        this.request = request;
        this.location = location;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Request getRequest() {
        return request;
    }

    public void setRequest(Request request) {
        this.request = request;
    }

    public Current getCurrent() {
        return current;
    }

    public void setCurrent(Current current) {
        this.current = current;}
}
