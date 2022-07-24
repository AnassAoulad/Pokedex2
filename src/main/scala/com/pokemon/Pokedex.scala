package com.pokemon

import okhttp3.{OkHttpClient, Request}

import scala.language.postfixOps
import scala.util.control.NonFatal
import java.io.IOException
import java.net.{InetSocketAddress, Proxy}
import okhttp3.{Call, Callback, OkHttpClient, Request, Response}
import concurrent.duration.DurationInt
import scala.concurrent.{Await, Future, Promise}
import scala.util.{Success, Try}
import com.google.guava
object Pokedex {

  //val url = "https://pokeapi.co/api/v2/pokemon/35"

  //val client : OkHttpClient = new OkHttpClient.Builder().build()

  //def asyncRequest( text : String ) : Future[ String ] = {
    //val request = new Request.Builder().url( url ).build()

    //val promise : Promise[ String ] = Promise[ String ]()
    //client.newCall( request ).enqueue( new Callback {
      //override def onFailure( call : Call, e : IOException ) : Unit = promise.failure( e )

      //override def onResponse( call : Call, httpResponse : Response ) : Unit = promise.complete( Success( "yay!!!" ) )
    //} )
    //promise.future
  //}

  val rateLimiter: Nothing = RateLimiter.create(2)
  def main(args: Array[String]): Unit = {

    // Console.println(asyncRequest())

    val url = "https://pokeapi.co/api/v2/pokemon/35"

    import okhttp3.OkHttpClient
    import okhttp3.Request
    val client = new OkHttpClient

    val request = new Request.Builder().url(url).build
    val response = client.newCall(request).execute
    // Console.println(response.body().string())

    }
}



