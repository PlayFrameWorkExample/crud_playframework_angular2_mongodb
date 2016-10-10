package controllers

import play.api.mvc._

/**
  * Created by ChivonChhai on 10/10/2016.
  */
class HomeController extends Controller{

  def index = Action{
    Ok(views.html.hospital("Your new application is ready."))
  }

}
