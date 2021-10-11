public class SpeedConverter {

    public static long toMilesPerHour(double kilometresPerHour){

        if (kilometresPerHour < 0){
            return  -1;
        }

        long milesPerHour = Math.round(kilometresPerHour / 1.609);
        return milesPerHour;
    }
}

