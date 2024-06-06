package assignment4.problem3;

public class SensorTest {
    public static void main(String[] args){
        Sensor ts = new TemperatureSensor(23.5, "Living Room", "03:55 PM");
        Sensor[] sensors = {
                new TemperatureSensor(23.5, "Living Room", "03:55 PM"),
                new LightSensor(80.0, "Garden", "03:55 PM"),
                new SoundSensor(65.0, "BedRoom", "03:55 PM"),
                new TemperatureSensor(15.5, "Swimming Pool", "03:55 PM"),
                new LightSensor(102.3, "kitchen", "03:55 PM"),};
        for(Sensor s: sensors){
            System.out.println(s);
        }
    }
}
