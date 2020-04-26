package pl.sda.Weather_OP;

public class ErrorWeatherException {
    private Error error;
    private boolean success;

    public ErrorWeatherException(){}

    public  ErrorWeatherException( Error error, boolean success){
        this.error = error;
        this.success = success;
    }

    public Error getError() {
        return error;
    }

    public void setError(Error error) {
        this.error = error;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

}
