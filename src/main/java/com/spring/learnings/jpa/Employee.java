package com.spring.learnings.jpa;

import java.sql.Date;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Table
@Entity(name = "employee_details")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private String id;

	private String empName;

	private String designation;

	private double salary;

	private Date dob;

	private Date dateOfJoining;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "address_id", referencedColumnName = "id")
	private Address address;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "office_id", referencedColumnName = "id")
	private Office office;
	@JdbcTypeCode(SqlTypes.JSON)
	private Map<String, String> contactInfo;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "skill_id", referencedColumnName = "id")
	private List<SkillSet> skill;

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the empName
	 */
	public String getEmpName() {
		return empName;
	}

	/**
	 * @param empName the empName to set
	 */
	public void setEmpName(String empName) {
		this.empName = empName;
	}

	/**
	 * @return the designation
	 */
	public String getDesignation() {
		return designation;
	}

	/**
	 * @param designation the designation to set
	 */
	public void setDesignation(String designation) {
		this.designation = designation;
	}

	/**
	 * @return the salary
	 */
	public double getSalary() {
		return salary;
	}

	/**
	 * @param salary the salary to set
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}

	/**
	 * @return the dob
	 */
	public Date getDob() {
		return dob;
	}

	/**
	 * @param dob the dob to set
	 */
	public void setDob(Date dob) {
		this.dob = dob;
	}

	/**
	 * @return the dateOfJoining
	 */
	public Date getDateOfJoining() {
		return dateOfJoining;
	}

	/**
	 * @param dateOfJoining the dateOfJoining to set
	 */
	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	/**
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}

	/**
	 * @return the contactInfo
	 */
	public Map<String, String> getContactInfo() {
		return contactInfo;
	}

	/**
	 * @param contactInfo the contactInfo to set
	 */
	public void setContactInfo(Map<String, String> contactInfo) {
		this.contactInfo = contactInfo;
	}

	/**
	 * @return the office
	 */
	public Office getOffice() {
		return office;
	}

	/**
	 * @param office the office to set
	 */
	public void setOffice(Office office) {
		this.office = office;
	}

	/**
	 * @return the skill
	 */
	public List<SkillSet> getSkill() {
		return skill;
	}

	/**
	 * @param skill the skill to set
	 */
	public void setSkill(List<SkillSet> skill) {
		this.skill = skill;
	}

	@Override
	public int hashCode() {
		return Objects.hash(address, contactInfo, dateOfJoining, designation, dob, empName, id, office, salary, skill);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(address, other.address) && Objects.equals(contactInfo, other.contactInfo)
				&& Objects.equals(dateOfJoining, other.dateOfJoining) && Objects.equals(designation, other.designation)
				&& Objects.equals(dob, other.dob) && Objects.equals(empName, other.empName)
				&& Objects.equals(id, other.id) && Objects.equals(office, other.office)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary)
				&& Objects.equals(skill, other.skill);
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", empName=" + empName + ", designation=" + designation + ", salary=" + salary
				+ ", dob=" + dob + ", dateOfJoining=" + dateOfJoining + ", address=" + address + ", office=" + office
				+ ", contactInfo=" + contactInfo + ", skill=" + skill + "]";
	}

}
