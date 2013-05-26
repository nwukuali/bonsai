package za.ac.nwu.bonsai.businessobject;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="BON_HOLIDAY_T")
public class Holiday {
	
	@Id
	@Column(name = "ID")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "NAME")
	private String name;
	
	@Column(name = "DATE")
    private Date date;
	
	@Column(name = "TYPE")
	@Enumerated(EnumType.STRING)
	private HolidayType type;
	
	@Column(name = "DESCR")
    private String description;
    
    public Holiday() {}
    
	public Holiday(String name, Date date, HolidayType type, String description) {
		this.name = name;
		this.date = date;
		this.type = type;
		this.description = description;
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Date getDate() {
		return date;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	public HolidayType getType() {
		return type;
	}
	
	public void setType(HolidayType type) {
		this.type = type;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
}
