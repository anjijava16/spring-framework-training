package com.skbr;

public class WatchCatalogue {
	
	private WatchDatabase watchDatabase;

	public void setWatchDatabase(WatchDatabase watchDatabase) {
		this.watchDatabase = watchDatabase;
	}

	@Override
	public String toString() {
		return "WatchCatalogue [watchDatabase=" + watchDatabase + "]";
	}
	
	
}
