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
    private boolean summerTyres;

    public Car(String brand, String model, double engineVolume,
               String color, int year, String country,
               String transmission, String bodyType,
               String serialNumber, int numberSeats) {

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
        setEngineVolume(engineVolume);
        setColor(color);
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
        setTransmission(transmission);
        this.bodyType = bodyType;
        if (bodyType == null || bodyType.isEmpty())
            bodyType = "седан";
        setSerialNumber(serialNumber);
        this.numberSeats = numberSeats;
        if (numberSeats <= 0) {
            numberSeats = 5;
        }
        setSummerTyres(summerTyres);
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

    public boolean isSummerTyres() {
        return summerTyres;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public void setColor(String color) {
        if (color == null || color.isEmpty()) {
            this.color = "белый";
        } else {
            this.color = color;
        }
    }

    public void setTransmission(String transmission) {
        if (transmission == null || transmission.isEmpty()) {
            this.transmission = "МКПП";
        } else {
            this.transmission = transmission;
        }
    }

    public void setSerialNumber(String serialNumber) {
        if (serialNumber == null || serialNumber.isEmpty()) {
            this.serialNumber = "х000хх000";
        } else {
            this.serialNumber = serialNumber;
        }
    }

    public void setSummerTyres(boolean summerTyres) {
        this.summerTyres = summerTyres;
    }

    public void changeTyres() {
        setSummerTyres(!summerTyres);
    }

    public boolean isValidNumber() {
        return serialNumber.length() == 9

                && Character.isLetter(serialNumber.charAt(0))
                && Character.isLetter(serialNumber.charAt(4))
                && Character.isLetter(serialNumber.charAt(5))

                && Character.isDigit(serialNumber.charAt(1))
                && Character.isDigit(serialNumber.charAt(2))
                && Character.isDigit(serialNumber.charAt(3))
                && Character.isDigit(serialNumber.charAt(6))
                && Character.isDigit(serialNumber.charAt(7))
                && Character.isDigit(serialNumber.charAt(8));
    }
    @Override
    public String toString() {
        return "Автомобиль: " + brand + " " + model +
                ", объем двигателя: " + engineVolume +
                ", цвет: " + color +
                ", год производства: " + year +
                ", страна сборки: " + country +
                ", КПП: " + transmission +
                ", кузов: " + bodyType +
                ", регистрационный номер: " + serialNumber +
                ", количество мет: " + numberSeats
                ;
    }
}
