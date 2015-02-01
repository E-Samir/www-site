package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

    public static Result index() {

	    return ok("<h1>Coming Soon</h1>").as("text/html");
//        return ok(index.render("render new application is ready."));
    }

}
