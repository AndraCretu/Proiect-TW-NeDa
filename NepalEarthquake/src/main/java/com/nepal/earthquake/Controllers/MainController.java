package com.nepal.earthquake.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Robert on 5/6/2017.
 */

@Controller
@RequestMapping(path ="/", method = RequestMethod.GET)
public class MainController {

    @RequestMapping(path = "", method = RequestMethod.GET)
    public String defaultIndex() {
        return "index";
    }

    @RequestMapping(path = "index", method = RequestMethod.GET)
    public String index() {
        return "index";
    }

    @RequestMapping(path ="/deaths",method = RequestMethod.GET)
    public String Deaths(){return "deaths";}

    @RequestMapping(path = "/damages",method = RequestMethod.GET )
    public String Damages(){return "damages";}

    @RequestMapping(path = "/earthquake-response",method = RequestMethod.GET )
    public String EarthquakeResponse(){return "earthquake-response";}

    @RequestMapping(path = "/map",method = RequestMethod.GET )
    public String Map(){return "map";}

    @RequestMapping(path = "/earthquake-propagation",method = RequestMethod.GET )
    public String EarthquakePropagation(){return "earthquake-propagation";}

}
