package modelo.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.regex.Pattern;

public class PacienteDTO extends PersonaDTO implements Serializable{

	private String fechaNacimiento;
	
	public PacienteDTO() {
	}

	public PacienteDTO(String nombre, String apellidos, String direccion, String telefono, String fechaNacimiento) {
		super(nombre, apellidos, direccion, telefono);
		this.fechaNacimiento = fechaNacimiento;
	}

	
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	@Override
	public Respuesta validarCampos(String campo, String patron, String mensaje) {
			return new Respuesta(Pattern.matches(patron,campo),mensaje);
	}

	

}
