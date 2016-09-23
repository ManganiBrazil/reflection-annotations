package com.mangani.refletion.annotations.logging.service.impl;

import com.mangani.refletion.annotations.logging.service.LogginService;

public class LoggingAsyncProxy implements LogginService{
	
	private LogginService service;

	public LoggingAsyncProxy(LogginService service) {
		this.service = service;
	}

	@Override
	public void registerInformation(final String information) {
		new Thread(){
			@Override
			public void run() {
				service.registerInformation(information);
			}
		}.start();
		
	}

	@Override
	public void registerError(final String error) {
		new Thread(){
			@Override
			public void run() {
				service.registerInformation(error);
			}
		}.start();
		
	}

	@Override
	public void registerWarning(final String warning) {
		new Thread(){
			@Override
			public void run() {
				service.registerInformation(warning);
			}
		}.start();
	}
}
