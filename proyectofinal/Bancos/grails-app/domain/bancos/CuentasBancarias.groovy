package bancos


import grails.rest.*

@Resource(readOnly = false, formats = ['json', 'xml'])
class CuentasBancarias {

	String nombre
	int numeroCuenta

}