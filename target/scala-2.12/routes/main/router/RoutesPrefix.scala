// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/mo/Projects/scala-tutorial/conf/routes
// @DATE:Tue Jan 29 13:39:59 GMT 2019


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
