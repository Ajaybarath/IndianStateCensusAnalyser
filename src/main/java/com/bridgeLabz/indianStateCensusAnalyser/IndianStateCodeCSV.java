package com.bridgeLabz.indianStateCensusAnalyser;

import com.opencsv.bean.CsvBindByName;

public class IndianStateCodeCSV {

	@CsvBindByName(column = "State", required = true)
	String state;

	@CsvBindByName(column = "StateCode", required = true)
	int stateCode;

	@Override
	public String toString() {
		return "IndianStateCodeCSV [state=" + state + ", stateCode=" + stateCode + "]";
	}

}
