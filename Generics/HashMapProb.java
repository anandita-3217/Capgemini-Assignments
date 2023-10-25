import java.util.HashMap;
import java.util.Random;
public class HashMapProb {
    public static void main(String[] args){
        HashMap<Integer,Double> hashMap = new HashMap<>();
        Random random=new Random();
        for(int i=0;i<10;i++){
            int key = random.nextInt(100);
            double value = random.nextDouble();
            hashMap.put(key, value);
        }
        System.out.println("Data stored in the HashMap:");
        for (Integer key : hashMap.keySet()) {
            Double value = hashMap.get(key);
            System.out.println(key + " -> " + value);
        }
    }
}
