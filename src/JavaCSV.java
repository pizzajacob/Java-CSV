/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author BernJaco2427
 */
import java.util.*;
import java.io.*;

public class JavaCSV {

    private int[][] Data;
    private String[] stringData;
    private String stringDataFinal;
    private String fileName = "test.csv";

    public JavaCSV(int[][] data, String fileName) {
        this.Data = data;
        this.fileName = fileName;
    }

    public JavaCSV(int[][] data) {
        this.Data = data;
    }

    public void save() throws IOException {
        stringData = new String[Data.length];
        for (int i = 0; i < Data.length; i++) {
            stringData[i] = Arrays.toString(Data[i]);
        }
        
        for (int i = 0; i < stringData.length; i++) {
            
            stringDataFinal += stringData[i];
            stringDataFinal += "\n";
        }
        System.out.println(stringDataFinal);
        stringDataFinal = stringDataFinal.substring(4, stringDataFinal.length());
        System.out.println(stringDataFinal);
        FileWriter document = new FileWriter(fileName);
        BufferedWriter bufDocument = new BufferedWriter(document);
        bufDocument.write(stringDataFinal);
        bufDocument.close();
    }
}
