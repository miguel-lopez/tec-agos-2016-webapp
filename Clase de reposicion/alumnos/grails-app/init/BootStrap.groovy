import alumnos.Alumno

class BootStrap {

    def init = { servletContext ->
    	new Alumno(matricula:'1234',salon:'1').save()
    	new Alumno(matricula:'1233',salon:'1').save()
    	new Alumno(matricula:'1235',salon:'2').save()
    
    
    }
    def destroy = {
    }
}
