package com.pokemon.perso

import io.circe.generic.auto.*
import io.circe.parser
import okhttp3.*
import org.json4s.jackson.JsonMethods.*
import org.json4s.{DefaultFormats, *}

import java.io.IOException
import java.net.{InetSocketAddress, Proxy}
import java.util.concurrent.TimeUnit
import java.util.{Timer, TimerTask}
import scala.concurrent.*
import scala.concurrent.duration.{DurationInt, MICROSECONDS}
import scala.language.postfixOps
import scala.util.control.NonFatal
import scala.util.{Success, Try}

case class Pokemon(name: String, hp: Int , weight: Int, attack: Int)


object Pokedex {

  def main(args: Array[String]): Unit = {

    val input =
      """
        {
         "stats": [
            {
                "base_stat": 45,
                "effort": 0,
                "stat": {
                    "name": "hp",
                    "url": "https://pokeapi.co/api/v2/stat/1/"
                }
            },
            {
                "base_stat": 49,
                "effort": 0,
                "stat": {
                    "name": "attack",
                    "url": "https://pokeapi.co/api/v2/stat/2/"
                }
            },
            {
                "base_stat": 49,
                "effort": 0,
                "stat": {
                    "name": "defense",
                    "url": "https://pokeapi.co/api/v2/stat/3/"
                }
            },
            {
                "base_stat": 65,
                "effort": 1,
                "stat": {
                    "name": "special-attack",
                    "url": "https://pokeapi.co/api/v2/stat/4/"
                }
            },
            {
                "base_stat": 65,
                "effort": 0,
                "stat": {
                    "name": "special-defense",
                    "url": "https://pokeapi.co/api/v2/stat/5/"
                }
            },
            {
                "base_stat": 45,
                "effort": 0,
                "stat": {
                    "name": "speed",
                    "url": "https://pokeapi.co/api/v2/stat/6/"
                }
            }
        ],
        "types": [
            {
                "slot": 1,
                "type": {
                    "name": "grass",
                    "url": "https://pokeapi.co/api/v2/type/12/"
                }
            },
            {
                "slot": 2,
                "type": {
                    "name": "poison",
                    "url": "https://pokeapi.co/api/v2/type/4/"
                }
            }
        ],
        "weight": 69
       }
      """.stripMargin



    val client = new OkHttpClient

    val scanner = new java.util.Scanner(System.in)
    Console.println("Chosissiez un numero")
    val choose = "1: get, 2: getall, 3: autre"
    Console.println(choose)
    val first_step = scanner.nextLine()

    /*
      val url = "https://pokeapi.co/api/v2/pokemon/35"

      val request = new Request.Builder().url(url).build
      val response = client.newCall(request).execute
      Console.println(response.body().string())
    */
    first_step match {
      case "1" =>
        Console.println("Choose a Pokemon ID")
        val line = scanner.nextLine()
        val url = "https://pokeapi.co/api/v2/pokemon/"+line
        val request = new Request.Builder().url(url).build
        val response = client.newCall(request).execute
        Console.println(response.body.string())
      case "2" =>
        Console.println("ALL ALL")
      case "3" =>
        Console.println("Autre")
    }

  }

}



