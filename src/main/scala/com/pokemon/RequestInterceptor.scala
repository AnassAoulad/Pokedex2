package com.pokemon

import okhttp3.{Interceptor, OkHttpClient}
import okhttp3.Request
import okhttp3.RequestBody
import java.io.IOException

class RequestInterceptor implement Interceptor{

  val client = new OkHttpClient

  @throws[IOException]
  def get(url: String) = {
    val request = new Request.Builder().url(url).build
    try {
      val response = client.newCall(request).execute
      try response.body.string
      finally if (response != null) response.close()
    }
    }
  }
}

// Exemple post request