package com.wendysa.apidemo.utility;

import com.google.gson.Gson;
import spark.ResponseTransformer;

public class JsonResponseTransformer implements ResponseTransformer {
    public String render(Object model) throws Exception {
        return new Gson().toJson(model);
    }
}