package home_work_sem_2.zero_neighbours;

public class ZeroNeighboursService {

    private static final int[] POSITIONS = new int[2];

    public static boolean isZeroNeighboursInArray(int[] array){

        for (int i = 0; i < array.length; i++){
            if(i + 1 < array.length) {
                if (array[i] == 0 && array[i] == array[i + 1]) {
                    POSITIONS[0] = i;
                    POSITIONS[1] = i + 1;
                    return true;
                }
            }
        }
        return false;
    }

    public static int[] getPositions(){
        return POSITIONS;
    }
}
