package com.bridgeLabz.indianStateCensusAnalyser;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

public class CSVStateCensus {

	public int loadIndianStateCensusData(String csvFilePath) {

		try {
			Reader reader = Files.newBufferedReader(Paths.get(csvFilePath));

			CsvToBean<IndianCensusCSV> csvToBean = new CsvToBeanBuilder<IndianCensusCSV>(reader).withType(IndianCensusCSV.class)
					.withIgnoreLeadingWhiteSpace(true).build();

			Iterator<IndianCensusCSV> iterator = csvToBean.iterator();

			Iterable<IndianCensusCSV> csvIterable = () -> iterator;

			int numberOfEnteries = (int) StreamSupport.stream(csvIterable.spliterator(), false).count();

			return numberOfEnteries;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
		return 0;

	}

}
