package by.rapublic.webra.beans;

import javax.persistence.*;

@Entity
@Table(name="user")
public class User {
	private Long id;
	private String firstName;
	private String middleName;
	private String lastName;
	private Role role;
	private String password;
	private String login;
	private String eMail;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param firstName
	 * @param middleName
	 * @param lastName
	 * @param role
	 * @param password
	 * @param login
	 * @param eMail
	 */
	public User(Long id, String firstName, String middleName, String lastName,
			Role role, String password, String login, String eMail) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.role = role;
		this.password = password;
		this.login = login;
		this.eMail = eMail;
	}

	/**
	 * @return the id
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the firstName
	 */
	@Column(name="FIRST_NAME")
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the middleName
	 */
	@Column(name="MIDDLE_NAME")
	public String getMiddleName() {
		return middleName;
	}

	/**
	 * @param middleName the middleName to set
	 */
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	/**
	 * @return the lastName
	 */
	@Column(name="LAST_NAME")
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the role
	 */
	
	public Role getRole() {
		return role;
	}

	/**
	 * @param role the role to set
	 */
	public void setRole(Role role) {
		this.role = role;
	}

	/**
	 * @return the password
	 */
	@Column(name="PASSWORD")
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the login
	 */
	@Column(name="LOGIN")
	public String getLogin() {
		return login;
	}

	/**
	 * @param login the login to set
	 */
	public void setLogin(String login) {
		this.login = login;
	}

	/**
	 * @return the eMail
	 */
	@Column(name="E_MAIL")
	public String geteMail() {
		return eMail;
	}

	/**
	 * @param eMail the eMail to set
	 */
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "User [id=" + id + ", firstName=" + firstName + ", middleName="
				+ middleName + ", lastName=" + lastName + ", role=" + role
				+ ", password=" + password + ", login=" + login + ", eMail="
				+ eMail + "]";
	}
	
	
	
	
}
