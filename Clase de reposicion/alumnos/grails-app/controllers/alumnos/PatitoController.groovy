package alumnos

import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

import grails.converters.JSON


@Transactional(readOnly = true)
class PatitoController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def consultar() {
       def consulta = params.matricula
       def versionStr = params.version
        def alumno1 = Alumno.where{
            matricula == consulta &&
            version == versionStr
        } list()      
        render alumno1 as JSON
    }

   
}
