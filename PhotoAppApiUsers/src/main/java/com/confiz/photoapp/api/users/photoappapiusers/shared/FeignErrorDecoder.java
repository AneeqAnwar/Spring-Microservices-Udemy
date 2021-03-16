package com.confiz.photoapp.api.users.photoappapiusers.shared;

import feign.Response;
import feign.codec.ErrorDecoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ResponseStatusException;

@Component
public class FeignErrorDecoder implements ErrorDecoder {

    Environment environment;

    @Autowired
    public FeignErrorDecoder(Environment environment) {
        this.environment = environment;
    }

    @Override
    public Exception decode(String s, Response response) {

        switch (response.status())
        {
            case 400: {
                return new Exception(response.reason());
            }
            case 404: {
                if(s.contains("getAlbums")) {
                    return new ResponseStatusException(HttpStatus.valueOf(response.status()), environment.getProperty("albums.exceptions.albums_not_found"));
                }
            }
            default:
                return new Exception(response.reason());
        }
    }
}
