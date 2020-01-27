package com.main;
import com.google.appengine.api.datastore.Text;


public class ClockBean {
 
	private long start;
	private long end;
	private long total;	
	private String description;
	private Text descriptionText;
	public Text getDescriptionText() {
		return descriptionText;
	}
	public void setDescriptionText(Text descriptionText) {
		this.descriptionText = descriptionText;
	}
	public long getStart() {
		return start;
	}
	public void setStart(long start) {
		this.start = start;
	}
	public long getEnd() {
		return end;
	}
	public void setEnd(long l) {
		this.end = l;
	}
	public long getTotal() {
		return total;
	}
	public void setTotal(long total) {
		this.total = total;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public Text toText(String description)
	{
		this.descriptionText = new Text(description);
		return descriptionText;
	}
	
	public String toString(Text descriptionText )
	{
		this.description = descriptionText.getValue();
		return description;
	}
	
	
}
