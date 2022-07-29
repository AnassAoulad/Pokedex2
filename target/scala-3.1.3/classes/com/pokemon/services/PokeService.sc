// package com.pokemon.services

import com.pokemon.models.{Pokemon}
import monix.eval.Task
import com.pokemon.Http
import spray.json._
import DefaultJsonProtocol._
import com.pokemon.json.JsonFormatters._
import com.pokemon.AsyncHttp

trait PokeService {

  def getPokemon(): Seq[Pokemon]

}

trait PokeAsyncService {

  def getPokemon(): Task[Seq[Pokemon]]

}

class PokeServiceOnHttp(http: Http) extends PokeService {

  def getPokemon(): Seq[Pokemon] = {
    http.get("https://age-of-empires-2-api.herokuapp.com/api/v1/civilizations")
      .parseJson
      .asJsObject
      .fields("civilizations")
      .convertTo[Seq[Pokemon]]
  }
}

class PokeAsyncServiceOnHttp(http: AsyncHttp) extends PokeAsyncService {

  def getPokemon(): Task[Seq[Pokemon]] =
    http.get("https://age-of-empires-2-api.herokuapp.com/api/v1/civilizations")
      .map(content => content
        .parseJson.asJsObject
        .fields("civilizations")
        .convertTo[Seq[Pokemon]]
      )
}