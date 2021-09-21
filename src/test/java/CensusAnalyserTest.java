import org.junit.Assert;
import org.junit.Test;

import com.bridgeLabz.indianStateCensusAnalyser.CSVStateCensus;
import com.bridgeLabz.indianStateCensusAnalyser.CensusAnalyserException;

public class CensusAnalyserTest {

	static final String CSV_PATH = "src\\main\\resources\\stateCensusFile.csv";
	static final String WRONG_CSV_PATH = "src\\main\\resources\\wrongFilePath.csv";
	static final String WRONG_CSV_FILE = "src\\main\\resources\\wrongFile.csv";


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
}
