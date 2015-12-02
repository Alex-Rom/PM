package ro.jademy.domain;
public class User {

	private String prenume;
	private String nume;
	private String email;
	private String password;
	private String telefon;
	private String cod_reset_pass;
	public User(String prenume, String nume, String email, String password, String telefon, String cod_reset_pass) {
		super();
		this.prenume = prenume;
		this.nume = nume;
		this.email = email;
		this.password = password;
		this.telefon = telefon;
		this.cod_reset_pass = cod_reset_pass;
	}
	public String getPrenume() {
		return prenume;
	}
	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getTelefon() {
		return telefon;
	}
	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}
	public String getCod_reset_pass() {
		return cod_reset_pass;
	}
	public void setCod_reset_pass(String cod_reset_pass) {
		this.cod_reset_pass = cod_reset_pass;
	}
	
}
