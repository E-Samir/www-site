import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import play.Application;
import play.GlobalSettings;
import play.libs.F;
import play.mvc.Http;
import play.mvc.Result;

import static play.mvc.Results.internalServerError;

/**
 * Created by user on 2/1/15.
 */
public class Global extends GlobalSettings {

	Logger logger = LoggerFactory.getLogger(Global.class);


	@Override
	public F.Promise<Result> onError(Http.RequestHeader request, Throwable t) {
		return F.Promise.<Result>pure(internalServerError(
//			views.html.index.render(t.getMessage())
		));
	}

	@Override
	public void onStart(Application app) {
	}


	@Override
	public void onStop(Application app) {
		logger.info("Application shutdown...");
	}


}
