package tv.sixzerofive.hello_library

/** The base object for hello_library */
case object hello_library {

  def sayHello(name: String): String = {
    return s"Hello, $name"
  }

}