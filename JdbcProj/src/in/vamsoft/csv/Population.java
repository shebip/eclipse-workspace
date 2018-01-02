package in.vamsoft.csv;

public class Population {
	int stateCode;
	int districtCode;
	int SubDistrictCode;
	String areaName;
	String villages;
	double totalPopulation;
	double malePopulation;
	double femalePopulation;
	public Population(int stateCode, int districtCode, int subDistrictCode, String areaName, String villages,
			double totalPopulation, double malePopulation, double femalePopulation) {
		super();
		this.stateCode = stateCode;
		this.districtCode = districtCode;
		SubDistrictCode = subDistrictCode;
		this.areaName = areaName;
		this.villages = villages;
		this.totalPopulation = totalPopulation;
		this.malePopulation = malePopulation;
		this.femalePopulation = femalePopulation;
	}
	public int getStateCode() {
		return stateCode;
	}
	public void setStateCode(int stateCode) {
		this.stateCode = stateCode;
	}
	public int getDistrictCode() {
		return districtCode;
	}
	public void setDistrictCode(int districtCode) {
		this.districtCode = districtCode;
	}
	public int getSubDistrictCode() {
		return SubDistrictCode;
	}
	public void setSubDistrictCode(int subDistrictCode) {
		SubDistrictCode = subDistrictCode;
	}
	public String getAreaName() {
		return areaName;
	}
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}
	public String getVillages() {
		return villages;
	}
	public void setVillages(String villages) {
		this.villages = villages;
	}
	public double getTotalPopulation() {
		return totalPopulation;
	}
	public void setTotalPopulation(double totalPopulation) {
		this.totalPopulation = totalPopulation;
	}
	public double getMalePopulation() {
		return malePopulation;
	}
	public void setMalePopulation(double malePopulation) {
		this.malePopulation = malePopulation;
	}
	public double getFemalePopulation() {
		return femalePopulation;
	}
	public void setFemalePopulation(double femalePopulation) {
		this.femalePopulation = femalePopulation;
	}
	@Override
	public String toString() {
		return "Population [stateCode=" + stateCode + ", districtCode=" + districtCode + ", SubDistrictCode="
				+ SubDistrictCode + ", areaName=" + areaName + ", villages=" + villages + ", totalPopulation=" + totalPopulation
				+ ", malePopulation=" + malePopulation + ", femalePopulation=" + femalePopulation + "]";
	}

}
