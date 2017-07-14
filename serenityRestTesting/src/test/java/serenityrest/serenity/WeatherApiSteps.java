package serenityrest.serenity;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import java.util.HashMap;
import java.util.Map;

public class WeatherApiSteps {
    @Step
    public void requestWheatherWithCityID(String cityId){
        Map<String, String> params = new HashMap<>();
        params.put("id", cityId);
        SerenityRest.given().contentType("application/json")
                .and().params(params)
                .when().get("api.openweathermap.org/data/2.5/weather");
    }

    @Step
    public void verifyWheatherResponse(){
        SerenityRest.then().log().all().
                statusCode(200);
    }
}
