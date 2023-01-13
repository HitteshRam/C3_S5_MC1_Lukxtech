public class Transmission {

    String typeOfTransmission;
    String modelNo;
    int forwardGears;
    float firstGearRatio;
            float secondGearRatio;
            float thirdGearRatio;
            float fourthGearRatio;

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
                "\n4th Gear Ratio=" + fourthGearRatio;
    }

    public Transmission(String typeOfTransmission, String modelNo, int forwardGears,
                        float firstGearRatio, float secondGearRatio, float thirdGearRatio,
                        float fourthGearRatio) {
        this.typeOfTransmission = typeOfTransmission;
        this.modelNo = modelNo;
        this.forwardGears = forwardGears;
        this.firstGearRatio = firstGearRatio;
        this.secondGearRatio = secondGearRatio;
        this.thirdGearRatio = thirdGearRatio;
        this.fourthGearRatio = fourthGearRatio;

    }

}


