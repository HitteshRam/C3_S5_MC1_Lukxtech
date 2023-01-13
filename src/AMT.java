public class AMT extends Transmission {
    float fifthGearRatio;
    public AMT(String typeOfTransmission, String modelNo, int forwardGears, float firstGearRatio, float secondGearRatio,
               float thirdGearRatio, float fourthGearRatio) {
        super(typeOfTransmission, modelNo, forwardGears, firstGearRatio, secondGearRatio, thirdGearRatio,
                fourthGearRatio);
    }
    public AMT(String typeOfTransmission, String modelNo, int forwardGears, float firstGearRatio, float secondGearRatio,
               float thirdGearRatio, float fourthGearRatio, float fifthGearRatio) {
        super(typeOfTransmission, modelNo, forwardGears, firstGearRatio, secondGearRatio, thirdGearRatio,
                fourthGearRatio);
        this.fifthGearRatio = fifthGearRatio;
    }
    public String showSpecs()
    {
        return toString();
    }
    @Override
    public String toString() {
        return "Transmission Type: "+ typeOfTransmission +
                "\nTransmission ModelNo=" + modelNo +
                "\n\nKey Specification:" + "\nforwardGears=" + forwardGears +
                "\n1st Gear Ratio=" + firstGearRatio +
                "\n2nd Gear Ratio=" + secondGearRatio +
                "\n3rd Gear Ratio=" + thirdGearRatio +
                "\n4th Gear Ratio=" + fourthGearRatio +
                "\n5th Gear Ratio=" + fifthGearRatio;
    }
}
