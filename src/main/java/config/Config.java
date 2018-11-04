package config;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {


    @Bean("gson")
    public Gson gson(){
        return new GsonBuilder().create();
    }
    @Bean("gsonSerializable")
    public Gson gsonSerializableNulls() {
        return new GsonBuilder().serializeNulls().create();
    }
}
