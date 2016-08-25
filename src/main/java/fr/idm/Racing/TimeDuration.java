package fr.idm.Racing;

public class TimeDuration {
	private int seconds;
	private int hours;
	private int minutes;
	private int duration;
	public TimeDuration(int duration) throws BadValueException {
		if (duration <0)
			throw new BadValueException("un nombre negatif");
		this.hours = duration/3600;
		this.minutes = (duration%3600)/60;
		this.seconds = ((duration%3600)%60);
		this.setDuration(duration);
	}
	@Override
	public String toString() {
		return format();
		//return hours + "h " + minutes+ "m "+ seconds+"s ";
	}
	private String format()
	{
		if (this.hours==0){
			if(this.minutes==0)
			{
				return String.format("%ds ", seconds);
			}else
			{
				return String.format("%1$dm %2$ds ", minutes,seconds);
			}
		}else
		{
			return String.format("%1$dh %2$dm %3$ds ",hours, minutes,seconds);
		}
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
	public int getMinutes() {
		return minutes;
	}
	public void setMinutes(int minuts) {
		this.minutes = minuts;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	

}
