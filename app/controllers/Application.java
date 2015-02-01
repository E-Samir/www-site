package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

    public static Result index() {

	    return ok("<h1>Hello World</h1>");
//        return ok(index.render("render new application is ready."));
    }

}
