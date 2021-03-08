
import java.util.ArrayList;
import java.util.Random;

public class LotteryRow {

    private ArrayList<Integer> numbers;

    public LotteryRow() {
        this.randomizeNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void randomizeNumbers() {
        this.numbers = new ArrayList<>();
        Random random = new Random();
        int i = 0;
        while(i < 7) {
        int randomNumber = random.nextInt(40) + 1;
            if(this.containsNumber(randomNumber)) {
                continue;
            }
            numbers.add(randomNumber);
            i++;
        }
    }

    public boolean containsNumber(int number) {
        for(int n: this.numbers) {
            if(number == n) {
                return true;
            }
        }
        return false;
    }
}

