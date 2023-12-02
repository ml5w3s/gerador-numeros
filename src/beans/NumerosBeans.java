package beans;

public class NumerosBeans {
    private int[] desiredNumbers = {20, 10, 11, 25, 13, 24, 14, 05, 03, 12, 04, 22}; // Números desejados com peso ligeiramente maior
    private int numberOfRandomNumbers = 15; // Quantidade de números aleatórios desejados

    public int[] getDesiredNumbers() {
        return desiredNumbers;
    }

    public void setDesiredNumbers(int[] desiredNumbers) {
        this.desiredNumbers = desiredNumbers;
    }

    public int getNumberOfRandomNumbers() {
        return numberOfRandomNumbers;
    }

    public void setNumberOfRandomNumbers(int numberOfRandomNumbers) {
        this.numberOfRandomNumbers = numberOfRandomNumbers;
    }

}
