package test.TestNG;

import java.io.FileReader;
import java.util.List;

import com.opencsv.CSVReader;

public class CsvUtil {
public static Object[][] getCSVData(String path)throws Exception{
	CSVReader reader = new CSVReader(new FileReader(path));
	List<String[]> data=reader.readAll();
	data.remove(0);//header
	reader.close();
	return data.toArray(new Object[0][]);
}
}
