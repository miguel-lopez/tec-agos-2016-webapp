function CuentaBancaria($resource) {
    var cuentaBancaria = $resource(
        "http://localhost:8080/cuentas/:id",
        {id:'@id'},
        {
        	"update": {method: 'PUT',headers:{"Content-Type": "application/json","Access-Control-Allow-Origin":"*"}}, 
        	"save": {method:'POST',headers:{"Content-Type": "application/json","Access-Control-Allow-Origin":"*"}},
        	"listas":  {method: 'get', isArray: true,headers:{"Content-Type": "application/json","Access-Control-Allow-Origin":"*"}}
        	
        }
    );
    return cuentaBancaria;
};