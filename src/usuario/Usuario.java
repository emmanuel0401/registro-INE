package usuario;

public class Usuario {

	private String Nombre;
	private String ApellidoPat;
	private String ApellidoMat;
	private String FechaNac;
	private String SM;
	private String MZ;
	private String LT;
	private String CP;
	private String Calle;
	private String Municipio;
	private String ClaveElector;
	private String Curp;
	private int Estado;
	private int MunicipioCod;
	private int Seccion;
	private int Localidad;
	private int Emision;
	private int Vigencia;
	private int AñoReg;
	private String Sexo;
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getApellidoPat() {
		return ApellidoPat;
	}
	public void setApellidoPat(String apellidoPat) {
		ApellidoPat = apellidoPat;
	}
	public String getApellidoMat() {
		return ApellidoMat;
	}
	public void setApellidoMat(String apellidoMat) {
		ApellidoMat = apellidoMat;
	}
	public String getFechaNac() {
		return FechaNac;
	}
	public void setFechaNac(String fechaNac) {
		FechaNac = fechaNac;
	}
	public String getSM() {
		return SM;
	}
	public void setSM(String sM) {
		SM = sM;
	}
	public String getMZ() {
		return MZ;
	}
	public void setMZ(String mZ) {
		MZ = mZ;
	}
	public String getLT() {
		return LT;
	}
	public void setLT(String lT) {
		LT = lT;
	}
	public String getCP() {
		return CP;
	}
	public void setCP(String cP) {
		CP = cP;
	}
	public String getMunicipio() {
		return Municipio;
	}
	public void setMunicipio(String municipio) {
		Municipio = municipio;
	}
	public String getClaveElector() {
		return ClaveElector;
	}
	public void setClaveElector(String claveElector) {
		ClaveElector = claveElector;
	}
	public String getCurp() {
		return Curp;
	}
	public void setCurp(String curp) {
		Curp = curp;
	}
	public int getEstado() {
		return Estado;
	}
	public void setEstado(int estado) {
		Estado = estado;
	}
	public int getMunicipioCod() {
		return MunicipioCod;
	}
	public void setMunicipioCod(int municipioCod) {
		MunicipioCod = municipioCod;
	}
	public int getSeccion() {
		return Seccion;
	}
	public void setSeccion(int seccion) {
		Seccion = seccion;
	}
	public int getLocalidad() {
		return Localidad;
	}
	public void setLocalidad(int localidad) {
		Localidad = localidad;
	}
	public int getEmision() {
		return Emision;
	}
	public void setEmision(int emision) {
		Emision = emision;
	}
	public int getVigencia() {
		return Vigencia;
	}
	public void setVigencia(int vigencia) {
		Vigencia = vigencia;
	}
	public String getCalle() {
		return Calle;
	}
	public void setCalle(String calle) {
		Calle = calle;
	}
	
	public int getAñoReg() {
		return AñoReg;
	}
	public void setAñoReg(int añoReg) {
		AñoReg = añoReg;
	}
	public String getSexo() {
		return Sexo;
	}
	public void setSexo(String sexo) {
		Sexo = sexo;
	}
	public String toString () {
		return "\n " + Nombre + "\n " +ApellidoPat + "\n "+ ApellidoMat + "  \t \t \t \t SEXO "+ Sexo
		+ "\n DOMICILIO \n" + " C "+ Calle + " PTE "+  " MZA "+ MZ +" LT " + LT + "\n REG "+ SM + "  CP " + CP
		+ "\n "+ Municipio + " Q.ROO \n" + " CLAVE DE ELECTOR      " + ClaveElector + "\n CURP  " + Curp + 
		"       \t AÑO DE REGISTRO " + AñoReg + "\n ESTADO "+ Estado+ "\t MUNICIPIO "+ MunicipioCod+ "\t \t SECCIÓN "+ Seccion
		+ "\n LOCALIDAD "+ Localidad+ "\t EMISION "+ Emision+ "\t \t VIGENCIA "+ Vigencia;
		}
	
	
	
}
