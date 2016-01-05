package scalasolutions

class DropWhile {

  def dropWhile[A](list: List[A])(f: A => Boolean): List[A] = list match {
    case Nil => Nil
    case head :: tail  if(f(head)) => dropWhile(tail)(f)
    case _ => list
  }
}
