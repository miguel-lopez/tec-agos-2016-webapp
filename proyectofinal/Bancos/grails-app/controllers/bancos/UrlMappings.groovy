package bancos

class UrlMappings {

    static mappings = {
        "/cuentas"(controller:"cuentasBancarias",  method: 'OPTIONS')
        "/"(controller: 'application', action:'index')
        "500"(view: '/error')
        "404"(view: '/notFound')
    }
}
