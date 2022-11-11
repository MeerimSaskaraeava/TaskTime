public class Time {
    private int[] hour;
    private int[] minute;
    private int[] second;

    //public Time(){}


    public Time(int[] hour, int[] minute, int[] second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }



    public int[] getHour() {
        return hour;
    }

    public int[] getMinute() {
        return minute;
    }

    public int[] getSecond() {
        return second;
    }

    String getTime(int[] hour, int[] minute, int[] second) {
        int a = 0;
        int b = 0;
        int c = 0;

        for (int i = 0; i < hour.length; i++)
            for (int j = 0; j < minute.length; j++)
                for (int k = 0; k < second.length; k++) {
                    if (i == 1 && j == 2 && k == 3)
                        System.out.println("0" + i + ":" + "0" + j + ":" + "0" + k);
                }
        for (int i = 0; i < hour.length; i++)
            for (int j = 0; j < minute.length; j++)
                for (int k = 0; k < second.length; k++) {
                    if (i == 4 && j == 5 && k == 6)
                        System.out.println("0" + i + ":" + "0" + j + ":" + "0" + k);
                }
        for (int i = 0; i < hour.length; i++)
            for (int j = 0; j < minute.length; j++)
                for (int k = 0; k < second.length; k++) {
                    a = i + 1;
                    b = j + 1;
                    c = k+1;
                    if (i == 4 && j == 5 && k == 6)
                        System.out.println("Hour: " + i + "\n" +
                                "Minute: " + j + "\n" +
                                "Second: " + k);
                }

        if (a > 23 || b > 59 || c > 59) {
            a=0;b=0;c=0;
            return ("0"+a + ":0" + b + ":0" + (c));
        } else if (a < 23 && b < 59 && c < 59) {
            return (a + ":" + b + ":" + (c));}
        return (a + ":" + b + ":" + (c));
    }

    String nextSecond(int[] hour, int[] minute, int[] second) {
        int a = 0;
        int b = 0;
        int c = 0;
        for (int i = 0; i < hour.length; i++)
            for (int j = 0; j < minute.length; j++)
                for (int k = 0; k < second.length; k++) {
                    a = i + 2;
                    b = j + 2;
                    c = k + 2;
                }
        if (a > 23 || b > 59 || c > 59) {
            a=0;b=0;c=0;
            return ("0"+a + ":0" + b + ":0" + (c));
        } else if (a < 23 && b < 59 && c < 59) {
            return (a + ":" + b + ":" + (c));}


        return (a + ":" + b + ":" + (c));
    }
    String previousSecond(int[] hour, int[] minute, int[] second) {
        int a = 0;
        int b = 0;
        int c = 0;
        for (int i = 0; i < hour.length; i++)
            for (int j = 0; j < minute.length; j++)
                for (int k = 0; k < second.length; k++) {
                    a = i + 1;
                    b = j + 1;
                    c = k ;
                }
        if (a > 23 || b > 59 || c > 59) {
            a=0;b=0;c=0;
            return ("0"+a + ":0" + b + ":0" + (c));
        } else if (a < 23 && b < 59 && c < 59) {
            return (a + ":" + b + ":" + (c));}


        return (a + ":" + b + ":" + (c));
    }
}

        //String previousSecond(int[] hour, int[] minute, int[] second){

        //return (hour-1)+":"+(minute-1)+":"+(second+2);



