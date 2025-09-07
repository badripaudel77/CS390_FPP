package edu.miu.lab1;

/**
 * @author Badri Paudel
 * @since 9/2/2025
 * <p>This is the assignment for lab 1, FPP course, MIU, IA</p>
 * Program name: <b>“Remove Array Duplicates”</b>
 */
public class Prog4 {
    public static void main(String[] args) {
        String[] animals = {"cat", "horse","horse", "dog", "cat", "horse", "dog", "dog", "horse", null};
        String[] rs = new  String[animals.length];
        int rsIdx = 0;
        for(int i = 0; i < animals.length; i++){
            //Skip null
            if(animals[i] == null) continue;

            //Finding flag
            boolean isExisted = false;

            for(int j = 0; j < rs.length; j++){
                if(animals[i].equals(rs[j])){
                    //Found
                    isExisted = true;
                    break;
                }
            }
            if(!isExisted){
                rs[rsIdx]  = animals[i];
                rsIdx++;
            }
        }

        for(int i = 0; i < rs.length; i++){
            if(rs[i] != null){
                System.out.println(rs[i]);
            }
        }

    }
}
