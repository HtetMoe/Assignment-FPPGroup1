package assignment4.problem3;

public interface Sensor {
    public String getSensorType();
    public double getReading();
    public String getLocation();
    public String getLastUpdate();
    public String performAction();
    default String toSensorString(){
            return String.format("""
                Sensor Type: %s
                Reading: %.2f
                Location: %s
                Last Updated: %s
                Action: %s
                """,
                    getClass().getSimpleName(),
                    getReading(),
                    getLocation(),
                    getLastUpdate(),
                    performAction());
    }

}
