package controllers

import play.api.mvc.{Action, Controller}

/**
  * Created by ChivonChhai on 10/11/2016.
  */
class HospitalController extends  Controller{
  def index = Action{
    Ok(views.html.hospital("hospital"))
  }
}
