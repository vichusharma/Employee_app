package com.example.demo;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;
@XmlRootElement(name="error")
public class ErrorResponse {

    private final String message;
    private final List<String> details;

    public String getMessage() {
        return message;
    }

    public List<String> getDetails() {
        return details;
    }

    public ErrorResponse(String message, List<String> details)
    {
        super();
        this.message=message;
        this.details=details;
    }
}
