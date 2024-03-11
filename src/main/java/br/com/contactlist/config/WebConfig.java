package br.com.contactlist.config;

import java.util.List;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import br.com.contactlist.serialization.converter.YamlJackson2HttpMesageConverter;

@Configuration /*Diz ao SpringBoot que quando ele estiver carregando a api
ele precisa ler a classe pois nela vai encontrar configurações sobre o comportamento da API */
public class WebConfig implements WebMvcConfigurer{
	
	private static final MediaType MEDIA_TYPE_APPLICATION_YML = MediaType.valueOf("application/x-yaml");

	
	@Override //Message Converter para yml
	public void extendMessageConverters(List<HttpMessageConverter<?>> converters) {
		converters.add(new YamlJackson2HttpMesageConverter());
	}

	@Override
	public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {
	/* 
	   //Implementando Content Negotiation VIA QueryParam
       //Via Query Param: http://localhost:8080/v1?mediaType=xml 
		
		//favorParameter(TRUE) aceita parametros
		configurer.favorParameter(true)
		.parameterName("mediaType").ignoreAcceptHeader(true) //Nome do parameter e Ignorar parametros no header
		.useRegisteredExtensionsOnly(false)
		.defaultContentType(MediaType.APPLICATION_JSON)
		
		   //Depois de definir o content type default, setamos os content types suportados
		.mediaType("json", MediaType.APPLICATION_JSON) //Para JSON
		.mediaType("xml", MediaType.APPLICATION_XML); //Para XML

	//Ajustamos o controller para produzir e consumir outros content type além do JSON
	}
	*/
		
		   //Implementando Content Negotiation VIA HEADER PARAM
		     //http://localhost:8080/v1

	
	configurer.favorParameter(false)
	.ignoreAcceptHeader(false) 
	.useRegisteredExtensionsOnly(false)
	.defaultContentType(MediaType.APPLICATION_JSON)
	
	   //Depois de definir o content type default, setamos os content types suportados
	.mediaType("json", MediaType.APPLICATION_JSON) //Para JSON
	.mediaType("xml", MediaType.APPLICATION_XML)//XML
	.mediaType("x-yaml", MEDIA_TYPE_APPLICATION_YML);
	}

}
