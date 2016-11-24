import bancos.CuentasBancarias
import bancos.*
class BootStrap {

    def init = { servletContext ->
    		new CuentasBancarias(nombre: "nombre1", numeroCuenta: 1000).save()
    		new CuentasBancarias(nombre: "nombre2", numeroCuenta: 1001).save()
    Role admin = new Role("ROLE_ADMINISTRADOR").save()
    User user = new User("admin","password").save()
    UserRole.create(user, admin,true).save()

    }
    def destroy = {
    }
}
