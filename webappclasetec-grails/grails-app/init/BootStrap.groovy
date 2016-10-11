import mx.itesm.web.*

class BootStrap {

    def init = { servletContext ->
    	new Alumno(nombre: 'Juan',matricula:'955014',apellido: 'Velez' ).save()
    	new Alumno(nombre: 'Juan1',matricula:'dsafdfa',apellide:'Hola' ).save()
    }
    def destroy = {
    }
}
