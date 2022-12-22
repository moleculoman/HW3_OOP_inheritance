import java.time.LocalDate;
//Задание 1
public class Car extends Transport {
    public double engineVolume;
    public String transmission;
    public final  String carBody;
    public String licensePlate;
    public final  int capacity;
    public boolean isWinterTires;

    public String getCarBody() {
        return carBody;
    }

    public int getCapacity() {
        return capacity;
    }
    public int actualMonth = LocalDate.now().getMonthValue();


    //Constructor

    public Car(String brand, String model, int productionYear, String productionCountry, String color, int maxSpeed, double engineVolume, String transmission, String carBody, String licensePlate, int capacity, boolean isWinterTires, int actualMonth) {
        super(brand, model, productionYear, productionCountry, color, maxSpeed);
        if (capacity <=0){
            this.capacity = 0;
        } else {
            this.capacity = capacity;
        }
        if (transmission ==null || transmission.isEmpty()|| transmission.isBlank()){
            this.transmission = "default";
        } else {
            this.transmission = transmission;
        }
        if (carBody ==null || carBody.isEmpty()|| carBody.isBlank()){
            this.carBody = "default";
        } else {
            this.carBody = carBody;
        }
        if (licensePlate ==null || licensePlate.isEmpty()|| licensePlate.isBlank()){
            this.licensePlate = "default";
        } else {
            this.licensePlate = licensePlate;
        }
        if (Double.compare(engineVolume,0)==0){
            this.engineVolume = 1.5;
        }else{
            this.engineVolume = engineVolume;
        }
    }

    // Геттеры + сеттеры для оставшихся полей
    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume <=0D){
            this.engineVolume = 0;
        }else{
            this.engineVolume = engineVolume;
        }
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        if (transmission ==null || transmission.isEmpty() || transmission.isBlank()){
            this.transmission = "Коробка передач не указана";
        } else {
            this.transmission = transmission;
        }
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        if (licensePlate ==null || licensePlate.isEmpty() || licensePlate.isBlank()){
            this.licensePlate = "Номер не указан";
        } else {
            this.licensePlate = licensePlate;
        }
    }

    public boolean isWinterTires() {
        return isWinterTires;
    }

    public boolean setWinterTires(int actualMonth) {
        if (actualMonth ==12 || actualMonth==1 ||actualMonth==2){
            isWinterTires = true ;
        } else {
            isWinterTires = false;
        }
        return isWinterTires;
    }

    // х000хх000
    public boolean checkLicensePlate (){
        boolean result;
        if (getLicensePlate().matches("^(([АВЕКМНОРСТУХ]\\d{3}(?<!000)[АВЕКМНОРСТУХ]{1,2})(\\d{2,3})|(\\d{4}(?<!0000)[АВЕКМНОРСТУХ]{2})(\\d{2})|(\\d{3}(?<!000)(C?D|[ТНМВКЕ])\\d{3}(?<!000))(\\d{2}(?<!00))|([ТСК][АВЕКМНОРСТУХ]{2}\\d{3}(?<!000))(\\d{2})|([АВЕКМНОРСТУХ]{2}\\d{3}(?<!000)[АВЕКМНОРСТУХ])(\\d{2})|([АВЕКМНОРСТУХ]\\d{4}(?<!0000))(\\d{2})|(\\d{3}(?<!000)[АВЕКМНОРСТУХ])(\\d{2})|(\\d{4}(?<!0000)[АВЕКМНОРСТУХ])(\\d{2})|([АВЕКМНОРСТУХ]{2}\\d{4}(?<!0000))(\\d{2})|([АВЕКМНОРСТУХ]{2}\\d{3}(?<!000))(\\d{2,3})|(^Т[АВЕКМНОРСТУХ]{2}\\d{3}(?<!000)\\d{2,3}))")){
            result = true;
        } else {
            result = false;
        }
        return result ;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", engineVolume=" + engineVolume +
                ", color='" + getColor() + '\'' +
                ", productionYear=" + getProductionYear() +
                ", productionCountry='" + getProductionCountry() + '\'' +
                ", transmission='" + transmission + '\'' +
                ", carBody='" + carBody + '\'' +
                ", licensePlate='" + licensePlate + '\'' +
                ", capacity=" + capacity +
                ", Резина зимняя=" + isWinterTires +
                '}';
    }

    public static class Key{

        private boolean isRemoteEngineStart;
        private boolean iskeyFreeAccess;

        public Key(boolean isRemoteEngineStart, boolean iskeyFreeAccess) {
            if (!isRemoteEngineStart ){
                System.out.println("Удаленный запуск двигателя не предусмотрен");
            } else {
                System.out.println("Удаленный запуск двигателя имеется");
            }

            if (!iskeyFreeAccess ){
                System.out.println("Бесключевой доступ не предусмотрен");
            } else {
                System.out.println("Бесключевой доступ имеется");
            }
        }

        public boolean isRemoteEngineStart() {
            return isRemoteEngineStart;
        }

        public void setRemoteEngineStart(boolean remoteEngineStart) {
            isRemoteEngineStart = remoteEngineStart;
        }

        public boolean isIskeyFreeAccess() {
            return iskeyFreeAccess;
        }

        public void setIskeyFreeAccess(boolean iskeyFreeAccess) {
            this.iskeyFreeAccess = iskeyFreeAccess;
        }
    }

    public static class Insurance{
        private int insuranceDuration;
        private int insuranceCost;
        private String insuranceNumber;

        public Insurance(int insuranceDuration, int insuranceCost, String insuranceNumber) {
            if (insuranceDuration<0){
                this.insuranceDuration =0;
            } else {
                this.insuranceDuration = insuranceDuration;
            }
            if (insuranceCost<0){
                this.insuranceDuration =0;
            } else {
                this.insuranceCost = insuranceCost;
            }
            this.insuranceNumber = insuranceNumber;
        }
        public static String isInsuranceValid (int actualDate,int expirationDate){
            actualDate = LocalDate.now().getDayOfYear();
            String result;
            if (actualDate > expirationDate){
                result = "Страховка просрочена!";
            } else {
                result = "Страховка валидна";
            }
            return result;
        }

        public static String isInsuranceNumberValid (String insuranceNumber){
            //String result;
            if(insuranceNumber.matches(".*(\\p{L}(?=.*\\d)|\\d(?=.*\\p{L})).*")){
                insuranceNumber = "Номер страховки некорректный!";
            } else {
                insuranceNumber = "Номер страховки корректный";
            }
            return insuranceNumber;
        }

        public int getInsuranceDuration() {
            return insuranceDuration;
        }

        public void setInsuranceDuration(int insuranceDuration) {
            this.insuranceDuration = insuranceDuration;
        }

        public int getInsuranceCost() {
            return insuranceCost;
        }

        public void setInsuranceCost(int insuranceCost) {
            this.insuranceCost = insuranceCost;
        }

        public String getInsuranceNumber() {
            return insuranceNumber;
        }

        public void setInsuranceNumber(String insuranceNumber) {
            this.insuranceNumber = insuranceNumber;
        }
    }
}