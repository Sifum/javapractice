package twenty.annotationTest;

import java.util.Date;

@DBTable(name = "MEMBER")
public class Member {
	@SQLInteger(constraints=@Constraints(primaryKey=true))
	Integer id;
	@SQLString(30) 
	String firstName;
	@SQLString(50) 
	String lastName;
	@SQLInteger 
	Integer age;
	@SQLDatetime
	Date date;
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Integer getId() {return id;}
	public String getFirstName() {return firstName;}
	public String getLastName() {return lastName;}
	public Integer getAge() {return age;}
}
