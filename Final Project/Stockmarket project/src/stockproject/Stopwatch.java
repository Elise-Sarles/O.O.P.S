package stockproject;

/**
 * <h1> Stop watch </h1>
 * 
 * <p>Created: Jan 28 to Feb 16 2022 </p>
 * 
 * @author Elise Sarles
 *
 */
public class Stopwatch {
	private long startTime = 0; 
	private long stopTime = 0; 
	private boolean running = false; 
	/**
	 * Makes the stop watch
	 */
	public Stopwatch() {
		
	}
	/**
	 * Starts the stop watch
	 */
	public void start() { 
		this.startTime = System.currentTimeMillis(); 
		this.running = true; 
		} 
	/**
	 * Ends the stop watch
	 */
	public void stop() { 
		this.stopTime = System.currentTimeMillis(); 
		this.running = false; 
	}
	/**
	 * gets time in milliseconds 
	 * @return elapsed (long; time stop watch ran in milliseconds)
	 */
	public long getTime() { 
		long elapsed; 
		if (running) { 
			elapsed = (System.currentTimeMillis() - startTime); 
			} 
		else { 
			elapsed = (stopTime - startTime);
			}
		return elapsed;
	}
	/**
	 * gets time in seconds
	 * @return elapsed (long; time stop watch ran in seconds)
	 */
	public long getTimeSecs() { 
		long elapsed;
		if (running) { 
			elapsed = ((System.currentTimeMillis() - startTime) / 1000);
			} 
		else { elapsed = ((stopTime - startTime) / 1000);
		} 
		return elapsed;
	}
	/**
	 * gets time in minutes
	 * @return elapsed (long; time stop watch ran in minutes)
	 */
	public long getTimeMin() {
		long elapsed;
		if (running) { 
			elapsed = (((System.currentTimeMillis() - startTime) / 1000) / 60 );
			} 
		else { elapsed = (((stopTime - startTime) / 1000) / 60);
		} 
		return elapsed;
	}

}
