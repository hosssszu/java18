package homework05;

import java.io.Serializable;

public class People implements Serializable {

    private int athleteNumber;
    private String athleteName;
    private String countryCode;
    private String skiTimeResult;
    private String firstShootingRange;
    private String secondShootingRange;
    private String thirdShootingRange;

    public People(int athleteNumber, String athleteName, String countryCode, String skiTimeResult, String firstShootingRange, String secondShootingRange, String thirdShootingRange) {
        this.athleteNumber = athleteNumber;
        this.athleteName = athleteName;
        this.countryCode = countryCode;
        this.skiTimeResult = skiTimeResult;
        this.firstShootingRange = firstShootingRange;
        this.secondShootingRange = secondShootingRange;
        this.thirdShootingRange = thirdShootingRange;
    }

    //calculating the seconds to make the order
    public int second() {

        String[] someString = {firstShootingRange, secondShootingRange, thirdShootingRange};
        int count = 0;

        for (int i = 0; i < someString.length; i++) {
            for (int j = 0; j < someString[i].length(); j++) {
                if (someString[i].charAt(j) == 'o') {
                    count = count + 10;
                }
            }
        }

        String[] arr = skiTimeResult.split(":");
        int x = Integer.parseInt(arr[0]);   //min
        int y = Integer.parseInt(arr[1]);   //sec
        int s = count + y + x * 60;
        return s;
    }

    //returning the penalty time
    public int second2() {

        String someString[] = {firstShootingRange, secondShootingRange, thirdShootingRange};
        int count = 0;

        for (int i = 0; i < someString.length; i++) {
            for (int j = 0; j < someString[i].length(); j++) {
                if (someString[i].charAt(j) == 'o') {
                    count = count + 10;
                }
            }
        }
        return count;
    }

    //displaying the final time
    public String second3() {

        String someString[] = {firstShootingRange, secondShootingRange, thirdShootingRange};
        int count = 0;

        for (int i = 0; i < someString.length; i++) {
            for (int j = 0; j < someString[i].length(); j++) {
                if (someString[i].charAt(j) == 'o') {
                    count = count + 10;
                }
            }
        }

        String[] arr = skiTimeResult.split(":");
        int x = Integer.parseInt(arr[0]);   //min
        int y = Integer.parseInt(arr[1]);   //sec

        int s1 = y + count;
        int s2 = s1 % 60;
        int s3 = s1 / 60;
        int s4 = x + s3;
        String s5 = "";

        if (s2 < 10) {
            if (s1 < 60) {
                s5 = x + ":0" + s1;
            } else {
                s5 = s4 + ":0" + s2;
            }
        } else {
            if (s1 < 60) {
                s5 = x + ":" + s1;
            } else {
                s5 = s4 + ":" + s2;
            }
        }
        return s5;
    }

    public String toString() {
        return String.format("%s - %s (%s + %s)", athleteName, second3(), skiTimeResult, second2());
    }
}