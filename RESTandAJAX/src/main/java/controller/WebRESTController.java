package controller;

import datamodel.WebData;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/MyData")
public class WebRESTController {

    @RequestMapping(value="/{time}", method = RequestMethod.GET)
    public @ResponseBody WebData getMyData(
            @PathVariable long time) {

        return new WebData(time, "REST GET Call !!!");
    }

    @RequestMapping(method = RequestMethod.PUT)
    public @ResponseBody WebData putMyData(
            @RequestBody WebData md) {

        return md;
    }

    @RequestMapping(method = RequestMethod.POST)
    public @ResponseBody WebData postMyData() {
        return new WebData(
                System.currentTimeMillis(), "REST POST Call !!!");
    }

    @RequestMapping(value="/{time}", method = RequestMethod.DELETE)
    public @ResponseBody WebData deleteMyData(
            @PathVariable long time) {

        return new WebData(time, "REST DELETE Call !!!");
    }

}