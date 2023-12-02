package view;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GeradorNumeros {
    public static void main(String[] args) {
        int[] desiredNumbers = {20, 10, 11, 25, 13, 24, 14, 05, 03, 12, 04, 22}; // Números desejados com peso ligeiramente maior

        int numberOfRandomNumbers = 11; // Quantidade de números aleatórios desejados

        List<Integer> randomNumbers = generateRandomNumbers(numberOfRandomNumbers, desiredNumbers);

        // Imprimir os números gerados
        for (int number : randomNumbers) {
            System.out.println(number);
        }
    }

    private static List<Integer> generateRandomNumbers(int numberOfRandomNumbers, int[] desiredNumbers) {
        Random random = new Random();
        List<Integer> randomNumbers = new ArrayList<>();

        for (int i = 0; i < numberOfRandomNumbers; i++) {
            if (random.nextDouble() < 0.2) { // 20% de chance de gerar um número desejado
                int randomIndex = random.nextInt(desiredNumbers.length);
                randomNumbers.add(desiredNumbers[randomIndex]);
            } else {
                int randomNumber = random.nextInt(60) + 1; // Gerar um número aleatório entre 1 e 60
                randomNumbers.add(randomNumber);
            }
        }

        return randomNumbers;
    }
}
