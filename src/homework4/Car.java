package homework4;

public class Car {
    double tankVolume;
    double restInTank;
    double fuelConsumption;
    public static double GetFullTank(double tankVolume, double restInTank) {
        return tankVolume - restInTank;
    }
    // Изначально будем считать, что бак был заполнен на restINTank
    public static double CountRestOfFuel(double distance, double fuelConsumption, double restInTank) {
        return Math.round(restInTank - (distance / 100 * fuelConsumption));
    }

    public static double GetFuelToGetFullTank(double distance, double tankVolume, double fuelConsumption, double restInTank){
        return  Math.ceil(tankVolume- (restInTank - (distance / 100 * fuelConsumption)));
    }

}