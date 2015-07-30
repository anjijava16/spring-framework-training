package com.skbr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Car {
	
	@Autowired
	@Qualifier("sony")
	private AudioSystem audioSystem;
	
	@Autowired
	@Qualifier("v8")
	private Engine engine;
	
	public void setAudioSystem(AudioSystem audioSystem) {
		this.audioSystem = audioSystem;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	@Override
	public String toString() {
		return "Car [audioSystem=" + audioSystem + ", engine=" + engine + "]";
	}

}
