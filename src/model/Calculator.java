package model;


import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class Calculator {

    private String input;

    public Calculator(String input) {
        this.input = input;

    }

    public void calculation() {
        String[] arr = getInput().split(" ");

        if (isValid(arr)) {

            int iteration = 0;

            if (arr.length == 5) {
                if ((Objects.equals(arr[1], "+")) && (Objects.equals(arr[3], "+"))) {
                    iteration = Integer.parseInt(arr[0]) + Integer.parseInt(arr[2]) + Integer.parseInt(arr[4]);
                }else if ((Objects.equals(arr[1], "-")) && (Objects.equals(arr[3], "-"))) {
                    iteration = Integer.parseInt(arr[0]) - Integer.parseInt(arr[2]) - Integer.parseInt(arr[4]);
                }else if ((Objects.equals(arr[1], "*")) && (Objects.equals(arr[3], "*"))) {
                    iteration = Integer.parseInt(arr[0]) * Integer.parseInt(arr[2]) * Integer.parseInt(arr[4]);
                } else if ((Objects.equals(arr[1], "/")) && (Objects.equals(arr[3], "/"))) {
                    iteration = Integer.parseInt(arr[0]) / Integer.parseInt(arr[2]) / Integer.parseInt(arr[4]);
                }

                if ((Objects.equals(arr[1], "+")) && (Objects.equals(arr[3], "-"))) {
                    iteration = Integer.parseInt(arr[0]) + Integer.parseInt(arr[2]) - Integer.parseInt(arr[4]);
                } else if ((Objects.equals(arr[1], "+")) && (Objects.equals(arr[3], "*"))) {
                    iteration = Integer.parseInt(arr[0]) + (Integer.parseInt(arr[2]) * Integer.parseInt(arr[4]));
                } else if ((Objects.equals(arr[1], "+")) && (Objects.equals(arr[3], "/"))) {
                    iteration = Integer.parseInt(arr[0]) + (Integer.parseInt(arr[2]) / Integer.parseInt(arr[4]));
                }

                if ((Objects.equals(arr[1], "-")) && (Objects.equals(arr[3], "+"))) {
                    iteration = Integer.parseInt(arr[0]) - Integer.parseInt(arr[2]) + Integer.parseInt(arr[4]);
                } else if ((Objects.equals(arr[1], "-")) && (Objects.equals(arr[3], "*"))) {
                    iteration = Integer.parseInt(arr[0]) - (Integer.parseInt(arr[2]) * Integer.parseInt(arr[4]));
                } else if ((Objects.equals(arr[1], "-")) && (Objects.equals(arr[3], "/"))) {
                    iteration = Integer.parseInt(arr[0]) - (Integer.parseInt(arr[2]) / Integer.parseInt(arr[4]));
                }

                if ((Objects.equals(arr[1], "*")) && (Objects.equals(arr[3], "+"))) {
                    iteration = ((Integer.parseInt(arr[0]) * Integer.parseInt(arr[2])) + Integer.parseInt(arr[4]));
                } else if ((Objects.equals(arr[1], "*")) && (Objects.equals(arr[3], "-"))) {
                    iteration = ((Integer.parseInt(arr[0]) * Integer.parseInt(arr[2])) - Integer.parseInt(arr[4]));
                } else if ((Objects.equals(arr[1], "*")) && (Objects.equals(arr[3], "/"))) {
                    iteration = ((Integer.parseInt(arr[0]) * Integer.parseInt(arr[2])) / Integer.parseInt(arr[4]));
                }

                if ((Objects.equals(arr[1], "/")) && (Objects.equals(arr[3], "+"))) {
                    iteration = ((Integer.parseInt(arr[0]) / Integer.parseInt(arr[2])) + Integer.parseInt(arr[4]));
                } else if ((Objects.equals(arr[1], "/")) && (Objects.equals(arr[3], "-"))) {
                    iteration = ((Integer.parseInt(arr[0]) / Integer.parseInt(arr[2])) - Integer.parseInt(arr[4]));
                } else if ((Objects.equals(arr[1], "/")) && (Objects.equals(arr[3], "*"))) {
                    iteration = ((Integer.parseInt(arr[0]) / Integer.parseInt(arr[2])) * Integer.parseInt(arr[4]));
                }
            }

            if (arr.length == 3) {
                if ((Objects.equals(arr[1], "+"))) {
                    iteration = Integer.parseInt(arr[0]) + Integer.parseInt(arr[2]);
                } else if ((Objects.equals(arr[1], "-"))) {
                    iteration = Integer.parseInt(arr[0]) - Integer.parseInt(arr[2]);
                } else if ((Objects.equals(arr[1], "*"))) {
                    iteration = Integer.parseInt(arr[0]) * Integer.parseInt(arr[2]);
                } else if ((Objects.equals(arr[1], "/"))) {
                    iteration = Integer.parseInt(arr[0]) / Integer.parseInt(arr[2]);
                }
            }

            System.out.println(iteration);

        }
    }

    public boolean isValid(String @NotNull [] arr) {

        String[] checkArray = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "-", "/", "+", "*"};

        if (arr.length > 5) {
            throw new IllegalArgumentException("sorry, I can only calculate up to three numbers :/");
        }

        for(int i = 0; i < arr.length; i++){
            int j;

            for(j = 0; j < checkArray.length; j++) {
                if (Objects.equals(arr[i], checkArray[j])) {
                    break;
                }
            }

            if (j == checkArray.length) {
                throw new IllegalArgumentException("sorry, you can't use " + arr[i] + " :(");
            }
        }

        return true;
    }


    public String getInput() {
        return input;
    }

}
