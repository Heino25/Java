package Heino;

public class MobilePhone implements ITelephone {
    private int myNumber;
    private boolean isRinging;
    private boolean isOn = false;

    @Override
    public void powerOn() {
        isOn = true;
        System.out.println("Mobile Phone powered up");
    }

    @Override
    public void dial(int phoneNumber) {
        if (isOn) {
            System.out.println("Now Ringing " + phoneNumber + " on mobile phone");
        } else {
            System.out.println("Phone is switched off");
        }

    }

    @Override
    public void answer() {
        if (isRinging) {
            System.out.println("Answering the desk phone");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (phoneNumber == myNumber && isOn) {
            isRinging = true;
            System.out.println("Melody Ring");
        } else {
            isRinging = false;
            System.out.println("Mobile phone not on or number different");
        }
        return isRinging;
    }

    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
