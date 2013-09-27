package by.rapublic.webra.beans.enumbd;

import javax.persistence.*;

@MappedSuperclass
public class SystemDictionary {
	@Id
	@GeneratedValue(generator = "entityIdGenerator")
	@Column(name = "id", nullable = false, unique = true)
	private Integer id;

	@Column(name = "code", nullable = false, unique = true, length = 32)
	private String code;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
}
