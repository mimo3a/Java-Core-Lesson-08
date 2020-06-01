 /* Logos Academy*/

package ua.lviv.lga.enumerations;

/***
 * @since java 1.8
 * @author mimo3a
 * @version 1.1
 * 
 * 
 */

public enum Months {
	JANUARY(31, Seasons.WINTER),
	FEBRUARY(28, Seasons.WINTER),
	MARCH(31, Seasons.SPRING),
	APRIL(30, Seasons.SPRING),	
	MAY(31, Seasons.SPRING),	
	JUNE(30, Seasons.SUMMER),
	JULY(31, Seasons.SUMMER),
	AUGUST(31, Seasons.SUMMER),
	SEPTEMBER(30, Seasons.FALL),
	OCTOBER(31, Seasons.FALL),
	NOVEMBER(30, Seasons.FALL),
	DECEMBER(31, Seasons.WINTER);	
	
	private int days;
	private Seasons season;
	
	/*docs for strings and integer*/
	
	Months(int days, Seasons season) {
		this.days = days;
		this.season = season;
	}
	/*This is constructor*/

	public int getDays() {
		return days;
	}

	public Seasons getSeason() {
		return season;
	}
	
	
	

}
