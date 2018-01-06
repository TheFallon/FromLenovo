package com.saj.useFinalize;

public class MyFinalizeTest {
	private boolean resourcesInUse;
	
	public synchronized void allocateResources() {
		performAllocate();
		resourcesInUse = true;
	}
	
	public synchronized void releaseResources() {
		performRelease();
		resourcesInUse = false;
	}
	
	/**
	 *  If we're still holding resources, release the now.
	 */
	protected synchronized void finalize() throws Throwable {
		if(resourcesInUse) {
			releaseResources();
		}
	}
	
	// Allocate resources here
	protected void performAllocate() {
		// Allocate some resource.
	}
	
	// Release resources here.
	protected void performRelease() {
		// Release some resource.
	}
}
