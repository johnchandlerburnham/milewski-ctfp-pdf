case class Reader[E, A](run: E => A)