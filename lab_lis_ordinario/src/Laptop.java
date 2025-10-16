public class Laptop extends Computer{
    public interface PortableDivice {
        public double weight;
    public int batteryCapacity;
        public abstract String getModel(){
            return model;
        }
        public int setBatteryCapacity(){
            this.batteryCapacity = batteryCapacity;
        }
        public int getBatteryCapacity(){
            return batteryCapacity;
        }
        
    }
    
}
