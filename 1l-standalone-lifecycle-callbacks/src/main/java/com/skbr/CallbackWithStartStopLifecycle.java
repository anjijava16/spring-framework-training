package com.skbr;

import org.springframework.context.Lifecycle;

public class CallbackWithStartStopLifecycle implements Lifecycle{

	@Override
	public boolean isRunning() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void start() {
		System.out.println("Inside CallbackWithStartStopLifecycle.start");
		
	}

	@Override
	public void stop() {
		System.out.println("Inside CallbackWithStartStopLifecycle.stop");
		
	}
}
