import java.io.IOException;

public class JavaCSVTest {

	public static void main(String[] args) throws IOException {
		int[][] Matrix = {{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4}};
		JavaCSV myjavacsv = new JavaCSV(Matrix, "H:/test.csv");
		myjavacsv.save();
		
	}

}
