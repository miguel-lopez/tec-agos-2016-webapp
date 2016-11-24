import grails3.cors.interceptor.SpringSecurityCorsFilter
import org.springframework.boot.context.embedded.FilterRegistrationBean
import grails3.cors.interceptor.SpringSecurityCorsFilter

beans = {
	securityCorsFilter(SpringSecurityCorsFilter)
	 myFilterDeregistrationBean(FilterRegistrationBean) {
        filter = ref('securityCorsFilter')
        enabled = false
    }
}
