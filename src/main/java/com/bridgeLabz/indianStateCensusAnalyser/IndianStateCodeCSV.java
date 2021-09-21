package com.bridgeLabz.indianStateCensusAnalyser;

import com.opencsv.bean.CsvBindByName;

public class IndianStateCodeCSV {

	@CsvBindByName(column = "State")
	String state;

	@CsvBindByName(column = "StateCode")
	int stateCode;

	@Override
	public String toString() {
		return "IndianStateCodeCSV [state=" + state + ", stateCode=" + stateCode + "]";
	}

}
