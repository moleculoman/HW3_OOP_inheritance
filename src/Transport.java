import java.time.LocalDate;

public class Transport {
    private String brand;
    private String model;
    private final  int productionYear;
    private final  String productionCountry;
    private String color;
    private int maxSpeed;

    //CONSTRUCTOR
    public Transport(String brand, String model, final int productionYear, final String productionCountry, String color, int maxSpeed) {
        if (brand ==null){
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model ==null){
            this.model = "default";
        } else {
            this.model = model;
        }
        if (productionCountry ==null){
            this.productionCountry = "default";
        }else{
            this.productionCountry = productionCountry;
        }
        if (color ==null){
            this.color = "белый";
        }else{
            this.color = color;
        }
        if (productionYear == 0){
            this.productionYear = 2000;
        }else{
            this.productionYear = productionYear;
        }
        if (maxSpeed == 0){
            this.maxSpeed = 0;
        }else{
            this.maxSpeed = maxSpeed;
        }
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color ==null || color.isEmpty() || color.isBlank()){
            this.color = "Цвет не указан";
        } else {
            this.color = color;
        }
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", color='" + getColor() + '\'' +
                ", productionYear=" + getProductionYear() +
                ", productionCountry='" + getProductionCountry() + '\'' +
                '}';
    }


}
