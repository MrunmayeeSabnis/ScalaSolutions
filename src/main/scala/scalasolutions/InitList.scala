package scalasolutions

class  InitList {

  def init[A](list: List[A]): List[A] = list match {
    case Nil => Nil
    case head :: Nil => Nil
    case head :: tail => head :: init(tail)
  }
}
