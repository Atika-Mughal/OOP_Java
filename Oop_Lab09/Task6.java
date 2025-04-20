import java.util.Random;
class Task6 {
    public static void generateRandomfrequency() {
        Random rand = new Random();
        int frequency[] = new int[21];

        for (int i=0; i<100; i++) {
            int num = rand.nextInt(21);
            frequency[num]++;
        }
        for (int i=0; i<frequency.length; i++) {
        System.out.println(i + " occured " + frequency[i] + " times.");
        }
    }
    public static void main (String[]args) {
        generateRandomfrequency();
    }
}