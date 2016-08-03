package fr.idm.Racing;

public class TimeDuration {
	private int seconds;
	private int hours;
	private int minuts;
	public TimeDuration(int duration) throws BadBadValueException {
		if (duration <0)
			throw new BadBadValueException("un nombre negatif");
		this.hours = duration/3600;
		this.minuts = (duration%3600)/60;
		this.seconds = ((duration%3600)%60);
	}
	@Override
	public String toString() {
		return hours + "h " + minuts+ "m "+ seconds+"s ";
	}
	public int getSeconds() {
		return seconds;
	}
	public void setSeconds(int seconds) {
		this.seconds = seconds;
	}
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	public int getMinuts() {
		return minuts;
	}
	public void setMinuts(int minuts) {
		this.minuts = minuts;
	}
	
	

}
