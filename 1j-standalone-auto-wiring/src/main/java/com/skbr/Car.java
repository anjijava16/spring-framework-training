package com.skbr;

public class Car {
	
	private AudioSystem audioSystem;
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
