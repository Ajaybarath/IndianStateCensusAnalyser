package com.bridgeLabz.indianStateCensusAnalyser;

import com.opencsv.bean.CsvBindByName;

public class IndianCensusCSV {

	@CsvBindByName (column = "State name", required = true)
	private String state;

	@CsvBindByName (column = "Population", required = true)
	private int population;

	public IndianCensusCSV() {
	}

	public IndianCensusCSV(String state, int population) {
		super();
		this.state = state;
		this.population = population;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	public String getState() {
		return state;
	}

	public int getPopulation() {
		return population;
	}

	@Override
	public String toString() {
		return "IndianCensusCSV [state=" + state + ", population=" + population + "]";
	}

}
