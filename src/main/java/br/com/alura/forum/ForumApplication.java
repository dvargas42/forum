package br.com.alura.forum;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.data.web.config.EnableSpringDataWebSupport;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSpringDataWebSupport //Para ativar o pageable
@EnableCaching // Habilitar cache, acrescentar em PROD outra ferramenta como REDIS
@EnableSwagger2
public class ForumApplication {
	//extends SpringBootServletInitializer { //extensao para criar war (aqui e no POM)

	public static void main(String[] args) {
		SpringApplication.run(ForumApplication.class, args);
	}

	// @Override // metodo para ativar o war
	// protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
	// 	return builder.sources(ForumApplication.class);
	// }
}
