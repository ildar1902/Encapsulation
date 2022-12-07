package Transport;

public class Car {
    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int year;
    private final String country;
    private String transmission;
    private final String bodyType;
    private String serialNumber;
    private final int numberSeats;
    private boolean typeRubber;

    public Car(String brand, String model, double engineVolume,
               String color, int year, String country,
               String transmission, String bodyType,
               String serialNumber, int numberSeats,
                boolean typeRubber) {
        if (brand == null || brand.isEmpty()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null || model.isEmpty()) {
            this.model = "default";
        } else {
            this.model = model;
        }
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
        if (color == null || color.isEmpty()) {
            this.color = "white";
        } else {
            this.color = color;
        }
        if (year <= 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }
        if (country == null || country.isEmpty()) {
            this.country = "default";
        } else {
            this.country = country;
        }
        this.transmission = transmission;
        this.bodyType = bodyType;
        this.serialNumber = serialNumber;
        this.numberSeats = numberSeats;
        this.typeRubber = typeRubber;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setTypeRubber(boolean typeRubber) {
        this.typeRubber = typeRubber;
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

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public int getNumberSeats() {
        return numberSeats;
    }

    public boolean isTypeRubber() {
        return typeRubber;
    }


    @Override
    public String toString() {
        return "марка: " + brand + ", модель: " + model +
                ", объем двигателя: " + engineVolume +
                ", цвет: " + color +
                ", год производства: " + year +
                ", страна сборки: " + country;
    }
}
