package alumnos

class UrlMappings {

    static mappings = {

        "/alumnosActivos"(controller:"Patito",action:"consultar")
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(view:"/index")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
