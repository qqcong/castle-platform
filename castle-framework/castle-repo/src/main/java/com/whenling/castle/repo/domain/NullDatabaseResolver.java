package com.whenling.castle.repo.domain;

public class NullDatabaseResolver implements DatabaseResolver {

	@Override
	public String resolveDatabaseName() {
		return null;
	}

	@Override
	public void setCurrentDatabase(String database) {
		
	}

	@Override
	public void setDefaultDatabase() {
		
	}

	@Override
	public void reset() {
		
	}

}
