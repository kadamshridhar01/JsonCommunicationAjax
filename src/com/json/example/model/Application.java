package com.json.example.model;

import java.util.List;

public class Application {
	
	int applicationID,dependentAppID,parentId;
	
	List <EndPointList> list ;

	public int getApplicationID() {
		return applicationID;
	}

	public void setApplicationID(int applicationID) {
		this.applicationID = applicationID;
	}

	public int getDependentAppID() {
		return dependentAppID;
	}

	public void setDependentAppID(int dependentAppID) {
		this.dependentAppID = dependentAppID;
	}

	public int getParentId() {
		return parentId;
	}

	public void setParentId(int parentId) {
		this.parentId = parentId;
	}

	public List<EndPointList> getList() {
		return list;
	}

	public void setList(List<EndPointList> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "Application [applicationID=" + applicationID + ", dependentAppID=" + dependentAppID + ", parentId="
				+ parentId + ", list=" + list + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + applicationID;
		result = prime * result + dependentAppID;
		result = prime * result + ((list == null) ? 0 : list.hashCode());
		result = prime * result + parentId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Application other = (Application) obj;
		if (applicationID != other.applicationID)
			return false;
		if (dependentAppID != other.dependentAppID)
			return false;
		if (list == null) {
			if (other.list != null)
				return false;
		} else if (!list.equals(other.list))
			return false;
		if (parentId != other.parentId)
			return false;
		return true;
	}
	
	
	

}


class EndPointList{
	
	int endPointId;
	String nextProjectValue;
	String prevProjectValue;
	int rank;
	String appCategary;
	String endPointName;
	public String getPrevProjectValue() {
		return prevProjectValue;
	}
	public void setPrevProjectValue(String prevProjectValue) {
		this.prevProjectValue = prevProjectValue;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public String getAppCategary() {
		return appCategary;
	}
	public void setAppCategary(String appCategary) {
		this.appCategary = appCategary;
	}
	public String getEndPointName() {
		return endPointName;
	}
	public void setEndPointName(String endPointName) {
		this.endPointName = endPointName;
	}
	public int getEndPointId() {
		return endPointId;
	}
	public void setEndPointId(int endPointId) {
		this.endPointId = endPointId;
	}
	public String getNextProjectValue() {
		return nextProjectValue;
	}
	public void setNextProjectValue(String nextProjectValue) {
		this.nextProjectValue = nextProjectValue;
	}
	@Override
	public String toString() {
		return "EndPointList [endPointId=" + endPointId + ", nextProjectValue=" + nextProjectValue
				+ ", prevProjectValue=" + prevProjectValue + ", rank=" + rank + ", appCategary=" + appCategary
				+ ", endPointName=" + endPointName + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((appCategary == null) ? 0 : appCategary.hashCode());
		result = prime * result + endPointId;
		result = prime * result + ((endPointName == null) ? 0 : endPointName.hashCode());
		result = prime * result + ((nextProjectValue == null) ? 0 : nextProjectValue.hashCode());
		result = prime * result + ((prevProjectValue == null) ? 0 : prevProjectValue.hashCode());
		result = prime * result + rank;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EndPointList other = (EndPointList) obj;
		if (appCategary == null) {
			if (other.appCategary != null)
				return false;
		} else if (!appCategary.equals(other.appCategary))
			return false;
		if (endPointId != other.endPointId)
			return false;
		if (endPointName == null) {
			if (other.endPointName != null)
				return false;
		} else if (!endPointName.equals(other.endPointName))
			return false;
		if (nextProjectValue == null) {
			if (other.nextProjectValue != null)
				return false;
		} else if (!nextProjectValue.equals(other.nextProjectValue))
			return false;
		if (prevProjectValue == null) {
			if (other.prevProjectValue != null)
				return false;
		} else if (!prevProjectValue.equals(other.prevProjectValue))
			return false;
		if (rank != other.rank)
			return false;
		return true;
	}
	
	
	
}