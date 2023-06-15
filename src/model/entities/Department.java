package model.entities;

import java.io.Serializable;
import java.util.Objects;

public class Department implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Integer Id;
	private String Name;
	
	public Department() {
	}

	public Department(Integer id, String name) {
		Id = id;
		Name = name;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Department other = (Department) obj;
		return Objects.equals(Id, other.Id);
	}

	@Override
	public String toString() {
		return "Department [Id=" + Id + ", Name=" + Name + "]";
	}
}
