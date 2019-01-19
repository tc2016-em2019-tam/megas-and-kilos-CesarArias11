package com.company;

public class MegaByteConverter {

    private int kilobytes = 0;

    public MegaByteConverter(int kilobytes) throws Exception{
        if (kilobytes < 0) {
            throw new Exception("Kilobytes have to be positive numbers");
        }
        this.kilobytes = kilobytes;
    }

    public int getKilobytes() {
        return kilobytes;
    }

    public void setKilobytes(int kilobytes) throws Exception{
        if (kilobytes < 0){
            throw new Exception("Kilobytes have to be positive numbers");
        }
        this.kilobytes = kilobytes;
    }

    public static void printMegaBytesAndKiloBytes(int kilobytes){
        int kb = kilobytes / 1024;
        int remaining = kilobytes % 1024;

        if (remaining > 0) {
            System.out.println(kilobytes + "KB = " + kb + " MB and " + remaining + " KB");
        } else {
            System.out.println(kilobytes + " KB = " + kb + " MB");
        }

    }
}

