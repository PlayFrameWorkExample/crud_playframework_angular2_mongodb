package controllers

import play.api.mvc._

/**
  * Created by ChivonChhai on 10/11/2016.
  */
class SwaggerController  extends Controller{
  def swagger = Action {
    Ok(views.html.swagger("swagger"))
  }
}
