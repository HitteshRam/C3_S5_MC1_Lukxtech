public class Automatic_DCT extends Transmission{

        float fifthGearRatio;
        float sixthGearRatio;
        float seventhRatio;
        float eighthRatio;

        public Automatic_DCT(String typeOfTransmission, String modelNo, int forwardGears, float firstGearRatio,
                             float secondGearRatio, float thirdGearRatio, float fourthGearRatio, float fifthGearRatio,
                             float sixthGearRatio, float seventhRatio, float eighthRatio)
        {
                super(typeOfTransmission,modelNo, forwardGears, firstGearRatio, secondGearRatio, thirdGearRatio, fourthGearRatio);
                this.fifthGearRatio= fifthGearRatio;
                this.sixthGearRatio= sixthGearRatio;
                this.seventhRatio= seventhRatio;
                this.eighthRatio= eighthRatio;
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
                        "\n5th Gear Ratio=" + fifthGearRatio +
                        "\n6th Gear Ratio=" + sixthGearRatio +
                        "\n7th Gear Ratio=" + seventhRatio +
                        "\n8th Gear Ratio=" + eighthRatio;
        }
}
