package usuario;

import java.util.Scanner;

public class Sistema {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		BaseDatos bd = new BaseDatos();
		Usuario user = new Usuario();
		int seleccion;
		System.out.println("  ---------------------------------");
		System.out.println("  ----                         ----");
		System.out.println("  ----   Bienvenido a INE      ----");
		System.out.println("  ----                         ----");
		System.out.println("  ---------------------------------");
		System.out.println(" Ingresa tus datos ");
			
			//opcion 1 para crear cuenta
				System.out.print(" Nombre: ");
				user.setNombre(teclado.next());
				System.out.print(" ApellidoPat: ");
				user.setApellidoPat(teclado.next());
				System.out.print(" ApellidoMat: ");
				user.setApellidoMat(teclado.next());
				System.out.print(" Sexo: ");
				user.setSexo(teclado.next());
				System.out.print("Domicilio");
				System.out.print("Calle : ");
				user.setCalle(teclado.next());
				System.out.print("Manzana : ");
				user.setMZ(teclado.next());
				System.out.print("Lote : ");
				user.setLT(teclado.next());
				System.out.print("Supermanzana : ");
				user.setSM(teclado.next());
				System.out.print("Código Postal : ");
				user.setCP(teclado.next());
				System.out.print("Municipio : ");
				user.setMunicipio(teclado.next());
				System.out.print("Clave de Elector: ");
				user.setClaveElector(teclado.next());
				System.out.print("Curp: ");
				user.setCurp(teclado.next());
				System.out.print("AÑO DE REGISTRO: ");
				user.setAñoReg(teclado.nextInt());
				System.out.print("Codigo Estado: ");
				user.setEstado(teclado.nextInt());
				System.out.print("Codigo Municipio : ");
				user.setMunicipioCod(teclado.nextInt());
				System.out.print("Seccion : ");
				user.setSeccion(teclado.nextInt());
				System.out.print("Localidad : ");
				user.setLocalidad(teclado.nextInt());
				System.out.print("Emision : ");
				user.setEmision(teclado.nextInt());
				System.out.print("Vigencia : ");
				user.setVigencia(teclado.nextInt());
				
				bd.RegistroUsuario(user);
				System.out.println(user);
			
				
				//System.out.print(" Curp: ");
				//user.setCurp(teclado.next());
				//bd.ConsultarUsuario(null);

		}
}
