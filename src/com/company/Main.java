package com.company;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        String str = "Nowy rekord: " + new Date().getTime();

	    String fileName = "daty.txt";

	    try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
            writer.append("\r\n");
            writer.append(str);

            writer.close();
        }catch (IOException e ){
	        System.out.println(e);
        }
    }
}
