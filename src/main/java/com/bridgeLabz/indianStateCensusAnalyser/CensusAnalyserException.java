package com.bridgeLabz.indianStateCensusAnalyser;

public class CensusAnalyserException extends Exception {
	
	public enum ExceptionType {
		CENSUS_FILE_PROBLEM,
		UNABLE_TO_PARSE,
		CENSUS_HEADER_PROBLEM,

	};
	
	public ExceptionType type;
	
	public CensusAnalyserException(String message, ExceptionType type) {
		super(message);
		
		this.type = type;
	}

}
