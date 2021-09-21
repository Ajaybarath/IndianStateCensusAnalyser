package com.bridgeLabz.indianStateCensusAnalyser;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import com.bridgeLabz.indianStateCensusAnalyser.CensusAnalyserException.ExceptionType;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

public class CSVStateCensus {

	public int loadIndianStateCensusData(String csvFilePath) throws CensusAnalyserException {

		try {
			Reader reader = Files.newBufferedReader(Paths.get(csvFilePath));

			CsvToBean<IndianCensusCSV> csvToBean = new CsvToBeanBuilder<IndianCensusCSV>(reader)
					.withType(IndianCensusCSV.class).withIgnoreLeadingWhiteSpace(true).build();

			Iterator<IndianCensusCSV> iterator = csvToBean.iterator();

			Iterable<IndianCensusCSV> csvIterable = () -> iterator;

			int numberOfEnteries = (int) StreamSupport.stream(csvIterable.spliterator(), false).count();

			return numberOfEnteries;
		} catch (IOException e) {
			throw new CensusAnalyserException(e.getMessage(), ExceptionType.CENSUS_FILE_PROBLEM);
		} catch (IllegalStateException e) {
			throw new CensusAnalyserException(e.getMessage(), ExceptionType.UNABLE_TO_PARSE);
		} catch (RuntimeException e) {
			throw new CensusAnalyserException(e.getMessage(), ExceptionType.CENSUS_HEADER_PROBLEM);
		}

	}
	
	
	public int loadIndianStateCode(String csvFilePath) throws CensusAnalyserException {
		try {
			Reader reader = Files.newBufferedReader(Paths.get(csvFilePath));

			CsvToBean<IndianStateCodeCSV> csvToBean = new CsvToBeanBuilder<IndianStateCodeCSV>(reader)
					.withType(IndianStateCodeCSV.class).withIgnoreLeadingWhiteSpace(true).build();

			Iterator<IndianStateCodeCSV> iterator = csvToBean.iterator();

			Iterable<IndianStateCodeCSV> csvIterable = () -> iterator;

			int numberOfEnteries = (int) StreamSupport.stream(csvIterable.spliterator(), false).count();

			return numberOfEnteries;
		} catch (IOException e) {
			throw new CensusAnalyserException(e.getMessage(), ExceptionType.CENSUS_FILE_PROBLEM);
		} catch (IllegalStateException e) {
			throw new CensusAnalyserException(e.getMessage(), ExceptionType.UNABLE_TO_PARSE);
		} catch (RuntimeException e) {
			throw new CensusAnalyserException(e.getMessage(), ExceptionType.CENSUS_HEADER_PROBLEM);
		}
	}

}
