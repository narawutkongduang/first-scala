class FirstInherit extends FirstTrait {

  override def greet(name: String): Unit = println(s"greet $name from child")
}
