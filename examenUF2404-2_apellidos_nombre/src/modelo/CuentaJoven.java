package modelo;

public class CuentaJoven extends Cuenta {

	private double bonificacion;
	private boolean estudiante;
	
	
	public CuentaJoven(Persona titular, double saldo, double bonificacion, boolean estudiante) {
		super(titular, saldo);
		
		if(titular.getEdad()<=26) {
			this.bonificacion = bonificacion;
			this.estudiante = estudiante;
		}else {
			this.bonificacion = 0;
			this.estudiante = false;
		}
	}


	public double getBonificacion() {
		return bonificacion;
	}


	public void setBonificacion(double bonificacion) {
		this.bonificacion = bonificacion;
	}


	public boolean isEstudiante() {
		return estudiante;
	}


	public void setEstudiante(boolean estudiante) {
		this.estudiante = estudiante;
	}


	@Override
	public String toString() {
		return "CuentaJoven [bonificacion=" + bonificacion + ", estudiante=" + estudiante + ", getTitular()="
				+ getTitular() + ", getSaldo()=" + getSaldo() + ", getCreditoMax()=" + getCreditoMax() + ", calculaIntereses()="
				+ calculaIntereses() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	public double calculaIntereses() {
		if(this.estudiante==true) {
			return super.getSaldo()*this.bonificacion*(7/100);
		}else {
			return super.getSaldo()*this.bonificacion;
		}
	}
	
	public double transferir() {
		if(super.transferir()==true) {
			return this.comision;
		}
	}	
}
