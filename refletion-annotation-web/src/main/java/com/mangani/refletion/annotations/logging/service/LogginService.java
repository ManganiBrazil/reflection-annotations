package com.mangani.refletion.annotations.logging.service;

public interface LogginService {
	
	void registerInformation(String information);
	void registerError(String error);
	void registerWarning(String warning);
}
