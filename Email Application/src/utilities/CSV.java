package utilities;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class CSV {
	
	//this method will read data a CSV file and return  as a list
	public static List<String[]> read(String file){
		List<String[]> datas = new LinkedList<>();
		String dataRow;
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			while((dataRow = br.readLine()) != null){
				String[] dataRecords = dataRow.split(",");
				datas.add(dataRecords);
			}
		} catch (FileNotFoundException e) {
			System.out.println("COULD NOT FIND FILE!");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("COULD NOT READ FILE!");
			e.printStackTrace();
		}
		
		return datas;
	}
	
}
