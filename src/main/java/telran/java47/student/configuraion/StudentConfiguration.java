package telran.java47.student.configuraion;

import org.modelmapper.ModelMapper;
import org.modelmapper.config.Configuration.AccessLevel;
import org.modelmapper.convention.MatchingStrategies;
import org.modelmapper.spi.MatchingStrategy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfiguration {

	@Bean
	ModelMapper getModelMapper() {
		ModelMapper modelMapper = new ModelMapper();
		modelMapper.getConfiguration()
		.setFieldMatchingEnabled(true)        //разришаем вставлять сразу в поля без сеторов
		.setFieldAccessLevel(AccessLevel.PRIVATE) // разрешиле даже приватные поля 
		.setMatchingStrategy(MatchingStrategies.STRICT);
		return modelMapper;
	}
}
