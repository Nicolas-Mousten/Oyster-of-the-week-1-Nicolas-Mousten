import java.util.ArrayList;
import java.util.Arrays;

public class Rotate<T> {

    public ArrayList<T> Rotate(ArrayList<T> arr, int amount){
        for (int i = 0; i < amount; i++) {
            arr.add(arr.get(0));
            arr.remove(0);
        }
        return arr;
    }
}


class Main{
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>(Arrays.asList("Hello","Denmark","I","Am","Back"));
        Rotate<String> rot = new Rotate<>();
        arr = rot.Rotate(arr,2);
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i));
        }
    }
}