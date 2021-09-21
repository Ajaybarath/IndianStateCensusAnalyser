package com.bridgeLabz.indianStateCensusAnalyser;

public class IndianCensusCSV {

	private String state;

	private int population;

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
