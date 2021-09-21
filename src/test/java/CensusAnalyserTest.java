import org.junit.Assert;
import org.junit.Test;

import com.bridgeLabz.indianStateCensusAnalyser.CSVStateCensus;

public class CensusAnalyserTest {

	static final String CSV_PATH = "stateCensusFile.csv";
	
	@Test
	public void checkStateCensusAnalyserData() {
		
		CSVStateCensus stateCensus = new CSVStateCensus();
		
		int count = stateCensus.loadIndianStateCensusData(CSV_PATH);
		
		Assert.assertEquals(6, count);
	}
 }
