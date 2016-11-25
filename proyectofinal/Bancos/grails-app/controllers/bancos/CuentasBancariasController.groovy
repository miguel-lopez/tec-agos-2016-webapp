package bancos

import grails.plugin.springsecurity.annotation.Secured
import grails.rest.*
import grails.converters.*
import org.springframework.web.bind.annotation.CrossOrigin



class CuentasBancariasController extends RestfulController {

    static responseFormats = ['json', 'xml']
    CuentasBancariasController() {
        super(CuentasBancarias)
    }

    @Secured(value=['ROLE_ADMINISTRADOR'], httpMethod='GET')
    def mostrar(){
    	println "Estoy en cuentasBancarias"
    	def lista = CuentasBancarias.list()
    	println "lista"+lista
    	render  lista as  JSON
    }

}
