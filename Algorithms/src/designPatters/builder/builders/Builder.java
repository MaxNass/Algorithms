package designPatters.builder.builders;

import designPatters.builder.cars.CarType;
import designPatters.builder.components.TripComputer;
import designPatters.builder.components.Engine;
import designPatters.builder.components.GPSNavigator;
import designPatters.builder.components.Transmission;

public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
