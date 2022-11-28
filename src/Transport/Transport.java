package Transport;

import java.util.*;

public abstract class Transport {
    private final String brand;
    private final String model;
    private double engineVolume;
    private Driver<?> drivers;
    private Set<Mechanic> mechanics = new HashSet<>();
    private Set<Sponsor>sponsors = new HashSet<>();

    public Driver<?> getDrivers() {
        return drivers;
    }

    public void setDrivers(Driver<?> drivers) {
        this.drivers = drivers;
    }

    public void setMechanics(Set<Mechanic> mechanics) {
        this.mechanics = mechanics;
    }

    public void setSponsors(Set<Sponsor> sponsors) {
        this.sponsors = sponsors;
    }

    public Set<Mechanic> getMechanics() {
        return mechanics;
    }

    public Set<Sponsor> getSponsors() {
        return sponsors;
    }

    public Transport(String brand,
                     String model,
                     double engineVolume) {

        this.brand = CheckCondition.checkCondition(brand, "default");
        this.model = CheckCondition.checkCondition(brand, "default");

        if (engineVolume == 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }

    }

    public void addMechanic(Mechanic<?>...mechanics) {
            this.mechanics.addAll(Arrays.asList(mechanics));

    }
    public void addSponsors(Sponsor<?>... sponsors) {
        this.sponsors.addAll(Arrays.asList(sponsors));
    }
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume == 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }

    }


    @Override
    public String toString() {
        return "Автомобиль марки: " + brand + ",Mодель: " + model + ",Объем двигателя: " + engineVolume +" "+ getClass();
    }

    public abstract boolean service();



    public abstract void startMove();
    public abstract void finishMove();


    public abstract void fix();
}
