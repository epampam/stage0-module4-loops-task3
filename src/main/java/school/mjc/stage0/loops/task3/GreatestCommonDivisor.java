package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int firstNum, int secondNum) {
        while (secondNum != 0) {
            int temp = secondNum;
            secondNum = firstNum % secondNum;
            firstNum = temp;
        }
        System.out.println(firstNum);
    }

    public static void main(String[] args) {
        GreatestCommonDivisor commonDivisor = new GreatestCommonDivisor();
        commonDivisor.printGCD(40,16);
    }
}

