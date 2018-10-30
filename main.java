import java.util.*;
import java.io.*;

public class JavaCSV {
	
	private int[][] Data;
	private String[] stringData;
	private String stringDataFinal;
	
	public JavaCSV(int[][] data) {
		this.Data = data;
	}
	
	private format() {
		for (int i = 0; i < data.length(); i++) {
		   	stringData[i] = Data[i].toString();
		   	stringData[i] = stringData[i]getClass().substring(1,stringData[i].length());
		}
		
		for (int i = 0; i < stringData.length(); i++) {
			stringDataFinal+=stringData[i];
			stringDataFinal+="\n";
		}
	}
}


