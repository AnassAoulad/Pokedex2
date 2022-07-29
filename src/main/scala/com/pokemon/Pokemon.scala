package com.pokemon

import com.pokemon.services.PokeService
import com.pokemon.services.PokeServiceOnHttp
import com.pokemon.services
import com.pokemon.services.PokeAsyncServiceOnHttp
import monix.execution.Scheduler.Implicits.global

object Pokemon {

  /**
   * API url  https://age-of-empires-2-api.herokuapp.com/api/v1/
   */

  def main(args: Array[String]): Unit =
    val pokeSvc = new PokeAsyncServiceOnHttp(http = new AsyncHttp)

    pokeSvc.getUnits()
      .runAsync {
        case Left(err) =>
          println(s"Got err: ${err.toString}")
        case Right(units) =>
          println(units.head)
      }
}
