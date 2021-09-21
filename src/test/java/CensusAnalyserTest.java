import org.junit.Assert;
import org.junit.Test;

import com.bridgeLabz.indianStateCensusAnalyser.CSVStateCensus;
import com.bridgeLabz.indianStateCensusAnalyser.CensusAnalyserException;

public class CensusAnalyserTest {

	static final String CSV_PATH = "src\\main\\resources\\stateCensusFile.csv";
	static final String WRONG_CSV_PATH = "src\\main\\resources\\wrongFilePath.csv";
	static final String WRONG_CSV_FILE = "src\\main\\resources\\wrongFile.csv";
	static final String WRONG_CSV_FILE_TYPE = "src\\main\\resources\\wrongFileType.txt";

	static final String INDIAN_STATE_CODE = "src\\main\\resources\\indianStateCode.csv";
	static final String WRONG_INDIAN_STATE_CODE_FILE = "src\\main\\resources\\indianStateCodeWrongFile.txt";


	@Test
	public void checkStateCensusAnalyserData() {

		CSVStateCensus stateCensus = new CSVStateCensus();

		int count;
		try {
			count = stateCensus.loadIndianStateCensusData(CSV_PATH);
			Assert.assertEquals(7, count);

		} catch (CensusAnalyserException e) {
		}

	}

	@Test
	public void checkStateCensusAnalyserDataWithWrongFile() {

		CSVStateCensus stateCensus = new CSVStateCensus();

		int count;
		try {
			count = stateCensus.loadIndianStateCensusData(WRONG_CSV_PATH);
		} catch (CensusAnalyserException e) {
			Assert.assertEquals(CensusAnalyserException.ExceptionType.CENSUS_FILE_PROBLEM, e.type);
		}

	}
	
	@Test
	public void checkStateCensusAnalyserDataWithWrongFileType() {

		CSVStateCensus stateCensus = new CSVStateCensus();

		int count;
		try {
			count = stateCensus.loadIndianStateCensusData(WRONG_CSV_FILE_TYPE);
		} catch (CensusAnalyserException e) {
			Assert.assertEquals(CensusAnalyserException.ExceptionType.CENSUS_FILE_PROBLEM, e.type);
		}

	}
	
	@Test
	public void checkStateCensusAnalyserDataWithWrongDelimeter() {

		CSVStateCensus stateCensus = new CSVStateCensus();

		int count;
		try {
			count = stateCensus.loadIndianStateCensusData(WRONG_CSV_FILE);
		} catch (CensusAnalyserException e) {
			Assert.assertEquals(CensusAnalyserException.ExceptionType.CENSUS_HEADER_PROBLEM, e.type);
		}

	}
	
	@Test
	public void checkStateCensusAnalyserDataWithWrongHeader() {

		CSVStateCensus stateCensus = new CSVStateCensus();

		int count;
		try {
			count = stateCensus.loadIndianStateCensusData(WRONG_CSV_FILE);
		} catch (CensusAnalyserException e) {
			Assert.assertEquals(CensusAnalyserException.ExceptionType.CENSUS_HEADER_PROBLEM, e.type);
		}

	}
	
	@Test
	public void checkStateCodeCountWithCSVFile() {

		CSVStateCensus stateCensus = new CSVStateCensus();

		int count;
		try {
			count = stateCensus.loadIndianStateCode(INDIAN_STATE_CODE);
			Assert.assertEquals(8, count);

		} catch (CensusAnalyserException e) {
		}

	}
}
